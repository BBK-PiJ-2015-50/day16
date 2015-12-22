import java.io.*;

public class MkDir {

    public static void main(String[] args) {
        File newDirectory = new File(args[0]);
        newDirectory.mkdir();
    }
}
