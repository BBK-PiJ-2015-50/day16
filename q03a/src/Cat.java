/**
 * Created by chris on 12/22/15.
 */
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Cat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.launch(args[0]);
    }

    public void launch (String filename) {
        File file = new File(filename);
        // Now using try with resources
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
