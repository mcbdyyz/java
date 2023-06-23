package 网络编程.TCP收发数据.练习6多线程文件上传;

import java.io.*;
import java.net.Socket;

public class ServerSock implements Runnable{
    private Socket sk;

    public ServerSock(Socket sk) {
        this.sk = sk;
    }

    @Override
    public void run() {
        //接收数据写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\网络编程\\TCP收发数据\\练习6多线程文件上传\\ServerElysia.txt"));
            //解决名称问题
            int count =0;
            File f = new File("src\\网络编程\\TCP收发数据\\练习6多线程文件上传\\ServerElysia["+count+"].txt");
            while(f.exists()){
                count++;
                f = new File("src\\网络编程\\TCP收发数据\\练习6多线程文件上传\\ServerElysia["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //反馈
            BufferedWriter rbw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
            rbw.write("接收成功");
            rbw.newLine();
            rbw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
