package 网络编程.TCP收发数据.练习2键盘录入;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("127.0.0.1",10086);

//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine())!=null) {
            if(line.equals("886")){
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
