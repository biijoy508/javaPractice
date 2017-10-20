package multithread;

public class MultithreadProducerConsumer {

    public static void main(final String[] args) throws InterruptedException {

        Shared shared = new Shared();
        new Producer(shared);
        new Consumer(shared);
    }
}

    class Shared{

        private int count= 0;
        boolean control = false;
        /**
         * get a bool, in getMethod set it to false, in putMethod get it to true , simple formula
         * @return
         * @throws InterruptedException
         */

       synchronized int getCount() throws InterruptedException {
           while(!control){
               wait();
           }
            System.out.println("Get : " + count);
            control = false;
            notify();
            return count;
        }

         synchronized void setCount(final int count) throws InterruptedException {
            while(control){
                wait();
            }
             this.count = count;
            System.out.println("Set : " + count);
            control = true;
            notify();
        }
    }

    class Producer implements Runnable{
        Shared sh;
        public Producer(final Shared sh){
            this.sh = sh;
            Thread t = new Thread(this, "Producer adds"); // instantiating a new thread and run this object on its own thread, providing a name to he thread
            t.start();
        }
        @Override
        public void run() {
            int count = 0;
            while(true){
            try {
                sh.setCount(count++);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }

    }
    class Consumer implements Runnable{
        Shared sh;
        public Consumer(final Shared sh){
            this.sh = sh;
            Thread t = new Thread(this, "Consumer reads"); // instantiating a new thread and run this object on its own thread, providing a name to he thread
            t.start();
        }
        @Override
        public void run() {
            while(true){
            try {
                sh.getCount();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }

    }

