/**
 * java basic
 * lesson 10
 *
 * @version 1.0 from 2023-11-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_10.generic.ex_002;

public class MyGenerics<TYPE1, TYPE2> {
    public TYPE1 variable1;
    public TYPE2 variable2;

    MyGenerics(TYPE1 argument1, TYPE2 argument2) {
        this.variable1 = argument1;
        this.variable2 = argument2;
    }
}
