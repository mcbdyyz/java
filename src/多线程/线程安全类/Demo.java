package 多线程.线程安全类;

import java.util.*;

/**
 * StringBuffer
 *      线程安全，可变的字符序列
 *      从版本JDK5开始，被StringBuilder替代，通常应该使用StringBuilder类，因为它支持所有相同的操作，
 *      但它更快，因为它不执行同步
 *
 * Vector
 *      从java 2平台开始，该类改进了List接口，Vector被同步，详细查看文档
 * Hashtable
 *      实现了一个哈希表，它将键映射到值，任何非null对象都可以用作键或者值
 * */
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> ve = new Vector<String>();//但是在实际使用中，Vector虽然是安全，但还是被替代
        ArrayList<String> ar = new ArrayList<>();
        List<String> al = Collections.synchronizedList(new ArrayList<String>());

        Hashtable<String,String> hst = new Hashtable<>();
        HashMap<String,String>  hsm = new HashMap<>();


    }
}
