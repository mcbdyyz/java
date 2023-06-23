package 网络编程.TCP收发数据.练习1收发反馈;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        //监听
        Socket accept = ss.accept();
        //接收数据
        InputStream inputStream = accept.getInputStream();
        byte[] bys = new byte[1024];
        int b;
         b = inputStream.read(bys);
        System.out.println(new String(bys,0,b));

        //给出反馈
        OutputStream os = accept.getOutputStream();
        os.write("数据已经收到".getBytes());

        ss.close();

    }
}
