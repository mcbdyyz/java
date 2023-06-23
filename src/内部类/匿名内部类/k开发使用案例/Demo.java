package 内部类.匿名内部类.k开发使用案例;

public class Demo {
    public static void main(String[] args) {
        JumpUser j = new JumpUser();
        Cat c = new Cat();
        j.method(c);
        //todo 上面这种类型的方法在没次要调用新的时候都要穿件一个新的类来实现接口然后调用，十分的麻烦于是↓

        j.method(new Jump() {
            @Override
            public void jump() {
                System.out.println("啾啾猫猫");
            }
        });//这样也是直接重写了类的方法；
    }
}
