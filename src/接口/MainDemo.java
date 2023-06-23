package 接口;
/**
 * 接口关键修饰词是 interface
 * 接口实现使用implements表示
 * public 类名 implements 接口名{}
 * 接口不能实例化，参照多态的方法，通过实现对象类实例化，这叫接口多态
 * */
public class MainDemo {
    public static void main(String[] args) {
        //实现接口
        Junmp j = new Cat();
        j.eat();

        //TODO 向下转型来使用Cat中的方法
        Cat c = (Cat)j;
        c.eat();
        c.play();

        // todo 接口中设置的常量可以直接类名.常量名 来调用
        System.out.println(Junmp.num);
        int sd = Junmp.num2;
        System.out.println(sd);
    }
}
