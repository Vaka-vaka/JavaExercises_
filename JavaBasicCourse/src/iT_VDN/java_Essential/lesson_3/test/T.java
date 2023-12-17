package iT_VDN.java_Essential.lesson_3.test;

public class T {
    int number = 3;

    public int getNumber() {
        return number;
    }
}

class Bind extends T{
    public Bind(int n){
        number = n + 5;
    }
}

