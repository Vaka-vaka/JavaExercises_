/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class MainClassRoom {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
       ExcelentPupil excelentPupil = new ExcelentPupil();
       GoodPupil goodPupil = new GoodPupil();
       BadPupil badPupil = new BadPupil();

       new ClassRoom(excelentPupil, goodPupil, badPupil, goodPupil);
    }
}
