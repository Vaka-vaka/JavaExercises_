/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_6;

public class MainCopyFile {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        String basePathInp = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/lesson9/container";
        String basePathOut = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/";

        CopyFile copyF = new CopyFile(basePathInp, basePathOut);
        String sourceFile = "img.png";
        String directory = "home_work_6";
        copyF.copyFile(sourceFile, directory);
    }
}
