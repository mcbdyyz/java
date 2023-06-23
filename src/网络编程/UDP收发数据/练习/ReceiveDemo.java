package 网络编程.UDP收发数据.练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1314);
        while(true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();
            String s = new String(data,0,length);
            System.out.println(s);
            if(s.equals("886")){
                System.out.println("程序结束");
                System.exit(0);
            }
        }
    }
}
