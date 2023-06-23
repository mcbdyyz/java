package IO流.File类.字符流;

import java.io.*;
import java.util.Arrays;

/**
 *  写入数据五种方法
 *      void write (int c):写一个字符
 *      void write (char[] cbuf):写入一个字符数组
 *      void write (char[] cbuf,int off,int len):写入字符数组的一部分
 *      void write(String str):写入一个字符串
 *      void write (String str ,int off ,int len):写入一个字符串的一部分
 * */
public class WriteData {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\IO流\\File类\\字符流\\write.txt"));
        osw.write(97);//这个时候要刷新流才能看到录入的数据，因为这个会有一个缓冲
        osw.flush();//刷新流

        osw.write("\r\n");
        System.out.println();

        char[]  c = {'a','b','y','y','z'};
        osw.write(c);
        osw.write("\r\n");
        osw.write(c,0,c.length);//off是指从第几个开始，到c.lenght的长度

        osw.close();//关闭流，但会自动先刷新再关闭

        read();

        FileWrite();

        BufRW();
    }/**
     int read():一次读一个字符数据
     int read(char[] cbuf):读一个字符数组的数据
     */
    public static void read() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\IO流\\File类\\字符流\\write.txt"));
        int b;

        b = isr.read();
        System.out.println((char)b);

        char[] c = new char[1024];
        int by;
        while ((by = isr.read(c))!=-1){
            System.out.println(new String(c,0,by));
        }
        isr.close();
    }
    /**简化的字符输入输出流对象：FileWriter
     *                      FileReader
     * */
    public static void FileWrite() throws IOException{
        FileReader fr = new FileReader("src\\IO流\\File类\\字符流\\write.txt");
        FileWriter fw = new FileWriter("src\\IO流\\File类\\字符流\\write.txt",true);
        int b;
        while((b= fr.read())!= -1){
            System.out.print((char) b);
        }

        fw.write("幽幽子学会了新的写入");
        fr.close();
        fw.flush();
        fw.close();
    }
    /**字符缓冲流：
     *  BufferedWriter:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以一直指定缓冲区的大小
     *  或者可以接受默认大小，默认值足够大，可用于大多数用途
     *
     *  BufferedReader：从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，或者可以使用默认大小，
     *  默认大小足够大，可用于大多数用途
     * */
    public static void BufRW() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\IO流\\File类\\字符流\\write.txt"));
        String b = br.readLine();
        while (b != null){
            System.out.println(b);
            b = br.readLine();
        }

        int by;
        while ((by = br.read())!=-1){
            System.out.print((char)by);
        }
        br.close();
    }
}
