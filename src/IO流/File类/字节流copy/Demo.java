package IO流.File类.字节流copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream读取数据->然后把读的数据用FileOutputStream写入
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\IO流\\File类\\字节流copy\\read.txt");

        FileOutputStream fos = new FileOutputStream("src\\IO流\\File类\\字节流copy\\write.txt");
        int by;

        while((by =fis.read()) != -1){
            fos.write(by);
        }
        fis.close();
        fos.close();

        CopyPhoto();

    }
    /**
     * 复制照片，用字节数组的方法
     * */
    public static void CopyPhoto() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\Photo\\touxiang.jpg");

        FileOutputStream fos = new FileOutputStream("src\\IO流\\File类\\字节流copy\\touxiang.jpg");
        byte[] by  = new byte[1024];
        int b;
        while((b=fis.read(by))!=-1){
            fos.write(by,0,b);
        }
        fis.close();
        fos.close();
    }

}
