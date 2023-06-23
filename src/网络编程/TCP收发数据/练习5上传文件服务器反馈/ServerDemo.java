package 网络编程.TCP收发数据.练习5上传文件服务器反馈;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 接收客户端文件，并反馈，文件存入本地
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket sk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\网络编程\\TCP收发数据\\练习5上传文件服务器反馈\\Eiysa.txt"));

        String line;
//        boolean f=false;
        while((line =br.readLine())!=null){//todo 这里会一直等待读取数据，因为服务器不知道客户端内容是否传完
//            if(line.equals("886")){
//                break;
//            }
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
//            f=true;

        }


        BufferedWriter rbw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        rbw.write("文件已接收");
        rbw.newLine();
        rbw.flush();


        bw.close();
        ss.close();
    }


}

