package 网络编程.TCP收发数据.练习5上传文件服务器反馈;

import java.io.*;
import java.net.Socket;
/**
 * 向服务器发送文本文件，并接收服务器的反馈
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk= new Socket("127.0.0.1",10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("src\\网络编程\\TCP收发数据\\练习3接收写入文件\\Eiysa.txt"));

        String line;
        while((line = br.readLine())!= null){
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        sk.shutdownOutput();

        BufferedReader rbr = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String rline;
        rline =rbr.readLine();
            System.out.println("服务器:"+rline);

        bw.close();
        sk.close();


    }
}
