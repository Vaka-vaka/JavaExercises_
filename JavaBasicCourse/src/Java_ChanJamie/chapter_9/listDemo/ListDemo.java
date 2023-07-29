/**
 * demo list
 *
 * @author Valentyn Mozul
 * @version 1.0 from 26.07.2023
 */

package Java_ChanJamie.chapter_9.listDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        //List<Integer> userAgeList = new ArrayList<>();
        List<Integer> userAgeList = new LinkedList<>();
        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);
        System.out.println("userAgeList " + userAgeList);
        System.out.println("size = " + userAgeList.size());
        userAgeList.remove(3);
        System.out.println("size = " + userAgeList.size());
        System.out.println("contains = " + userAgeList.contains(12));
        System.out.println("indexOf = " + userAgeList.indexOf(12));
        System.out.println("get = " + userAgeList.get(2));
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println("userAgeArray[0] = " + userAgeArray[0]);
        System.out.println("userAgeList = " + userAgeList);

        System.out.println("+++++++++=====================");
    }


}
