import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockExample {
    private  static int count =0;
    private  static  final ReentrantLock lock= new ReentrantLock();

    public static  void increment() {
        lock.lock();
        try{
        count++;
    } finally{
        lock.unlock();
    }
}
public static void main (String[]args) throws InterruptedException {
    Runnable task = () -> {
        for (int i = 0; i < 1000; i++) {
            increment();

        }
    };

    Thread t1= new Thread(task);
    Thread t2= new Thread(task);
    t1.start(); t2.start();
    t1.join(); t2.join();
    System.out.println("최종 카운트:"+ count);

}

}