package 接口.运动员与教练案例;

public class bCoach extends Coach{
    @Override
    public void teach(){
        System.out.println("篮球教练教如何运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

}
