package IO流.File类.字节缓冲流;

import java.io.*;

/**
 * 字节缓冲流：
 *      BufferOutputStream:该类实现缓冲输出流，通过设置这样的输出流，应用程序可以向底层输出流写入字节，
 *      而不必为写入的每一个字节导致底层系统的调用
 *      BufferedInputStream:创建BufferedInputStream将创建的一个内部缓冲数组，当从流中读取或跳过字节时，内部
 *      缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节；
 *
 *      构造方法：
 *      BufferedOutputStream(OutputStream out)
 *      BufferedInputStream(InputStream in)
 *      字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作
 * */
public class Demo {
    public static void main(String[] args) throws IOException{
        WriteData();
        readData();
    }
    /**
     * 缓冲写数据
     * */
    public static void WriteData() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\IO流\\File类\\字节缓冲流\\Test.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        bos.close();
    }
    /**
     * 缓冲读数据
     * */
    public static void readData() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\IO流\\File类\\字节缓冲流\\Test.txt"));
        int by;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }
        bis.close();
    }
}
