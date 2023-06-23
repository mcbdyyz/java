package 接口.运动员与教练案例;

public class bPlayer extends Player{
    public bPlayer() {
    }

    public bPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void stud() {
        System.out.println("篮球与运动员学习如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉喝牛奶");
    }
}
