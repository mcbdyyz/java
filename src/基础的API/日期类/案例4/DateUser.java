package 基础的API.日期类.案例4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类优先把构造方法私有化
 * */
public class DateUser {
    //私有化构造方法
    private DateUser(){}


    public static String DatetoString(Date date, String format){
        SimpleDateFormat sbf = new SimpleDateFormat(format);
        String s = sbf.format(date);
        return s;
    }

    public static Date StringToDate(String s ,String format) throws ParseException {
        SimpleDateFormat sbf = new SimpleDateFormat(format);
        Date d = sbf.parse(s);
        return d;
    }
}
