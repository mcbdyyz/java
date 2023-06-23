package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络编程三要素
 *      ip地址，端口，协议
 *
 *      InetAddress:表示Internet协议地址
 *          static InetAddress getByName(String host):确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
 *          String getHostName():获取此IP地址的主机名
 *          String getHostAddress（）：返回文本显示中的Ip地址字符串
 * */
public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress byAddress = InetAddress.getByName("LAPTOP-MRAIMRS7");
        InetAddress byAddress = InetAddress.getByName("127.0.0.1");
        String hostName = byAddress.getHostName();
        String hostAddress = byAddress.getHostAddress();
        System.out.println("主机名："+hostName);
        System.out.println("ip地址："+hostAddress);


    }
}
