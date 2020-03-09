package slide135_136;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread implements Runnable {
    public static AtomicInteger count = new AtomicInteger();

    public void run(){
        for (int i = 0; i< 10000000; i++){
            //count.incrementAndGet();
            //count.addAndGet(1);
            count.getAndAdd(1);
        }
        System.out.println(count);
    }
}
