package 抽象类和抽象方法;

public abstract class Animal {
    private int age = 10;
    private final String  city = "sf";
    //抽象方法
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
