import java.io.*;

public class stream1 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/ayshikhalder/Downloads/java/stream/characterStream/source.txt");
        FileReader r = new FileReader(f);
        char chars[] = new char[(int) f.length()];
        r.read(chars);
        File out = new File("/Users/ayshikhalder/Downloads/java/stream/characterStream/destination.txt");
        FileWriter w = new FileWriter(out);
        w.write(chars);
        w.flush();
        System.out.println("Data successfully written in the specific field");
        r.close();
        w.close();
    }
}

