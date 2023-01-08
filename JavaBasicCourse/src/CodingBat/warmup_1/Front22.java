/**
 * TestWork
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.12.2022
 */

/*
Учитывая строку, возьмите первые 2 символа и верните строку с 2 символами,
 добавленными как спереди, так и сзади, поэтому «котенок» дает «kikittenki».
  Если длина строки меньше 2, используйте любые символы.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

package CodingBat.warmup_1;

public class Front22 {
    public String front22(String str) {
        int take = 2;

        if (take > str.length()) {
            take = str.length();
        }
        String string = str.substring(0, take);
        return string + str + string;
    }
}

class Front22Demo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Front22 front22 = new Front22();
        System.out.println(front22.front22("kitten"));
        System.out.println(front22.front22("Ha"));
        System.out.println(front22.front22("abc"));
        System.out.println(front22.front22("a"));
    }
}
