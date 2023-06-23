package 内部类.成员内部类;

public class Demo {
    private int num = 10;

//    public class Inner {//todo 这种方法不常用
//        public void show(){
//            System.out.println(num);
//        }
//    }
    private class Inner{
        public void show(){
            System.out.println(num);
        }

    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
