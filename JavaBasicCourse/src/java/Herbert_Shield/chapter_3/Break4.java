/**
 * Applying the instruction with the tag
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_3;

public class Break4 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++){
            one:{
              two:{
                three:{
                    System.out.println("\ni равно " + i);
                    if(i == 1) break one;
                    if(i == 2) break two;
                    if(i == 3) break three;
                    // Эта строка кода никогда не будет достигнута
                    System.out.println ("нe будет выведено");
                }
                   System.out.println ("Пocлe блока three") ;
              }
                System.out.println ("Пocлe блока two");
            }
            System.out.println ("Пocлe блока one");
        }
        System.out.println ("Пocлe цикла for");
    }
}
