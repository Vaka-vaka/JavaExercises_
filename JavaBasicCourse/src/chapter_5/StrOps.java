/**
 * Some operations with strings
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.10.2022
 */

package chapter_5;

public class StrOps {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String str1 = new String("Java - лидер Интернета!");
        String str2 = new String(str1);
        String str3 = new String("Строки Java эффективны.");
        int result, idx;
        char ch;

        System.out.println("Длинa str1: " + str1.length());

        // Отображение строки str1 посимвольно
        for(int i = 0; i < str1.length(); i++){
            System.out.print(str1.charAt(i));
        }
            System.out.println();
        for (int i = 0; i < str3.length(); i++){
            System.out.print(str3.charAt(i));
        }
        System.out.println();
        if (str1.equals(str2)){
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str2");
        }
        if (str1.equals(str3)){
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str2");
        }
        //Возвращает отрицательное значение, если текущая
        //строка меньше строки str, нуль, если эти строки равны,
        //и положительное значение, если текущая строка больше
        //строки str
        result = str1.compareTo(str3);
        if (result == 0){
            System.out.println("str1 и strЗ равны");
        } else if (result < 0){
            System.out.println("str1 меньше str3");
        }else{
            System.out.println(" str1 больше str3");
        }
        // Присваивание переменной str2 новой строки
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения Опе : " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхождения One : " + idx);


    }
}
