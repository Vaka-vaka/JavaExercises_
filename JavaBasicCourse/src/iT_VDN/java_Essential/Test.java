package iT_VDN.java_Essential;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        System.out.println(myArray);
        for (int my:myArray) {
            System.out.print(my);
        }
        System.out.println();
        for (int i = 0; i < myArray.length;i++) {
            System.out.print(myArray[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));
    }
}
