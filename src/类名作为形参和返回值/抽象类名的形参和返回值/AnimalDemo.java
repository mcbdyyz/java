package 类名作为形参和返回值.抽象类名的形参和返回值;

public class AnimalDemo {

    public void userEat(Animal a){
        a.eat();

    }
    public Animal uA(){
        Animal s = new Cat();
        return s;
    }
}
