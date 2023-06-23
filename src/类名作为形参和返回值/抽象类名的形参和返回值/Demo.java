package 类名作为形参和返回值.抽象类名的形参和返回值;
/**
 * 抽象类不能实例化
 *
 * */
public class Demo {
    public static void main(String[] args) {
        AnimalDemo c = new AnimalDemo();
//        Animal a = new Animal() {
//            @Override
//            public void eat() {
//                System.out.println("动物吃东西");
//            }
//        };TODO 不然就得直接从、重写方法
        Cat cat = new Cat();
        Animal a = new Cat();
        c.userEat(a);

        Animal animal = c.uA();//new Cat();
        animal.eat();
    }
}
