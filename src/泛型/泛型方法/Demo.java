package 泛型.泛型方法;
/**
 * 泛型方法
 *  格式：修饰符<类型> 返回值类型 方法名(类型 变量名){}
 *
 * */
public class Demo {
    public static void main(   String[] args) {
        //实例化Generic方法
        Generic g = new Generic();
        //todo 这样传入的数据不在被类型限制
        g.show("uuz");
        g.show(114514);
        g.show(true);
    }
}
