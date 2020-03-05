package slide23_24;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
