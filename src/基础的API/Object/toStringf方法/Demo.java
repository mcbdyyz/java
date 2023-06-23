package 基础的API.Object.toStringf方法;

/**
 * Object是层次结构的根，每个类都可以将Object作为超类，所有类都直接或者间接的继承自该类，
 * 顶级父类只有无参构造方法
 * 看方法的源码，选中方法，按下Ctrl+B
 * 建议所有子类重写此方法
 * 如何重写呢？自动生成即可
 * */
public class Demo {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("uuz");
        s.setAge(18);
        System.out.println(s);//基础的API.Object.toStringf方法.Student@7ef20235
        System.out.println(s.toString());
    }
//    public void println(Object x) {
//        String s = String.valueOf(x);
//        if (getClass() == PrintStream.class) {
//            // need to apply String.valueOf again since first invocation
//            // might return null
//            writeln(String.valueOf(s));
//        } else {
//            synchronized (this) {
//                print(s);
//                newLine();
//            }
//        }
//    }

}
