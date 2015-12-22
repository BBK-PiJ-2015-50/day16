import java.io.*;
import java.util.Arrays;

public class Ls {

    public static void main(String[] args) {
        Ls fileList = new Ls();
        fileList.launch();
    }

    public void launch() {
        // Using Simon's suggestion to locate user directory
        // File dir = new File(System.getProperty("user.dir"));
        // Keith's line
        File dir = new File(".");
        // Print using handy Arrays.toString() method
        System.out.println(Arrays.toString(dir.list()));
        System.out.println();
        // Print using enhanced for loop
        for(String path:dir.list()) {
            System.out.println(path);
        }
    }
}
