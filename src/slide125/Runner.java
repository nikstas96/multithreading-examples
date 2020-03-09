package slide125;

public class Runner {
    public static void main(String[] args) {
        CallableThread callableThread = new CallableThread();
        callableThread.call();
        System.out.println(callableThread.count);
    }
}
