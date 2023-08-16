/**
 * generics demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.07.2023
 */

package java_ChanJamie.chapter_11;

public class GenericsDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyGenericsClass<Integer> gI = new MyGenericsClass();
        gI.setMyVar(6);
        gI.printValue();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        MyGenericsClass<Double> gD = new MyGenericsClass<>();
        gD.setMyVar(6.1);
        gD.printValue();
        System.out.println("++++++++++++++++++++++++++++++++++");

        MyGenericsClass<String> gS = new MyGenericsClass<>();
        gS.setMyVar("Hello! :)");
        gS.printValue();
    }
}
