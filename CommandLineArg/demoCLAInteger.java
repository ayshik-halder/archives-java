import java.util.IllegalFormatException;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class demoCLAInteger {
    public static void main(String[] args) {

        try {
            if (args.length > 0) {
                for (int i = 0; i < args.length; i++) {
                    System.out.printf("Arg[%d]: %d", i, Integer.parseInt(args[i]));
                }
            } else {
                System.out.println("No Command Line arguments passed");
            }

        } catch (NumberFormatException numberFormatException) {
            System.out.println("Program only supports Command Line Arguments as Integers!!!");
        } catch (IllegalFormatException illegalFormatException) {
            System.out.println("Program only supports Command Line Arguments as Integers!!!");
        }
    }
}
 