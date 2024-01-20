/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-21
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.home_work_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class GreatHashMap {
    HashMap<String, String> hashMap = new HashMap<>();

    public void addHashMap(String stringK, String stringV) {
        hashMap.put(stringK, stringV);
    }

    public void printKey(String key) {
        Set<String> strings = hashMap.keySet();
        if (strings.contains(key)) {
            String kEy = hashMap.get(key);
            System.out.println("Переклад слова " + key + " - " + kEy);
        } else {
            System.out.println("Такого слова немає у словнику");
        }
    }

    public void printValues(String values) {
        Collection<String> val = hashMap.values();
        if (val.contains(values)) {
            System.out.println(true);
        } else {
            System.out.println("?((");
        }
    }
}
