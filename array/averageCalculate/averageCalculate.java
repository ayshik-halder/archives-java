
public class averageCalculate {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 25};
        int sum = 0;
        double avg;
        System.out.println("Printing the array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        avg = (double) sum / (myArray.length);
        System.out.println("The Average is:" + avg);
    }
}
