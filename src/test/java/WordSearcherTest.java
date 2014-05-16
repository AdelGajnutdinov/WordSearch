import junit.framework.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Адель on 16.05.14.
 */
public class WordSearcherTest {

    private WordSearcher ws;
    private FileCompare fc;
    private BufferedReader mainreader;
    private BufferedReader[] readers = new BufferedReader[2];
    private PrintWriter writer;

    @Test
    public void testRun() throws Exception {
        mainreader = new BufferedReader(new InputStreamReader(new FileInputStream("input1.txt")));

        writer = new PrintWriter("testout1.txt");
        ws = new WordSearcher("for", mainreader, writer);
        ws.run();
        readers[0] = new BufferedReader(new InputStreamReader(new FileInputStream("out1.txt")));
        readers[1] = new BufferedReader(new InputStreamReader(new FileInputStream("testout1.txt")));
        fc = new FileCompare(readers[0], readers[1]);
        Assert.assertTrue(fc.equals());
        writer.close();
        readers[0].close();
        readers[1].close();

        writer = new PrintWriter("testout2.txt");
        ws = new WordSearcher("hash table", mainreader, writer);
        ws.run();
        readers[0] = new BufferedReader(new InputStreamReader(new FileInputStream("out2.txt")));
        readers[1] = new BufferedReader(new InputStreamReader(new FileInputStream("testout2.txt")));
        fc = new FileCompare(readers[0], readers[1]);
        Assert.assertTrue(fc.equals());
        writer.close();
        readers[0].close();
        readers[1].close();

        writer = new PrintWriter("testout3.txt");
        ws = new WordSearcher("implementation", mainreader, writer);
        ws.run();
        readers[0] = new BufferedReader(new InputStreamReader(new FileInputStream("out3.txt")));
        readers[1] = new BufferedReader(new InputStreamReader(new FileInputStream("testout3.txt")));
        fc = new FileCompare(readers[0], readers[1]);
        Assert.assertTrue(fc.equals());
        writer.close();
        readers[0].close();
        readers[1].close();

        mainreader.close();
    }
}
