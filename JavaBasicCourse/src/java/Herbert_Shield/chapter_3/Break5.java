/**
 * Applying the instruction with the tag
 *
 * @author Valentyn Mozul
 * @version 1.0
 */


package java.Herbert_Shield.chapter_3;

public class Break5 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    System.out.println (k +" ") ;
                    if (k == 5) break done ; // переход по ме тке done
                }
                System.out.println ("Пocлe цикла по k"); // не выполнится
            }
            System.out.println ("Пocлe цикла по j"); // не выполнится
        }
        System.out.println ("Пocлe цикла по i");
    }
}
