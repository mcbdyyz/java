package 接口.接口的组成.私有方法;
/**
 * 接口私有方法是在接口的默认或者静态中调用该方法从而实现，在外部无法调用
 * */
public interface Inter {
    void show();
    //私有方法的第一种写法
//    private void show2(){
//        System.out.println("狂风，臣服于我");
//        System.out.println("咆哮吧，俱利伽罗");
//        System.out.println("苏醒吧，画笔的主人");
//    }
//    default void MShow(){
//        System.out.println("Mshow time");
//        show2();
//        System.out.println("Mshow time end");

//    }
    //和一种静态的写法
//    private static void show3(){
//        System.out.println("苏醒吧，冰箱的主人");
//        System.out.println("咆哮吧，俱利伽罗");
//        System.out.println("苏醒吧，画笔的主人");
    }
//    static void SShow(){
//        System.out.println("SShow time");
//        show3();
//        System.out.println("SShow time end");
//    }


//}
