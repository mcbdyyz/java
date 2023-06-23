package TwoTest.imp;

import TwoTest.MyServer;

public class serverImp implements MyServer {
    @Override
    public void server() {
        System.out.println("实现了server接口的服务");
    }
}
