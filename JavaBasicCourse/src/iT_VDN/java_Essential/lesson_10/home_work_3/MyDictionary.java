/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.home_work_3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<Tkey, Tvalue> {
    Map<Tkey, Tvalue> dictionary = new HashMap<>();

    public Map<Tkey, Tvalue> getDictionary() {
        return dictionary;
    }

    public void addMethod(Tkey tkey, Tvalue tvalue) {
        dictionary.put(tkey, tvalue);
    }

    public Tvalue indexMethod(Tkey key) {
        return dictionary.get(key);
    }

    public int getCountMethod() {
        return dictionary.size();
    }
}
