package 多线程.生产者消费者模式;

public class Customer implements Runnable{
    private milkBox b;
    public Customer(milkBox b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
