package 网络编程.TCP收发数据.练习6多线程文件上传;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1",10086);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("src\\网络编程\\TCP收发数据\\练习6多线程文件上传\\Elysia.txt"));
        String line;
        while((line =br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        sk.shutdownOutput();

        BufferedReader rbr = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String line2 = rbr.readLine();
        System.out.println(line2);
    }
}
