package multithread;

public class MultithreadDemoLambda1 {
    /**
     *
     * here we are wring anonymous thread class inside runnable instantiation and later minimizing using Lambda
     */

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
//          Runnable a = new Runnable(){
//              public void run(){
        Runnable a = ()-> {
                  System.out.println("a");
              //}
          };

          //Runnable b = new Runnable(){
              //public void run(){
          Runnable b = ()-> {
          System.out.println("b");
           //   }
          };
          Thread w = new Thread(a); Thread y= new Thread(b);
          w.start(); y.start();
    }

}
