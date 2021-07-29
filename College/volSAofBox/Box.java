
import java.util.*;

public class Box {
	private static Scanner sc;

	public static void main(String[] args) {
		
		float length, width, height;
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Length, Width & Height of a Cuboid : ");
		length = sc.nextFloat();
		width = sc.nextFloat();
		height = sc.nextFloat();
		VolumeOfCuboid (length, width, height); 	

	}
	 public static void VolumeOfCuboid (float length, float width, float height) {
		float SA,Volume;
		SA = 2 * (length * width + length * height + width * height);
		Volume = length * width * height;

		System.out.println("\n The Surface area of a Cuboid = "+ SA);
		System.out.println("\n The Volume of a Cuboid = "+ Volume);
	}
}
