package 网络编程.UDP收发数据.练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        int m =0;
        while(true) {
            Scanner s = new Scanner(System.in);
            String s1 = s.nextLine();
            byte[] bys = s1.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"),1314);

            ds.send(dp);


            m++;
            if(m>5) {
                break;
            }
        }
        ds.close();
    }
}
