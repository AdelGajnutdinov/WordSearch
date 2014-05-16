import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Адель on 16.05.14.
 */
public class FileCompare {

    private BufferedReader file1;
    private BufferedReader file2;

    /**
     * Constructor
     * @param file1 first file
     * @param file2 second file
     */
    public FileCompare (BufferedReader file1, BufferedReader file2) {
        this.file1 = file1;
        this.file2 = file2;
    }

    /**
     * Main metod, which compare two files
     * @return true or false
     */
    public boolean equals () throws IOException {
        String s = file1.readLine();
        String s2 = file2.readLine();
        while ((s != null) || (s2 != null)) {
            if (s.equals(s2))
                ;
            else {
                return false;
            }
            s = file1.readLine();
            s2 = file2.readLine();
        }
        if ((s == null) && (s2 == null)) {
            return true;
        }
        else {
            return false;
        }
    }

}
