package 接口;
//用implements来实现接口
public class Cat implements Junmp{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void play(){
        System.out.println("猫玩游戏");
    }
}
