package 网络编程.TCP收发数据.练习4收发文本文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket sk = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\网络编程\\TCP收发数据\\练习4收发文本文件\\Eiysa.txt"));

        String line;
        while ((line =br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        ss.close();
    }
}
