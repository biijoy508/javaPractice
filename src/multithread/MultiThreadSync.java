package multithread;

public class MultiThreadSync {
    /**
     * Reader writer problem
     * @param args
     * @throws InterruptedException
     */

    public static void main(final String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread q = new Thread(
                ()->{
                    for(int j = 0 ; j < 400 ; j++)
                    c.increment();
                });
        Thread r = new Thread(
                ()->{
                    for(int j = 0 ; j < 400 ; j++)
                    c.increment();
                });
        q.start(); r.start();
        q.join(); r.join();
        System.out.println(c.count);
    }

}
class Counter {
    int count;
  //  public void increment(){     // Gives wrong result corrent result 800
    public synchronized void increment(){
        count++;
    }
}
