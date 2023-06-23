package 基础的API.日期类.案例4;

import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUser.DatetoString(d, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);

        Date date = DateUser.StringToDate(s, "yyyy-MM-dd");
        System.out.println(date);
    }
}
