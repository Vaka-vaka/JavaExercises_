/**
 * Предотвраще ние деления на нуль с помощью оператора ?
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class NoZeroDiv {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int result;

        for (int i = -5; i < 6; i++){
            result = i != 0 ? 100 / i:0;
            if (i != 0){
                System.out.println("1OO /" + i +" равно " + result);
            }else System.out.println("Zero " + "= " + i);
        }
    }
}
