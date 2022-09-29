/**
 * Two parameters
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package chapter_4;

public class Factor {
    boolean isFactor(int x, int y){
        if((y % x) == 0) return true;
        else return false;
    }
}

class isFact{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Factor factor = new Factor();

        if(factor.isFactor(2, 20)) System.out.println("2 - делитель");
        if(factor.isFactor(3, 20)) System.out.println("3 - делитель");
        if(factor.isFactor(4, 20)) System.out.println("4 - делитель");
        if(factor.isFactor(5, 20)) System.out.println("5 - делитель");
        if(factor.isFactor(6, 20)) System.out.println("6 - делитель");
    }
}
