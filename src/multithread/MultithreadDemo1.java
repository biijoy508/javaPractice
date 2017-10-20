package multithread;

public class MultithreadDemo1 {
/**
 * Very basic thread example, used sleep to avoid race condition
 * @param args
 * @throws InterruptedException
 */
    public static void main(final String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
          Hi x = new Hi();
          Hello y = new Hello();
          x.start();
          Thread.sleep(15);
          y.start();
    }
}

class Hi extends Thread{
    public void run(){
     System.out.println( "hi");
    }
}

class Hello extends Thread{
public void run(){
        System.out.println("hello");
    }
}