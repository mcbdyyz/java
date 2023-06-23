package Lambda表达式.方法引用;
/**
 * 方法引用符：::该符号为引用运算符，而它所在的表达式被称为方法引用
 *      Lambda表达式：use..(s->System.out.println(s));
 *      拿到参数s后通过Lambda表达式，传递给System.out.println方法处理
 *
 *      方法引用：usePrintable(System.out::println);
 *          直接使用System.out 中的println方法来取代Lambda，代码更加简洁
 * */
public class Demo {
    public static void main(String[] args) {
        useInter((s)-> System.out.println(s));

//        System.out.println("爱生活爱java");
        //方法引用符：::;
        useInter(System.out::println);//这个和上面的内容是一样的

        //可推导的角色可省略的
    }
    private static void useInter(Inter a){
        a.show("爱生活，爱java");

    }
}
