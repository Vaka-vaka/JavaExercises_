/**
 * Demonstration of the use of string masks
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.10.2022
 */

package chapter_5;

public class StringArrays {

    String arraysDemo(String[] arr){
        String st = "";
        for (String s : arr){
            st += s + " ";
        }
        return st;
    }

    // Изменение строки
    String arrayDemo2(String[] att){
        att[2] = "также является";
        att[3] = "тестом!";
        String str ="";

        for (String z : att){
            str += z + " ";
        }
        return str;
    }
}

class StringArrayDemo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        StringArrays stringArrays = new StringArrays();
        String str = stringArrays.arraysDemo(new String[]{"Эта", "строка", "является", "тестом." });
        System.out.println();
        System.out.println(str);

        StringArrays stringArrays1 = new StringArrays();
        String str1 = stringArrays1.arrayDemo2(new String[]{"Эта", "строка", "является", "тестом."});
        System.out.println();
        System.out.print(str1);
    }
}
