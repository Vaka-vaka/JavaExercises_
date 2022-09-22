/**
 * Transformations of lowercase letters
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_3;

import java.io.IOException;

public class LowercaseTransformations {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws IOException {
//        char ch;
//        for(int i=0; i < 10; i++) {
//            ch = (char) ('a' + i);
//            System.out.print(ch);
//
//            // This statement turns off the 6th bit.
//            ch = (char) ((int) ch & 65503); // ch is now uppercase
//            System.out.print(ch + " ");
//        }

        char ch, res, answer = '.';
        int coun_t = 0, count = 0;

        while (true) {
            ch = (char) System.in.read();

            if ((ch == 'A')|(ch == 'B')|(ch == 'C')|(ch == 'D')|(ch == 'E')|(ch == 'F')|(ch == 'G')
                |(ch == 'H')|(ch == 'I')|(ch == 'J')|(ch == 'K')|(ch == 'L')|(ch == 'M')|(ch == 'N')
                 |(ch == 'O')|(ch == 'P')|(ch == 'Q')|(ch == 'R')|(ch == 'S')|(ch == 'T')|(ch == 'U')
                  |(ch == 'V')|(ch == 'W')|(ch == 'X')|(ch == 'Y')|(ch == 'Z')){
                   res = (char) ((int) ch + 32);
                    coun_t ++;
                    System.out.println(res);
            }else if((ch == 'a')|(ch == 'b')|(ch == 'c')|(ch == 'd')|(ch == 'e')|(ch == 'f')|(ch == 'g')
                     |(ch == 'h')|(ch == 'i')|(ch == 'j')|(ch == 'k')|(ch == 'l')|(ch == 'm')|(ch == 'n')
                      |(ch == 'o')|(ch == 'p')|(ch == 'q')|(ch == 'r')|(ch == 's')|(ch == 't')|(ch == 'u')
                       |(ch == 'v')|(ch == 'w')|(ch == 'x')|(ch == 'y')|(ch == 'z')){
                        res = (char) ((int) ch - 32);
                         count ++;
                          System.out.println(res);
            }

            if (ch == answer) {
                System.out.println("End");
                 System.out.println("Kоличество символов верхнего регистра, для которых был изменен регистр" +
                        " - " + coun_t);
                  System.out.println("Kоличество символов нижнего регистра, для которых был изменен регистр" +
                        " - " + count);
                   break;
            }
        }
    }
}
