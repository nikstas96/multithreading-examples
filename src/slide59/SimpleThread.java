package slide59;

public class SimpleThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException("it's a great exception");
    }
}
