package 内部类.匿名内部类;
/**
 * 匿名内部类是局部内部类的另一种形势
 * 前提：存在一个类或者接口，这里的类可以是具体的类也可以是抽象类
 *
 * */
public class Demo {
    public void  method(){
        //创建了一个类，然后重写show方法，但是这样method并没有调用Inter这个方法，他只是被创造出来了，所以要用下面的方法
//        new Inter(){
//            @Override
//            public void show() {
//                System.out.println("开始了表演");
//            }
//        };
//        new Inter(){
//            @Override
//            public void show(){
//                System.out.println("开始了表演");
//            }//上面的相当于创建一个没有给参数的类，而后面则是正常的类调佣show（）方法，
//        }.show();
        // todo 也可以用多态的方法

            Inter i  = new Inter() {
                @Override
                public void show(){
                    System.out.println("马戏团开始表演了");
                }
            };
            i.show();
    }
}
