package Lambda表达式.练习2抽象带参无返;

public class Demo {
    public static void main(String[] args) {
        birdFly((String a)->{
            System.out.println(a);
            System.out.println("鸟在飞");
        });
    }
    public static void birdFly(Flyable e){
        e.fly("人在叫");

    }
}
