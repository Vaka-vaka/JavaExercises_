/**
 * generics demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.07.2023
 */

package java_ChanJamie.chapter_11;

public class MyGenericsClass<T> {
    private T myVar;

    void setMyVar(T i) {
        myVar = i;
    }

    void printValue() {
        System.out.println("The value of myCa is " + myVar);
    }
}
