package 网络编程.TCP收发数据.练习4收发文本文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1",10086);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("src\\网络编程\\TCP收发数据\\练习3接收写入文件\\Eiysa.txt"));

        String line;
        while((line =br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        sk.close();
    }
}
