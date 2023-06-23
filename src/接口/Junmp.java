package 接口;
/**
 * 接口自带常量static +final修饰
 * 任何类都会默认继承Object父类，哪怕他实现接口也会同时继承Object
 * 3.接口里面的方法自带 public abstract,
 * */
public interface Junmp {
    public int num = 10;
    public final int num2 = 12;

    public void eat(); //todo 有抽象方法

//    public Junmp(){} //todo 接口没有构造方法

//    public void show(){} //todo 接口里面只有抽象成员方法，
}
