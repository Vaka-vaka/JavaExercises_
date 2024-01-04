/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2024-01-03
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_2;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public void throwException() throws CustomException {
        throw new CustomException("custom exception");
    }
}
