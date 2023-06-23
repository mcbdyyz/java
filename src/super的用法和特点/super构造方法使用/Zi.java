package super的用法和特点.super构造方法使用;

public class Zi extends Fu{
    public int age = 0;

    public Zi(){
        System.out.println("zi中无参构造方法被调用");
    }
    public Zi(int age){
        System.out.println("zi中有参构造方法被调用");
    }
}
