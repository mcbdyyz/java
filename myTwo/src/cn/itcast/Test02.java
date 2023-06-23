package cn.itcast;

import TwoTest.MyServer;

import java.util.ServiceLoader;

/**
 * ServiceLoader:一种加载服务实现的工具
 * */
public class Test02 {
    public static void main(String[] args) {
        ServiceLoader<MyServer> myServers = ServiceLoader.load(MyServer.class);
        //遍历服务
        for (MyServer myServer : myServers) {
            myServer.server();

        }
    }
}
