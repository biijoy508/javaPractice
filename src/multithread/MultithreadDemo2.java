package multithread;

public class MultithreadDemo2 {

    /**
     * Using runnable instead of thread objects
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
          Runnable x = new Me();
          Runnable y = new You();

          Thread m = new Thread(x);
          Thread n = new Thread(y);
          m.start();
          Thread.sleep(15);
          n.start();
    }
}

class Me implements Runnable{
    public void run(){
     System.out.println( "me");
    }
}

class You implements Runnable{
public void run(){
        System.out.println("you");
    }


}