package 接口.运动员与教练案例;
// todo 教练抽象方法
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
