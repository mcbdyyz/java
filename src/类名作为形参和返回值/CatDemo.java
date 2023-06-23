package 类名作为形参和返回值;

public class CatDemo {

    public void useCat(Cat c){//Cat c = new Cat();
        c.eat();
    }
    public Cat getCat(){
//        return new Cat();或者
        Cat a = new Cat();
        return a;

    }
}
