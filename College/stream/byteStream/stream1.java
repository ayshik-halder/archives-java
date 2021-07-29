import java.io.*;

public class stream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/Users/ayshikhalder/Downloads/java/stream/byteStream/source.txt");
            out = new FileOutputStream("/Users/ayshikhalder/Downloads/java/stream/byteStream/destination.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            
            if (in != null)
                in.close();
            if (out != null)

                out.close();
                System.out.println("Data successfully written in the specific field");
        }
    }
}

