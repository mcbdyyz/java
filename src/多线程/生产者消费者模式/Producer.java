package 多线程.生产者消费者模式;

public class Producer implements Runnable{
    private milkBox b;
    public Producer(milkBox b){
        this.b = b;
    }
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            b.put(i);
        }
    }
}
