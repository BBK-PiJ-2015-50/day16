/**
 * Created by chris on 12/22/15.
 */
import java.io.*;

public class Cat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.launch(args[0]);
    }

    public void launch (String filename) {
        File file = new File(filename);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
