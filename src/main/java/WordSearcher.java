import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Адель on 14.05.14.
 */
public class WordSearcher {

    BufferedReader reader;

    PrintWriter writer;

    String word;

    int count = 0;//how many times word was found

    double temp = 0;//position of word

    /**
     * Constructor
     * @param string what word we need to search
     * @param reader from which stream
     * @param writer to which stream
     */
    public WordSearcher(String string, BufferedReader reader,PrintWriter writer) {
        this.word = string;
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Main metod
     * @throws IOException
     */
    public void run() throws IOException {
        read();
        if (count == 0)
            writer.println("Word \"" + word + "\" is not found!");
    }

    private void read() throws IOException {
        String s = reader.readLine();
        while (s != null) {
            search(word, s);
            s = reader.readLine();
        }
    }

    private void search(String word, String s) {
        for (int i = 0; i < s.length() - word.length(); i++) {
            if ((s.substring(i, i + word.length()).equals(word))) {
                //&& (s.charAt(i-1) == ' ')
                //&& (s.charAt(i + word.length()) == ' ')) {
                writer.println("Word \"" + this.word + "\" is found on the " + (i + temp + 1) + " position!");
                count++;
            }
        }
        temp += s.length() + 1;
    }

}
