import java.io.File;
import java.util.Arrays;

public class Ls {

    public static void main(String[] args) {
        Ls fileList = new Ls();
        fileList.launch();
    }

    public void launch() {
        File currentDir = new File(".");
        // Locate home directory using System Properties
        File homeDir = new File(System.getProperty("user.home"));
        // Print using handy Arrays.toString() method
        System.out.println("CURRENT DIRECTORY");
        System.out.println(Arrays.toString(currentDir.list()));
        System.out.println();
        // Print using enhanced for loop
        for(String path:currentDir.list()) {
            System.out.println(path);
        }
        System.out.println("HOME DIRECTORY");
        System.out.println(Arrays.toString(homeDir.list()));
    }
}
