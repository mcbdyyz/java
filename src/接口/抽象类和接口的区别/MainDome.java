package 接口.抽象类和接口的区别;
/**
 * 在设计程序的时候，抽象类是对事物的抽象，而接口是对行为的抽象
 * 例如设计一个门：
 * 它具有开的情况，和关的情况，还有报警的功能
 * 那么设计的时候应该吧报警的功能给接口，然后把开关的功能给抽象类，调用抽象类和接口来实现
 * */

/**例子：
 * public interface Alram{
 *     void alarm();
 * }
 * public abstract class Door{
 *     public abstract void open();
 *     public abstract void close();
 * }
 * public class AlarmDoor extends Door implements Alarm{
 *     public void open(){
 *         ....
 *     }
 *     public void close(){
 *         .....
 *     }
 *     public void alarm(){
 *         ......
 *     }
 * }
 *
 * */
public class MainDome {

    public static void main(String[] args) {

    }
}

