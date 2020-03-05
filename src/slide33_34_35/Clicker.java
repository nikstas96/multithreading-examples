package slide33_34_35;

public class Clicker extends Thread {
    int click = 0;
    private volatile boolean running = true;

    public Clicker() {
    }

    public void run() {
        while (running) {
            click++;
        }
    }

    public void stopClick() {
        running = false;
    }
}
