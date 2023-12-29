/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_2;

public class MainHomeWork_2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        GreatArrayList greatArrayList = new GreatArrayList();
        greatArrayList.addNumber();

        System.out.println("_____-----_______-------_______-------");

        GreatLinkedList greatLinkedList = new GreatLinkedList();
        greatLinkedList.stringsLinkedList();
        greatLinkedList.getStringsLinkedList();

        System.out.println("____-----_____------______-------______");

        GreatHashSet greatHashSet = new GreatHashSet();
        greatHashSet.addColor("blue");
        greatHashSet.addColor("green");
        greatHashSet.addColor("orange");
        greatHashSet.addColor("withe");
        greatHashSet.addColor("black");
        greatHashSet.printSet();

        System.out.println("_____---___---___---__---_---__----__---__-");

        GreatHashMap greatHashMap = new GreatHashMap();
        greatHashMap.addHashMap("orange", "помаранчевий");
        greatHashMap.addHashMap("blue", "голубий");
        greatHashMap.addHashMap("withe", "білий");
        greatHashMap.addHashMap("green", "зелений");
        greatHashMap.addHashMap("black", "чорний");
        System.out.println(greatHashMap.hashMap.toString());
        greatHashMap.printKey("blue");
        greatHashMap.printKey("green");
        greatHashMap.printValues("помаранчевий");
        greatHashMap.printValues("крик");
    }
}
