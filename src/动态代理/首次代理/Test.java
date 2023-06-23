package 动态代理.首次代理;

public class Test {
    //目标:学习开发出一个动态代理的对象出来
    public static void main(String[] args) {
        Star s = new Star("明星");
//        s.jump();
//        s.sing();
        Skill proxy = StarAgent.getProxy(s);
        proxy.jump();
    }
}
