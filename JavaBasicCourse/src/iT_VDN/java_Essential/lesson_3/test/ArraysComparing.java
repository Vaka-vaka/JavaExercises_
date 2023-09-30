package iT_VDN.java_Essential.lesson_3.test;

import java.util.Arrays;

public class ArraysComparing {
    public static void main(String[] args) {
        int[] i1[] = {{1, 2, 3}, {0, 0, 0}};
        int[][] i2 = {{1, 2, 3}, {0, 0, 0}};
        int[][] i3 = new int[2][3];
        System.arraycopy(i1, 0, i3, 0, i3.length);
        System.out.println(Arrays.equals(i1, i2));
        System.out.println(Arrays.equals(i1, i3));
        System.out.println(Arrays.equals(i1, i2));
    }
}
//false,true,false;