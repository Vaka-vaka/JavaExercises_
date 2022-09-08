/**
 * Demonstration of the use of comparison operators and logical operators
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class RelLogOps {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        boolean a, b;
        i = 10;
        j = 11;
        a = i < j;
        System.out.println(a);
         a = (i <=j);
         System.out.println(a);
          a = (i != j);
          System.out.println(a);
           a = (i == j);
           System.out.println(a);
            a = (i >= j);
            System.out.println(a);
             a = (i > j);
             System.out.println(a);
        System.out.println("AND");
         b1 = true;
         b2 = false;
         boolean z, z2, z3, z4;
          z = b2&b2;
          z2 = b2&b1;
          z3 = b1&b2;
          z4 = b1&b1;
         System.out.println("\n +++++&++++++++" + "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
           z = b2|b2;
           z2 = b2|b1;
           z3 = b1|b2;
           z4 = b1|b1;
          System.out.println("\n +++++|++++++++"+ "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
            z = b2^b2;
            z2 = b2^b1;
            z3 = b1^b2;
            z4 = b1^b1;
            System.out.println("\n +++++^++++++++"+ "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
             z = b2!=b2;
             z2 = b2!=b1;
             z3 = b1!=b2;
             z4 = b1!=b1;
             System.out.println
                     ("\n +++++!=++++++++"+ "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
              z = b2||b2;
              z2 = b2||b1;
              z3 = b1||b2;
              z4 = b1||b1;
              System.out.println
                    ("\n +++++||++++++++"+ "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
        z = b2&&b2;
        z2 = b2&&b1;
        z3 = b1&&b2;
        z4 = b1&&b1;
        System.out.println("\n +++++&&++++++++"+ "\n" + z + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n ++++++++++++++");
    }
}
