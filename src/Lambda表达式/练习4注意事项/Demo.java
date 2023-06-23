package Lambda表达式.练习4注意事项;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        useInter(()->{
            System.out.println("好好学习，天天向上");
        });
        //lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
        useInter(()-> System.out.println("省略的好好学习天天向上"));

        //必须有上下文环境，才能推到出lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名类部类");
            }
        });
        Runnable l = () -> System.out.println("Lambda表达式");
        new Thread(l).start();

        //最后写成
        new Thread(()-> System.out.println("Lambda表达式max版"));


    }
    private static void useInter(Inter i){
        i.show();
    }
}
