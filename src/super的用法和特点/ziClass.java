package super的用法和特点;
// this(..) 访问的是本类的构造方法
// super(..)访问的是父类的成员方法，
public class ziClass extends FuClass{
    public int age = 20;
    public void show(){
        int age =30;
        System.out.println(age);
        //在方法里面想访问成员变量age，怎么办
        System.out.println(this.age);//这样就可以了
        //我要访问父类的成员变量age，怎么办呢？
        System.out.println(super.age);
    }
}
