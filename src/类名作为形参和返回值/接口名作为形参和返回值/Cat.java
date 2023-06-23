package 类名作为形参和返回值.接口名作为形参和返回值;
/**
 * 实现接口的类，因为接口不能实例化
 * */
public class Cat implements Jump{
    @Override
    public void jump(){
        System.out.println("猫猫可以跳高了");
    }
}
