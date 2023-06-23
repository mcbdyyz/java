package java多态;

public class AnimalUser {
    //把Animal类传入userDemo()，在多态的类容中，可以传入父方法的子类，来重写父方法中已经定义好的方法
    public void userDemo (Animal s){
        s.show();

    }
}
