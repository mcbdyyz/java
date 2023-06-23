package 接口.运动员与教练案例;

public class Demo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer pp = new PingPangPlayer();
        pp.setName("uuz");
        pp.setAge(18);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.stud();
        pp.SEnglish();

        System.out.println("");
        bPlayer bp = new bPlayer();
        bp.setName("姚明");
        bp.setAge(30);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.stud();
    }
}
