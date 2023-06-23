package java多态;

public class Cat extends Animal{
    public String name;
    public int age;
    public int weight;
    @Override
    //这里重写了Animal里面的show()方法，
    public void show(){
        System.out.println("猫パンチ");
    }


    //这里的方法在调用animal后是无法使用的
    //这里是子类的特有方法，在多态的方法使用时是无法调用的
    public void eat(){
        System.out.println("鱼");
    }
}
