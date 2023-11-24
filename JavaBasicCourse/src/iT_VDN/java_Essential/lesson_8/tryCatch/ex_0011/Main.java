/**
 * java basic
 * lesson 8
 *
 * @version 1.0 from 2023-10-18
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_8.tryCatch.ex_0011;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception("Exception");
                } catch (Exception e) {
                    System.out.println("Catch 1: " + e.getMessage());
                    throw new Exception();
                } finally {
                    System.out.println("Finally 1:");
                }
            } catch (Exception e) {
                System.out.println("Catch 2: " + e.getMessage());
                throw new Exception();
            } finally {
                System.out.println("Finally 2:");
                throw new Exception("New Exception");
            }
        } catch (Exception e) {
            System.out.println("Catch 3: " + e.getMessage());
        } finally {
            System.out.println("Finally 3:");
        }
    }
}
