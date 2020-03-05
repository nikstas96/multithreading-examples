package slide85_86_87_88;

public class Runner {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        SharedResource resource2 = new SharedResource();
    IntegerSetterGetter integerSetterGetter = new IntegerSetterGetter("1", resource);
    IntegerSetterGetter integerSetterGetter2 = new IntegerSetterGetter("2", resource2);
    integerSetterGetter.start();
    integerSetterGetter2.start();
    }
}
