import java.io.File;
import java.util.*;

public class wswTest {
    public static void main(String[] args) {
        File srcfile = new File("D:\\yyzCopy");
        File descfile = new File("D:\\yyzCopy");
        filewlujing(srcfile);
    }
    public static void filewlujing(File srcfile){
        File[] files = srcfile.listFiles();
        String s= srcfile.getName();
        for (File f:files){
            if(f.isDirectory()){
                 s = s + "\\" + f.getName();
                File newfile = new File(srcfile,f.getName());
                filewlujing(newfile);
            }

        }
        System.out.println(s);
    }
}
