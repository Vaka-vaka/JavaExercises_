/**
 * java basic
 * lesson 6
 *
 * @version 1.0 from 2023-12-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_6.lesson6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {
    public void runMapExamples() {
        Map<String, Fruit> fruitMap = new HashMap<>();
        Fruit mango = new Fruit("mango", 50, true);
        Fruit apple = new Fruit("apple", 15, false);
        Fruit banana = new Fruit("banana", 35, true);
        Fruit orange = new Fruit("orange", 24, true);
        fruitMap.put(mango.getName(), mango);
        fruitMap.put(apple.getName(), apple);
        fruitMap.put(banana.getName(), banana);
        fruitMap.put(orange.getName(), orange);
        Fruit fruit = fruitMap.get("banana");
        System.out.println(fruit);

        Set<String> strings = fruitMap.keySet();
        Collection<Fruit> values = fruitMap.values();
//        System.out.println("K = " + strings);
//        System.out.println("V = " + values);
        iterateUsingEntrySet(fruitMap);

     //   Set<Map.Entry<String, Fruit>> entries = fruitMap.entrySet();
    }

    public void iterateUsingEntrySet(Map<String, Fruit> fruitMap) {
        for (Map.Entry<String, Fruit> fruitEntry : fruitMap.entrySet()) {
            String key = fruitEntry.getKey();
            Fruit fruit = fruitEntry.getValue();
            System.out.println("key " + key + " value " + fruit);
        }
    }
}
