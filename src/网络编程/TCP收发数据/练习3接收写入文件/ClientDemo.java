package 网络编程.TCP收发数据.练习3接收写入文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket sk = new Socket("127.0.0.1",10086);
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        while(true){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.equals("886")){
                break;
            }


            br.write(s);
            br.newLine();
            br.flush();
        }

        sk.close();

    }
}
