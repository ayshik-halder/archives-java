import java.util.*;

/**
 * SumAddArray
 */
class SumAddArray1 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        System.out.println("Enter the input(Press Escape and Enter to exit):");
        Scanner sc = new Scanner(System.in);
        try {
            while (sc.hasNextInt()) {
                l.add(sc.nextInt());
            }
            for (int i = 0; i < l.size(); i++) {
                sum = sum + l.get(i);
            }
            avg = sum / (l.size());
            System.out.println("Average is :" + avg);
        } finally {
            sc.close();
        }
    }
}