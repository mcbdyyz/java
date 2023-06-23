package 网络编程.UDP收发数据;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        //创建一个数据包用来接受数据
        byte[]  bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //调用DatagramSocket 对象的方法接受数据
        ds.receive(dp);

        //解析数据包，并把数据再控制台显示
        //byte[] getData()：返回数据缓冲区
        byte[] data = dp.getData();
        int length = dp.getLength();

        String s = new String(data,0,length);
        System.out.println(s);
        //关闭
        ds.close();
    }
}
