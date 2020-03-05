package slide60_61;

public class MyThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
