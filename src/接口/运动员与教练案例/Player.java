package 接口.运动员与教练案例;
// todo 运动员抽象类
public abstract class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void stud();
}
