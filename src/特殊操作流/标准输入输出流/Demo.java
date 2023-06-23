package 特殊操作流.标准输入输出流;

import java.io.*;

/**
 * System
 *  Static PrintStream err 标准错误输出流
 *  Static InputStream in 标准输入流,通常对应于键盘输入或由主机环境或用户指定的另一个输入源
 *  Static PrintStream out 标准输出流 此流对应于显示输出或由主机环境或用户指定的另一个输出目标
 *
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        //public Static final InputStream in 标准输入流
        InputStream in = System.in;//InputStream是一个字节流输入流的抽象基类，这里以多态形式初始化in，
//        int by;
//        while((by = in.read())!=-1){
//            System.out.print((char)by);
//        }
        //把字节流转换为字符流，并用一次读一行的方法，这个方法是字符缓冲流特有的所有为一下方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        while(s!=null){
            System.out.println(s);
             s = br.readLine();
        }
    }
    public static void method(){
        //public Static final PrintStream out 标准输出流
        PrintStream out = System.out;
        out.print("hello");
        out.print(100);

        System.out.println();
    }

}
