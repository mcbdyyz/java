package 泛型.类型通配符;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 为了表示各种泛型List的父亲，可以使用类型通配符
 *      类型通配符：<?>
 *      List<?>:表示元素类型未知的List，它可以匹配任何类型的模型
 *      但是这种带通配符的List仅表示它是各种泛型List的父亲，并不能把元素添加到其中
 *
 *  如果我们不希望List<?> 是任何泛型List的父亲，只希望它代表某一类泛型的List的父类，可以使用类型通配符的上限
 *  类型通配符上限：<? extends 类型>
 *      List<? extends Number> 它表示的类型是Number或其子类型
 *
 *      类型通配符下限<? super 类型>
 *          List<? super Number>:它表示的类型是Number或者父类型
 * */

public class Demo {
    public static void main(String[] args) {

        List<?> l = new ArrayList<Object>();
        List<?> l2 = new ArrayList<Number>();
        List<?> l3 = new ArrayList<Integer>();

        //如果限定了上限
//        List<? extends Number> l4 = new ArrayList<Object>();//报错
        List<? extends Number> l5 = new ArrayList<Number>();//现在上限为Number
        List<? extends Number> l6 = new ArrayList<Integer>();

        //限定下限
        List<? super Number> l7 =new ArrayList<Object>();
        List<? super Number> l8 = new ArrayList<Number>();//现在下限为Number
//        List<? super Number> l9 = new ArrayList<Integer>();//报错



    }
}
