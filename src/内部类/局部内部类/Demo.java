package 内部类.局部内部类;
/**
 * 局部内部类是不能直接调用内部类的，也是得要靠外部来访问
 * */
public class Demo {
    private int num = 10;

    public void method(){
        int num2 = 20;
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }

        }
        //这里得来使用内部类，不然调用method的时候是不会自动调用Inner的
        Inner i = new Inner();
        i.show();
    }
}
