/**
 * Using an internal class
 *
 * @author Valentyn Mozul
 * @version 1.0 from 06.12.2022
 */

package java.Herbert_Shield.chapter_6;

public class Outer {
    int[] nums;

    Outer(int[] n) {
        nums = n;
    }

    void Analyze() {
        Inner inner = new Inner();
        System.out.println("Mинимyм : " + inner.min());
        System.out.println("Maкcимyм : " + inner.max());
        System.out.println("Cpeднee : " + inner.avg());
    }

    // Внутренний класс
    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int num : nums) {
                if (num > m) m = num;
            }
            return m;
        }

        int avg() {
            int a = nums[0];
            for (int i = 0; i < nums.length; i++) {
                a = a + nums[i];
            }
            return a / nums.length;
        }
    }
}

class OuterDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outer = new Outer(x);

        outer.Analyze();
    }
}
