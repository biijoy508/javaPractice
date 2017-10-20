package multithread;

public class MultithreadDemoLambda2 {
    /**
     * Even shorter with lambda , join (destroy) and isAlive(bool), isInterrupted(if thread was interrupted but not dead) explained
     * Setting thread execution priority, setting thread name
     * @param args
     * @throws InterruptedException
     */

    public static void main(final String[] args) throws InterruptedException {

        Thread i = new Thread(
            ()->{            // Shortcut for runnable
                System.out.println("khan thread : " + Thread.currentThread().getPriority());
            }, "Khan thread"
            ); // Creating and naming thread
    Thread j = new Thread(
            ()->{
                System.out.println("Bertling thread : " + Thread.currentThread().getPriority());
            }, "Bertling thread");

        i.setPriority(Thread.MIN_PRIORITY); j.setPriority(Thread.MAX_PRIORITY); // Setting thread priority

        System.out.println("Main thread : " + Thread.currentThread().getPriority());

        System.out.println(i.getName() + " -> " + i.getPriority() + "\n" + j.getName()+ " -> "+ j.getPriority()+ "\n");

        i.start(); j.start();
        System.out.println(i.isAlive());
        i.join(); j.join(); // join means when these are completed they will join with the main thread , replacement of destroy() method
        System.out.println(i.isAlive());
        System.out.println("main thread");
    }
}
