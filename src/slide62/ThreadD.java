package slide62;

public class ThreadD extends Thread {
    public ThreadD(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
    }

    public void run() {
        throw new RuntimeException("Oy, exception!!!");
    }
}
