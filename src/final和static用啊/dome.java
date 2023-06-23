package final和static用啊;
//final和static类似，在修饰一个变量的时候，如果加了final就会变成常量无法改变，如果类被final修饰，则就不能有子类等
//static一个静态的类，存在的时间十分长,且会变成共享的，
public class dome {
    public static void main(String[] args) {
        final Fu s = new Fu();//final 修饰引用类型，则s的地址值不能改变
        //例如：s = new Fu();
        s.age =122;

        System.out.println(s.age);
    }
}
