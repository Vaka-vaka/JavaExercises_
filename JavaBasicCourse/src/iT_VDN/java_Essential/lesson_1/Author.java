/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class Author {

    String name;

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("Автор - " + getName());
    }
}
