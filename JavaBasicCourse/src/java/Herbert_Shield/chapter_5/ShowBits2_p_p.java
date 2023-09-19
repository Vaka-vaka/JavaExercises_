/**
 * Creating a class to display values in binary form
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.11.2022
 */

package java.Herbert_Shield.chapter_5;

public class ShowBits2_p_p {
    int numbits;

    ShowBits2_p_p(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        // Сдвиг значения 1 влево на нужную позицию
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

//Демонстрация использов ания класса ShowBits2

class ShowBits2Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ShowBits2_p_p bits2PP = new ShowBits2_p_p(8);
        ShowBits2_p_p showBits2_p_p = new ShowBits2_p_p(32);
        ShowBits2_p_p showBits2PP = new ShowBits2_p_p(64);

        System.out.println("150 в двоичном представлении : ");
        bits2PP.show(150);

        System.out.println("\n87987 в двоичном представлении :");
        showBits2_p_p.show(87987);

        System.out.println("\n237658768 в двоичном представлении :");
        showBits2PP.show(237658768);
        //Можно также отобразить младшие разряды любого целого числа
        System.out.println("\nMлaдшиe 8 битов числа 87987 в двоичном представлении : ");
        bits2PP.show(87987);
    }
}