/**
 * Demonstration of a one-dimensional array
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.10.2022
 */

package java.Herbert_Shield.chapter_5;

public class ArrayDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for(i = 0; i < 10; i++){
            sample[i] = i;
        }
        for(i = 0; i < 10; i++){
            System.out.println("Элeмeнт sample [ " + i + " ] : "+ sample [i]);
        }
    }
}
