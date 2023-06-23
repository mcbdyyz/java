package Lambda表达式.练习1抽象方法无参无返回值;

public class EatableImp implements Eatable{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }
}
