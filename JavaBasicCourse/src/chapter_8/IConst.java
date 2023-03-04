/**
 * Interface has a constants
 * Интерфейс для очереди символов
 *
 * @author Valentyn Mozul
 * @version 1.0 from 04.03.2023
 */

package chapter_8;

public interface IConst {
    int min = 0;
    int max = 10;
    String ERRORMSG = "Ошибка диапазонa";
}

class IConstDemo implements IConst {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[max];

        for (int i = min; i < 11; i++) {
            if (i >= max) {
                System.out.println(ERRORMSG);
            } else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
    }
}