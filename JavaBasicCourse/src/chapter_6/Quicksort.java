/**
 * A simple version of the Quicksort, that implements quick sorting
 *
 * @author Valentyn Mozul
 * @version 1.0 from 05.12.2022
 */

package chapter_6;

public class Quicksort {
    // Вызов фактического метода быстрой сортировки char
    static void qsort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    // Вызов фактического метода быстрой сортировки int
    static void qsortInt(int[] x) {
        qsInt(x, 0, x.length - 1);
//        for (int i = 0; i < x.length - 1; i++){
//            for (int j = x.length - 1; j > i; j--){
//                if(x[j - 1] > x[j]){
//                    int temp = x[j - 1];
//                    x[j - 1] = x[j];
//                    x[j] = temp;
//                }
//            }
//        }
    }

    // Рекурсивная версия метода быстрой сортировки символов int
    private static void qsInt(int[] ints, int left, int right) {
        int i, j;
        int x, y;

        i = left;
        j = right;
        x = ints[(left + right) / 2];
        do {
            while ((ints[i] < x) && (i < right)) i++;
            while ((x < ints[j]) && (j > left)) j--;

            if (i <= j) {
                y = ints[i];
                ints[i] = ints[j];
                ints[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qsInt(ints, left, j);
        if (i < right) qsInt(ints, i, right);
    }

    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }
}

class QSDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd', 't', 'g', 'i', 'u', 'q'};
        int i;
        int[] s = {1, 2, 3, 122, 11, 5, 17, 12, 77};

        System.out.println("Иcxoдный массив : a ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Сортировка массива char a
        Quicksort.qsort(a);

        System.out.println("Oтcopтиpoвaнный массив : a ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Иcxoдный массив : s ");
        for (i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        // Сортировка массива int s
        Quicksort.qsortInt(s);

        System.out.println("Oтcopтиpoвaнный массив : s ");
        for (i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}