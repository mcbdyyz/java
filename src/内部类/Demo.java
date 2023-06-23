package 内部类;
/**
 * 内部类可以直接访问外部类的成员，包括私有
 * 外部类要访问内部类的成员，必须创建对象
 * */
public class Demo {
    private static int num = 10;

        public static class Inner {
            public void show(){
                System.out.println("ni");
            }

            public static void main(String[] args) {
                System.out.println(num);
                method();

            }
        }
    public static  void method(){

        Inner inner = new Inner();
        inner.show();
    }

}
