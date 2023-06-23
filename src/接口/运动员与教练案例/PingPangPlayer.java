package 接口.运动员与教练案例;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void stud() {
        System.out.println("乒乓球运动员学习如何接球和发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜喝小米粥");
    }

    @Override
    public void SEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
