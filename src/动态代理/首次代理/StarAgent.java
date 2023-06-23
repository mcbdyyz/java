package 动态代理.首次代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgent {

    /*
    * 设计一个方法来返回一个明星对象
    * */
    public static Skill getProxy(Star s){

        return (Skill)Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //真正的让Star去唱歌跳舞
                        //method 正在调用的方法对象， args 代表这个方法的参数
                        Object rs = method.invoke(s, args);
                        System.out.println("收尾款，吧Star收回来");
                        return rs;
                    }
                });
                /*
                s.getClass().getInterfaces()
                意思是先get到s的class，再get到s的Interfaces,得到了s实现的接口

                * */
    }

}
