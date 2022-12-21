/**
 * Повтор
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.12.2022
 */

package chapter_6;

class Sum2 {
    int res;
    int sum(int... s) {
        for (int i = 0; i < s.length; i++) {
            res += s[i];
        }
        return res;
    }

    String sum(String a, int... s) { // int a не сможет определить
        for (int i = 0; i < s.length; i++) {
            res += s[i];
        }
        return res + a;
    }
}

class Sum2Demo {
    public static void main(String[] args) {
        Sum2 sum2 = new Sum2();

        System.out.println(sum2.sum(1, 2, 3));
        System.out.println(sum2.sum(1, 1));
        System.out.println(sum2.sum("Trey", 4));

    }
}
