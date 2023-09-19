/**
 * Simple data types are passed to methods by value
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class SimpleTypes {
    //Этот метод не может изменить значения аргументов,
    //передаваемых ему при вызове
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
}

class SimpleTypesDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        SimpleTypes types = new SimpleTypes();
        int a = 15; int b = 20;

        System.out.println(" a и Ь перед вызовом : " + a + " " + b);

        types.noChange(a, b);
        System.out.println(" a и Ь после вызова : " + a + " " + b);
    }
}
