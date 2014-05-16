import java.io.*;

/**
 * Created by Адель on 14.05.14.
 */
public class WordSearcherRuner {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input1.txt")));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("out3.txt")));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream("testout3.txt")));
        PrintWriter writer = new PrintWriter("testout3.txt");
        FileCompare fc;

        WordSearcher ws = new WordSearcher("implementation", reader, writer);
        ws.run();
        reader.close();
        writer.close();
        fc = new FileCompare(reader2, reader3);
        System.out.println(fc.equals());
        reader2.close();
        reader3.close();
    }
}
