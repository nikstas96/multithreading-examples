package slide80;

public class StaticSynch {
    public static synchronized void a() throws InterruptedException{
        System.out.println("Line #1 in the method a");
        Thread.sleep(1000);
        System.out.println("Line #2 in the method a");
    }
    public static synchronized void b() throws InterruptedException{
        System.out.println("Line #1 in the method b");
        Thread.sleep(1000);
        System.out.println("Line #2 in the method b");
    }
}
