package 抽象类和抽象方法;
/**
 * 抽象类就是一个没有完成的类，abstract定义方法
 * */
public class skip {
    public static void main(String[] args) {
        //用多态的方法，向上转换执行抽象类的方法，
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
