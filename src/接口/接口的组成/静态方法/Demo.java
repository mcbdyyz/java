package 接口.接口的组成.静态方法;
/**
 * 接口中的静态方法只能被接口自身调用
 *      static void 方法(){}
 * */
public class Demo {
    public static void main(String[] args) {
        Inter ii =new InterImp();
        ii.show();
        ii.show2();
        //接口静态的方法调用的方法
        Inter.show3();
    }
}
