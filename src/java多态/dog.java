package java多态;

public class dog extends Animal{
    public int age;

    @Override
    public void show() {
        System.out.println("狗吃骨头");
    }
}
