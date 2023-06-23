package 多线程;

public class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*自定义带参然后返回
public MyThread(String name){
        super(name);
    }
public Thread(String name) {
        this(null, null, name, 0);
    }



    默认的返回
* public Thread() {
    this(null, null, "Thread-" + nextThreadNum(), 0);
}
* public Thread(ThreadGroup group, Runnable target, String name,
              long stackSize) {
    this(group, target, name, stackSize, null, true);
}
* private Thread(ThreadGroup g, Runnable target, String name,
               long stackSize, AccessControlContext acc,
               boolean inheritThreadLocals) {
    this.name = name;
*
* public final String getName() {
        return name;
    }
* */
