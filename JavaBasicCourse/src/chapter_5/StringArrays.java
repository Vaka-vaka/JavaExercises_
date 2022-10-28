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
}

class StringArrayDemo{
    public static void main(String[] args) {
        StringArrays stringArrays = new StringArrays();
        String str = stringArrays.arraysDemo(new String[]{"Эта", "строка", "является", "тестом." });
        System.out.println();
        System.out.println(str);
    }
}
