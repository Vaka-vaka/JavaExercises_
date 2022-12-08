/**
 * Applying the Static block
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.12.2022
 */

package chapter_6;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // Этот блок выполняется при загрузке класса
    static {
        System.out.println("Bнyтpи статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msq) {
        System.out.println(msq);
    }
}

class SDemoBlock {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock("Bнyтpи конструктора");
        System.out.println("Kopeнь квадратный из 2 равен " + StaticBlock.rootOf2 +
                "\nKopeнь квадратный из 3 равен " + StaticBlock.rootOf3);
        System.out.println(staticBlock.equals(StaticBlock.rootOf2));
    }
}