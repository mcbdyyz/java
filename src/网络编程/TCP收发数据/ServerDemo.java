package 网络编程.TCP收发数据;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept():侦听要链接到此套结字并接收它
        Socket accept = ss.accept();

        InputStream inputStream = accept.getInputStream();

        byte[] bys = new byte[1024];
        int b;
        while((b=inputStream.read(bys))!=-1){
            System.out.println("收到"+new String(bys,0,b));
        }


        accept.close();
        ss.close();


    }
}
