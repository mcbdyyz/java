package java多态.多态中的转型;

public class Cat extends Animal{
    public int age ;
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //这是Cat中特有方法
    public void playGame(){
        System.out.println("猫玩游戏 ");
    }
}
