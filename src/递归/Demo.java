package 递归;
/**
 * 递归指的是方法定义中调用方法本身的现象
 * */
public class Demo {
    public static void main(String[] args) {
        //兔子问题
        //1,1,2,3,5,8,....
        /*
        * 先定义一个方法f(n):表示第n个月的兔子对数
        * 那么，第n-1个月的兔子对数为f(n-1)
        * 第n-2个月则是f(n-2)
        * */

        System.out.println(f(20));
        System.out.println(f1(3));
    }
    public static int f(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return f(n - 1) + f(n - 2);
        }
    }

    /*
    * 阶乘
    * */

    public static int f1(int n){
        if(n==1){
            return 1;
        }else {
            return n*f1(n-1);
        }
    }
}
