package 网络编程.UDP收发数据;

import java.io.IOException;
import java.net.*;

/**
 * 端口：设备上应用程序的唯一标识
 *     端口号用两个字节标识的整数，它的取值范围是0-65535，其中，0-1023之间的端口号
 *     普通应用程序要使用1024以上的端口号，如果端口号被占用，就启动失败
 *
 * UDP协议：
 *      用户数据报协议（User Datagram Protocol)
 * TCP协议：
 * */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        UDPSend();
    }
//udp发送数据
    public static void UDPSend() throws IOException{
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包
        //DatagramPacket(byte[] buf,int length,InetAddress address,int port)
        //构造一个数据报，发送长度为length的数据包到指定主机上的指定端口号。
        byte[] bys = "886".getBytes();
//        int length = bys.length;
//        InetAddress byName = InetAddress.getByName("127.0.0.1");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,byName,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.31.84"),10086);


        //发送
        //void send(DatagramPacket p)从此套
        ds.send(dp);
        //关闭
        ds.close();
    }
}
