package 接口.接口的组成.静态方法;

public interface Inter {
    void show();//抽象的
    default void show2(){
        System.out.println("默认");
    }//默认方法

    static void show3(){
        System.out.println("静态");
    }//静态方法
}
