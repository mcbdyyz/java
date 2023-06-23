package java多态.多态中的转型;

/**
 * 多态中的转型有两种方式
 * 第一种：向上转型：从子到父，父亲引用指向子类对象
 * 第二种：向下转型：从父到子，父亲引用转为子类对象
 *
 * */
public class Demo {
    public static void main(String[] args) {

        Animal animal = new Cat();//向上转型，用父亲引用指向子类
        animal.show();//animal父类的方法，
        animal.eat();//属性看左边，方法看右边

        Cat cat = (Cat)animal;//向下转型，类似于强转，这样不会再实力个Cat对象来实现子类中的方法
        cat.eat();
        cat.playGame();

        animal = new Dog();//animal的指向Animal所以这是向上转型指向dog
        animal.show();


//        Cat cat1 = (Cat)animal;//TODO:如果这么写会报错,因为这是animal指向Dog（），多态类直接不能直接相互强转


    }
}
