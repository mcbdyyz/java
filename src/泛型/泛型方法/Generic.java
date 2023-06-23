package 泛型.泛型方法;
/**
 * 在方法调用的地方添加泛型属性，<T>,
 * */
public class Generic {
    public <T> void show(T t){
        System.out.println(t);
    }
}
