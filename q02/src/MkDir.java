import java.io.File;

public class MkDir {

    public static void main(String[] args) {
        //File newDirectory = new File(args[0]);
        new File(args[0]).mkdir();
    }
}
