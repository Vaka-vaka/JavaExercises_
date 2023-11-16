package iT_VDN.java_Essential.lesson_9.object.ex_006;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik");
        Cat c2 = new Cat("Barsik");
        //Cat c2 = c1;
        if (c1 == c2) {  // == перевіряє по ссилці (с1 і с2)
            System.out.println("Cat's equals");
        } else {
            System.out.println("They're not equals");
        }

        //дві строки
        String a = "Barsik";
        String b = "Barsik";

        if (a == b) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
