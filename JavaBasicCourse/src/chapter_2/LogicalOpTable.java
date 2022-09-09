/**
 * Displaying a truth table for logical operations
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_2;

public class LogicalOpTable {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        /*boolean p, q;
        System.out.println("P \t\t Q \t\t AND \t OR \t XOR \t NOT");
        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));*/


        /*int x, y;
        System.out.println("X \t Y \t AND \t OR \t XOR \t NOT");
        x = 1;y = 1;
        System.out.print(x + "\t" + " " + y +"\t");
        System.out.print("  " + (x&y) + "\t\t" + " " + (x|y) + "\t\t");
        System.out.println(" " + (x^y) + "\t\t" + (x>>y));
        x = 1;y = 0;
        System.out.print(x + "\t" + " " + y +"\t");
        System.out.print("  " + (x&y) + "\t\t" + " " + (x|y) + "\t\t");
        System.out.println(" " + (x^y) + "\t\t" + (x*y));
        x = 0;y = 1;
        System.out.print(x + "\t" + " " + y +"\t");
        System.out.print("  " + (x&y) + "\t\t" + " " + (x|y) + "\t\t");
        System.out.println(" " + (x^y) + "\t\t" + (x+y));
        x = 0;y = 0;
        System.out.print(x + "\t" + " " + y +"\t");
        System.out.print("  " + (x&y) + "\t\t" + " " + (x|y) + "\t\t");
        System.out.println(" " + (x^y) + "\t\t" + (x+y+1));*/


        System.out.println("Таблица истинности");
        System.out.println("P Q AND | ^ || && NOT");
        /*out(true,	true);
        out(true, false);
        out(false, true);
        out(false, false);*/


        /*if_if(true,true);
        if_if(false, false);
        if_if(false, true);
        if_if(false, false);*/

        for_for(true, true);
    }

    public static void out (boolean p, boolean q){
        System.out.println((p ? "1" : "0")+ " " + (q ? "1" : "0") + "  " + ((p&q) ? "1" : "0")
         + "  " + ((p|q) ? "1" : "0") + " " + ((p^q) ? "1" : "0") + " " + ((p||q) ? "1" : "0")
         + "  " + ((p&&q) ? "1" : "0") + "  " + ((!p) ? "1" : "0"));
    }

    public static void if_if (boolean p, boolean q) {
        if (p)
            System.out.print("1 ");
        else System.out.print("0 ");
        if (q)
            System.out.print("1 ");
        else System.out.print("0 ");
        if (p&q)
            System.out.print(" 1 ");
        else System.out.print(" 0 ");
        if (p|q)
            System.out.print(" 1 ");
        else System.out.print(" 0 ");
        if (p^q)
            System.out.print("1 ");
        else System.out.print("0 ");
        if (p||q)
            System.out.print("1 ");
        else System.out.print("0 ");
        if (p&&q)
            System.out.print(" 1 ");
        else System.out.print(" 0 ");
        if (!p)
            System.out.println("  1 ");
        else System.out.println("  0 ");
    }

    public static void for_for (boolean p, boolean q) {
        int i;
        for (i = 0; i < 1; i++){
            System.out.println(1);
        }
    }
}
