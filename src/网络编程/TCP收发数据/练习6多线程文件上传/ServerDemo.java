package 网络编程.TCP收发数据.练习6多线程文件上传;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        while(true) {
            Socket sk = ss.accept();

            new Thread(new ServerSock(sk)).start();
        }
    }
}
