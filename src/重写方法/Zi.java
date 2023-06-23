package 重写方法;

public class Zi extends Fu{

    @Override
    public void show(){
        System.out.println("zi出门表演了");
    }
    //TODO:父类中的方法是private时，是不能重写的，重写方法的时候，子类的访问权限不能比父类低
//    @Override
//    private void call(){
//        System.out.println("Zi打了电话");
//    }
}
