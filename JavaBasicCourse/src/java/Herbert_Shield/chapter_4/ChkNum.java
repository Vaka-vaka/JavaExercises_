/**
 * A simple example of applying a parameter in a method
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package java.Herbert_Shield.chapter_4;

public class ChkNum {
    //Возврат логического значения true ,
    // если х содержит четное число

    boolean isEven(int x) {
        if ((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ChkNum wert = new ChkNum();
        if(wert.isEven(12)) System.out.println("12 - четное число");
        if(wert.isEven(23)) System.out.println("23 - четное число");
        if(wert.isEven(11)) System.out.println("11 - четное число");
        if(wert.isEven(10)) System.out.println("10 - четное число");
        if(wert.isEven(2)) System.out.println("2 - четное число");
    }
}
