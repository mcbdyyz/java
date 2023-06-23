package 异常.throws异常;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception{
        method1();
    }
    //编译时异常
    public static void method1() throws Exception{
        String time = "2022-12-13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(time);
        System.out.println(parse);
    }
}
