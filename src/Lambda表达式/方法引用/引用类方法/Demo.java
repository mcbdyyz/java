package Lambda表达式.方法引用.引用类方法;

public class Demo {
    public static void main(String[] args) {
//        useInter((String s)->{
//           return Integer.parseInt(s);
//        });
        //省略方法
        useInter(s->Integer.parseInt(s));

        //引用类方法
        useInter(Integer::parseInt);

        //lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    }
    private static void useInter(Inter a){
        //传入一个字符串，返回int类型，所以
        int convert = a.convert("1314");
        System.out.println(convert);

    }
}
