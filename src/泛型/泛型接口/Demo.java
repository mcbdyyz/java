package 泛型.泛型接口;
/**
 * 定义格式：
 *      修饰符 interface 接口名<类型>{}
 *
 * 给接口定义泛型类型
 * */
public class Demo {
    public static void main(String[] args) {

        Generic<Object> g = new GenericImp<>();
        g.show("uuz");
        g.show(114514);
        g.show(true);

        System.out.println("------------");

        Generic<String> g2 = new GenericImp<>();
//        g2.show(114514);todo 被限制
        g2.show("xxsuuz");

    }
}
