/**
 * java advanced
 * lesson 1
 *
 * @version 1.0 from 2023-11-20
 * @author Valentyn Mozul
 */

package iT_VDN.java_Advanced.lesson_1.colectionLesson;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparableStudent implements Comparable {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent) o).group) {
            return 1;
        } else if (this.group < ((SimpleComparableStudent) o).group) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SimpleComparatorStudent implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        return ((SimpleComparableStudent)o1).getFirstName().
//                compareTo(((SimpleComparableStudent)o2).getFirstName());
        //and
        String firstName1 = ((SimpleComparableStudent)o1).getFirstName();
        String firstName2 = ((SimpleComparableStudent)o2).getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Yevhenii", 44),
                new SimpleComparableStudent("Andrew", 22),
                new SimpleComparableStudent("Igor", 11),
                new SimpleComparableStudent("Petro", 33)
        };

        Arrays.sort(myStudents);

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println("Group = " + myStudent);
        }
        System.out.println();
        Arrays.sort(myStudents, new SimpleComparatorStudent());
        for (SimpleComparableStudent tmp : myStudents) {
            System.out.println("FirstName = " + tmp);
        }

    }
}

