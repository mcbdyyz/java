package IO流.File类.遍历所有目录;

import java.io.File;

/**
 *
 * */
public class Demo {
    public static void main(String[] args) {
        File file = new File("D:\\javaFile测试");
        reFile(file);

    }
    public static void reFile(File file){
        File[] files = file.listFiles();
        assert files !=null;
        for(File f :files){
            if(f.isDirectory()){
                System.out.println(f+"<-目录");
                 reFile(f);

            }else{
                System.out.println(f.getAbsolutePath());

            }
        }

    }

}
