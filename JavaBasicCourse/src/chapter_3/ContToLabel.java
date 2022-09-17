/**
 * Applying the cont i nue instruction with a measure
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

public class ContToLabel {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i++){
            System.out.print("\nBнeшний цикл : проход " + i + ", внутренний цикл : " ) ;
            for (int j = 1; j < 10; j++){
                if(j == 5) continue outerloop; // продолжение внешнего цикла
                System.out.print(j);
            }
        }
    }
}
