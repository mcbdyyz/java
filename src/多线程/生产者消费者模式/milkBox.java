package 多线程.生产者消费者模式;

public class milkBox {
    private int milk;
    private boolean type=false;
    public synchronized void put(int milk){
        if(type){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("存入了"+this.milk+"瓶牛奶");
        type =true;

        notifyAll();
    }
    public synchronized void get(){
        if(!type){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿了"+this.milk+"瓶奶");
        type = false;
        notifyAll();
    }
}
