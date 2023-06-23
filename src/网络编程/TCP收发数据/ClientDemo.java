package 网络编程.TCP收发数据;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的socket对象
        //Socket (InetAddress Address,int port)创建流套接字并将其链接到指定IP地址的指定端口号
//        Socket s = new Socket(InetAddress.getByName("192.168.31.1"),10000);

        //Socket (String host,int port):创建流套接字并将其链接到指定主机上的指定端口号
        Socket s2 = new Socket("127.0.0.1",10000);

        OutputStream outputStream = s2.getOutputStream();
        outputStream.write("Tcp我来辣".getBytes());

        s2.close();
    }
}
