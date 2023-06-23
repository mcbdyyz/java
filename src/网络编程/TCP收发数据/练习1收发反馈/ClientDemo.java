package 网络编程.TCP收发数据.练习1收发反馈;

import java.io.*;
import java.net.Socket;
/**
 * 客户端,发送数据，接收服务器反馈
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1",10086);
        //发送数据
        OutputStream os = sk.getOutputStream();
        os.write("hello,有听到吗".getBytes());

        //接收数据
        InputStream is = sk.getInputStream();
        byte[] bys = new byte[1024];
        int b;
        b=is.read(bys);
        System.out.println(new String(bys,0,b));


//        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
//        String s;
//        s=br.readLine();
//        System.out.println(s);


        sk.close();
    }
}
