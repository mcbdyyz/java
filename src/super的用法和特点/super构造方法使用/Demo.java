package super的用法和特点.super构造方法使用;
//继承的特点，子类中的构造方法会默认访问父类中的无参构造方法
//会默认有一个super();
public class Demo {
    public static void main(String[] args) {

        Zi z = new Zi();

        Zi z2 = new Zi(2);

    }
}
