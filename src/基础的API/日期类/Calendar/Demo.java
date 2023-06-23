package 基础的API.日期类.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**Calendar 为了某一时刻和一组日历字段之间的转换，并操作旧日历提供了一下方法
 *
 * Calendar 提升了一个方法，getInstance 用于获取Calendar 对象，期日历字段已经使用当前日期初始化
 *              Calendar rightNow = Calendar.getInstance();
 * */
public class Demo {
    public static void main(String[] args) {
            //获得对象
        Calendar cl = Calendar.getInstance();//多态的形式
//        System.out.println(cl);

//       int year =  cl.get(Calendar.YEAR);
//       int month = cl.get(Calendar.MONTH)+1;//月份要加一，因为从0开始算的
//       int day = cl.get(Calendar.DATE);
//
//        System.out.println("今年是："+year+"年"+month+"月"+day+"日");

        // todo public abstract void add(int field, int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段

        cl.add(Calendar.YEAR,-3);//先对实例出来的类减或加，然后再赋值
        cl.add(Calendar.YEAR,3);
        int year =  cl.get(Calendar.YEAR);
       int month = cl.get(Calendar.MONTH)+1;//月份要加一，因为从0开始算的
       int day = cl.get(Calendar.DATE);
        System.out.println("今年是："+year+"年"+month+"月"+day+"日");

        //十年后，的5天前
        cl.add(Calendar.YEAR,10);
        cl.add(Calendar.DATE,-5);
        int year1 = cl.get(Calendar.YEAR);
        int month1 = cl.get(Calendar.MONTH);
        int day1 = cl.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+day1+"日");

        //todo public final void set(int year,int month,int date):设置当前日历的年月日
        cl.set(2077,7,7);
        System.out.println(cl.get(Calendar.YEAR)+"年"+cl.get(Calendar.DATE)+"月"+cl.get(Calendar.DATE)+"日");
    }
}
