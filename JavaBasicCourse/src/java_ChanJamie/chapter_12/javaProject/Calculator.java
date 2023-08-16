/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.08.2023
 */

package java_ChanJamie.chapter_12.javaProject;

public interface Calculator<T extends Number> {
    double calculateFees(T clubID);
}
