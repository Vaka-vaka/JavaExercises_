package iT_VDN.java_Essential.lesson_4.samples;

abstract class AbstractClass {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("Implementation");
    }
}

public class MainSamples_1 {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
