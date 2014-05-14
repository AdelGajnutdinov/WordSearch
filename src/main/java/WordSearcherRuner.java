import java.io.*;

/**
 * Created by Адель on 14.05.14.
 */
public class WordSearcherRuner {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input1.txt")));
        PrintWriter writer = new PrintWriter("out1.txt");

        WordSearcher ws = new WordSearcher("time", reader, writer);
        ws.run();
        reader.close();
        writer.close();
    }
}
