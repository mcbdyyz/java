package 基础的API.日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public Date():分配一个date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
 * public Date(long date):分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class Demo {
    public static void main(String[] args) throws ParseException{
        Date d1 = new Date();
        System.out.println(d1);
        //public Date (long date)
        long time = 1000 * 60 * 60;//这样限定了日期时间的小时
        Date d2 = new Date(time);
        System.out.println(d2);

        SimpleDateFormatUser();//调用下面的方法

        DateUtils(d1);

        StringToDate("2022-12-10 23-23-23");

        tcUser();

    }
    /**
     * Date常用方法
     * public long getTime();
     * public void setTime(long time);
     * */
    public static void tcUser() {
        Date date = new Date();
        //public long getTime ();获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值；
        long time;
        System.out.println(date.getTime());//获得毫秒
        System.out.println(date.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");//通过运算得出差的年份
        //todo public void setTime(long time):设置时间，给的是毫秒值
        time = System.currentTimeMillis();
        date.setTime(time);
        System.out.println(date);
    }
    /**
     SimpleDateFormat类概述
     SimpleDateFormat 是一个具体的类，用于以区域设置敏感的方式格式化和解析日期，我们重点学习日期格式化和解析

     日期和时间格式由日期和时间模式字符串指定，在日期和时间模式字符串中，从‘A’ 到'Z'以及从’a'到‘z'引号的字母
     被解释为表示日期或时间字符串的组件和模式字母
     常用模式字母及关系如下
     y  ---年
     M  ---月
     d  ---日
     H  ---时
     m  ---分
     s  ---秒
     格式化：从Date到String
     public final String format (Date date):将日期格式化成功日期/时间字符串

     解析：从String到Date
        public Date parse (String source):从给定字符串开始解析文本以生成日期
     */
    public static void SimpleDateFormatUser() throws ParseException {
        System.out.println("------SimpleDateFormatUser-------");
        Date date = new Date();//这个默认存的是现在的日期时间
        //todo 把Date-->String
//        SimpleDateFormat sdf = new SimpleDateFormat();//这样日期的格式是默认的
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//这样是传入类容规则
        String s = sdf1.format(date);//给入默认的日期时间，然后转换为String 字符串类型
        System.out.println(s);//输出
        System.out.println("-----------------");
        //todo String -->Date
        String ss = "2022-7-2-19-55-55";//这个格式必须规范，和SimpleDateFormat相同
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//这个格式必须和字符串格式相同
        Date date1 =sdf2.parse(ss);//parse需要抛出异常
        System.out.println(date1);//因为输出的是Date所以格式是Date自己的格式

    }
    /**一个把日期类型的时间转换为String
     * 格式为 yyyy-MM-dd HH-mm-ss
     * */
    public static void DateUtils(Date date1){

        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

        String date = sbf.format(date1);
        System.out.println(date);
    }
    public static void StringToDate(String time){
        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        try {
            date = sbf.parse(time);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
