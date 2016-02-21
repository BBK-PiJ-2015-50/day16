/**
 * Created by chris on 12/22/15.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cp {

    public static void main(String[] args) {
        Cp cp = new Cp();
        if (args.length == 2) {
            cp.launch(args[0], args[1]);
        }
        else {
            System.out.println("You didn't enter 2 filenames! Source & Destination");
        }
    }

    public void launch(String source, String destination) {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        if (destinationFile.exists()) {
            System.out.print("Overwrite " + destination + " - Y/N?: ");
            if (! new Scanner(System.in).nextLine().toUpperCase().equals("Y")) {
                System.out.println(("OK - file won't be copied"));
            } else {
                try (BufferedReader in = new BufferedReader(new FileReader(sourceFile));
                    PrintWriter out = new PrintWriter(destinationFile)) {
                    String line;
                    while ((line = in.readLine()) != null) {
                        out.println(line);
                    }
                    System.out.println(source + " copied to " + destination);
                } catch (FileNotFoundException ex) {
                    System.out.println("Source file >>" + source + "<< does not exist!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            System.out.println("Destination file >> " + destination + "<< doesn't exist!");
        }
    }
}