package Lambda表达式.练习1抽象方法无参无返回值;
/**
 * Lambda表达式的使用前提
 * 有一个接口
 * 接口中有且仅有一个抽象方法
 * */
public class Demo {
    public static void main(String[] args) {
        Eatable e = new EatableImp();
        uesEatable(e);

        //匿名内部类
        uesEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("匿名内部类吃东西");
            }
        });
        //lambda表达式
        uesEatable(()->{
            System.out.println("lambda吃东西");
        });

    }
    private static void uesEatable(Eatable e){
        e.eat();
    }
}
