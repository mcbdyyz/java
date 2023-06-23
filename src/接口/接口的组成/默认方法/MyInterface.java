package 接口.接口的组成.默认方法;
/**
 * 使用默认方法可以在接口更新的时候不会强制要求实现的类要更新实现方法
 * 但也能在类中实现接口的方法
 * */
public interface MyInterface {
    void test1();
    void test2();
    //在没实现的时候，这个方法也可以被实现类的对象调用，输出的则是这个方法中的方法体
    default void test3(){
        System.out.println("接口的test3");
    }
}
