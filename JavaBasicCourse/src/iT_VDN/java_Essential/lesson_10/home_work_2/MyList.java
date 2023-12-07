/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-13
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.home_work_2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void addMethod(T type) {
        list.add(type);
    }

    public int getIndexMethod(T index) {
        return list.indexOf(index);
    }

    public int countMethod() {
        return list.size();
    }
}
