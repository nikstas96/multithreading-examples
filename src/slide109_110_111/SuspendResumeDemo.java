package slide109_110_111;

public class SuspendResumeDemo {
    public static void main(String[] args) throws InterruptedException {
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        Thread.sleep(3000);
        clock.suspend();
        clock.resume();
        Thread.sleep(3000);
    }
}
