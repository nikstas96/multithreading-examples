package slide39;

public class DaemonInspector {
    public static void main(String[] args) {
        System.out.println("Start main thread.");
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true);
        daemon.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End main thread");
    }
}
