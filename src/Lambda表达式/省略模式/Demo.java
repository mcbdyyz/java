package Lambda表达式.省略模式;

public class Demo {
    public static void main(String[] args) {
        //正常的lambda
        useAnimal((int x,int y)->{
            System.out.println("开始加了");
            return x+y;
        });
        System.out.println("---------");

        //省略模式，不能省略单个，一个不省略
        useAnimal((x,y)->{
            System.out.println("省略加");
            return x+y;
        });
        System.out.println("---------");
        //正常单个，省略参数类型
        useFlyable((f)->{
            System.out.println(f);
            System.out.println("一头撞到墙");
        });
        System.out.println("---------");

        //如果参数有且仅有一个，那么小括号可以省略
        useFlyable(f->{
            System.out.println(f);
            System.out.println("省略小括号的鸟儿");
        });
        System.out.println("---------");

        //如果代码块的语句只有一条，可以省略大括号和分号，如果那一句是return，得省略return
        useFlyable(f-> System.out.println("这下大括号和分号也没了"));

        //如果代码块的语句只有一条，可以省略大括号和分号，如果那一句是return，得省略return
        useAnimal((x,y)-> x+y);

        //useAnimal((x,y)-> return x+y);这个方法是错误的，不能这样描述

    }
    public static void useAnimal(Animal a){
        int s = a.add(10, 20);
        System.out.println(s);

    }
    public static void useFlyable(Flyable f){
        f.fly("鸟儿要飞翔");

    }
}
