package iT_VDN.java_Essential.lesson_8;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "MyException: " + super.getMessage();
    }
}


