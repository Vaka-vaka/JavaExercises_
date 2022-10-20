/**
 * Conditional operators and loops
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.10.2022
 */

package Operators_and_Loops;

import java.util.Arrays;

class MergeArray {

      int[] megreArray(int[] a1, int[] a2) {

          // a1 и a2 – массивы, которые надо слить
          int[] a3 = new int[a1.length + a2.length]; //a3 – результирующий массив

          int i = 0, j = 0; //i и j – индексы для массивов a1 и a2 соответственно,
          // которые указывают на текущие элементы на каждом шаге и образуют тот самый буфер.
          for (int k = 0; k < a3.length; k++) {
//Первые два условия проверяют, что бы индексы не вышли за переделы количества элементов в массивах
              if (i > a1.length - 1) {
                  int a = a2[j];
                  a3[k] = a;
                  j++;
              } else if (j > a2.length - 1) {
                  int a = a1[i];
                  a3[k] = a;
                  i++;
//Третье и четвертое условия обеспечивают перемещение в массив наименьшего элемента из первого
// массива и из второго соответственно
              } else if (a1[i] < a2[j]) {
                  int a = a1[i];
                  a3[k] = a;
                  i++;
              } else {
                  int b = a2[j];
                  a3[k] = b;
                  j++;
              }
          }
          return a3;

          /*int[] result = new int[arr1.length + arr2.length];
          int i = 0, j = 0, r = 0;
          while (i < arr1.length && j < arr2.length) {
              if (arr1[i] < arr2[j]) {
                  result[r] = arr1[i];
                  i++;
              } else {
                  result[r] = arr2[j];
                  j++;
              }
              r++;
          }
          if (i < arr1.length) {
              System.arraycopy(arr1, i, result, r, (arr1.length - i));
          }
          if (j < arr2.length) {
              System.arraycopy(arr2, j, result, r, (arr2.length - j));
          }
          return result;*/

        /* return Stream.of(a1, a2)
                  .flatMapToInt(Arrays::stream)
                  .boxed()
                  .collect(Collectors.groupingBy(e -> e,
                          TreeMap::new, Collectors.counting()))
                  .entrySet().stream()
                  .flatMapToInt(e ->
                          LongStream.range(0, e.getValue()).mapToInt(v -> e.getKey()))
                  .toArray();*/
      }
}

class ArrayDemo{
    public static void main(String[] args) {
        MergeArray mergeArray1 = new MergeArray();
        System.out.println(Arrays.toString(mergeArray1.megreArray(new int[]{0, 2, 2}, new int[]{1, 3})));
        System.out.println(Arrays.toString(mergeArray1.megreArray(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(mergeArray1.megreArray(
                new int[]{-4, -3, -1}, new int[]{-10, -5, -2})));
        System.out.println(Arrays.toString(mergeArray1.megreArray(new int[]{}, new int[]{1, 3})));
    }
}

