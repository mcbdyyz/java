package 类名作为形参和返回值;
/**
 * 方法形参是类名，需要的是该类的对象
 * 方法的返回值是类名，返回的是该类的对象
 * */
public class Demo {
    public static void main(String[] args) {

        CatDemo uc = new CatDemo();
        Cat c = new Cat();
        uc.useCat(c);

        Cat uc2 =uc.getCat();
        uc2.eat();
    }
}
