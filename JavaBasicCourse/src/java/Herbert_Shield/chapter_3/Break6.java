/**
 * The location of the mark is very important
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Break6 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int x = 0, y = 0;
        //Здесь метка располагается перед циклом for
          stop1: for(x = 0; x < 5; x++){
            for (y = 0; y < 5; y++){
                if (y == 0) break stop1;
                System.out.println ("x и у: " + x + " " + y);
            }
          }
        System.out.println();
        System.out.println();
        //А тут метка располагается непосредственно перед
        //открывающей фигурной скобкой
        for (x = 0; x < 5; x++)
        stop2: {
            for(y = 0; y < 5; y++){
                if(y == 2) break stop2;
                System.out.println("x и у: " + x + " " + y);
            }
        }
    }
}
