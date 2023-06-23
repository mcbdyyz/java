package 特殊操作流.打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 字节打印流：PrintStream
 * 字符打印流：PrintWriter
 *      字节打印流：
 *      PrintStream (String fileName):使用指定的文件名创建新的打印流
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("src\\特殊操作流\\打印流\\test.txt");
        //当文件不存在，会自动创建文件
        //写数据
        //字节输出流有的方法
        ps.write(97);
        //使用特有方法写数据
        ps.print("这样可以写入东西");
        method();
        ps.close();
    }
    /**
     * 字符打印流构造方法：
     *      PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
     *
     *      PrintWriter(Writer out,boolean autoFlush):创建一个新的PrintWriter
     *                  out 字符输出流
     *                  autoFlush：一个布尔值，如果为真，则println,printf,format方法将刷新输出缓冲区
     * */
    public static void method() throws IOException{
        //这种方法不会自动刷新，
        PrintWriter pw = new PrintWriter("src\\特殊操作流\\打印流\\pw.txt");
//        pw.write("hello");
//        pw.flush();
        //也可以用print等方法

        pw.print("这也能写入东西啊");
        pw.println();
        pw.println("西行寺幽幽子");

        pw.close();
        //PrintWriter(Writer out,boolean autoFlush):创建一个新的PrintWriter
        PrintWriter pw1 = new PrintWriter(new FileWriter("src\\特殊操作流\\打印流\\pw.txt"),true);
        pw1.println("这样会自动刷新咯");
    }
}
