package slide62;

public class ThreadGroupUncaughtExceptionDemo {
    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("one");

        ThreadD t1 = new ThreadD("1", g);
        ThreadD t2 = new ThreadD("2", g);
        ThreadD t3 = new ThreadD("3", g);

        t3.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t + " throws exception: " + e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}
