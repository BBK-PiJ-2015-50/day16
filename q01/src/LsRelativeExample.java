import java.io.File;
import java.util.Arrays;

public class LsRelativeExample {

    public static void main(String[] args) {
        LsRelativeExample fileList = new LsRelativeExample();
        fileList.launch();
    }

    public void launch() {
        File currentDir = new File("../../../day17");
        System.out.println(Arrays.toString(currentDir.list()));
    }
}
