package 抽象类和抽象方法;

public class Cat extends Animal{
    //重写Animal的抽象，每有一个抽象方法，要么自身也变成抽象的类，要么就要重写每一个方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
