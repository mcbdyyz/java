package java多态;

/**
 * 多态的体现前提，1.有继承/实现关系
 * 2.有方法重写
 * 3.有父类引用指向子类对象
 * 成员变量：编译看左边，执行看左边
 * 成员方法：编译看左边，执行看右边，因为成员方法有重写
 *
 *多态的好处
 * 可以提高程序的扩展性，在编写程序的时候可以用使用类来直接调用父类方法来实现子类中的各个功能
 * 多态的坏处
 * 在使用子类的方法时只能使用父类中定义的方法，
 *
 * */
public class Demo {
    public static void main(String[] args) {
        //这个写法是父类引用指向子类对象，
        Animal s = new Cat();
        System.out.println(s.age);
//        System.out.println(s.name);//虽然在cat中有name，但是在Animal中没有name成员变量，

        s.show();//这个的输出是cat中的重写的方法
//        s.eat();//在cat中有eat方法，但是Animal中没有eat方法

        AnimalUser ss = new AnimalUser();//实例化user方法
        Cat cat = new Cat();//实力化Cat方法
        ss.userDemo(cat);//传入cat，cat是Animal类的子类，它重写了animal中的类，

        //还可同时传入dog子类
        dog d = new dog();
        ss.userDemo(d);//这里依旧运行成功了dog的重写方法

    }
}
