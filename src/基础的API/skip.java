package 基础的API;

public class skip extends Thread{
    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        super.run();
    }
    class method implements Runnable{

        @Override
        public void run() {

        }
    }

}
