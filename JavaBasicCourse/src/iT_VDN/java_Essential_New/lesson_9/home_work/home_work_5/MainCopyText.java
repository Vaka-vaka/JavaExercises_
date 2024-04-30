/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-26
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_5;

public class MainCopyText {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {

        String basePath = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_5";

        CopyText copyText = new CopyText(basePath);
        String fileName1 = "input.txt";
        String fileName2 = "output.txt";
        copyText.createFileText(fileName1);
        copyText.createFileText(fileName2);
        String content = "Самостійна діяльність студента\n" +
                "Завдання 1\n" +
                "Зчитати текст з клавіатури та вивести його на екран у верхньому регістрі.\n" +
                "Завдання 2\n" +
                "Створити програму, яка запитує в користувача його ім'я та записує його у файл \"user.txt\".\n" +
                "Завдання 3\n" +
                "Створіть програму, яка приймає від користувача рядок тексту та повертає кількість символів у цьому рядку, включаючи пробіли та пунктуаційні знаки.\n" +
                "Завдання 4\n" +
                "Створіть програму, яка копіює вміст одного текстового файлу \"input.txt\" у новий файл \"output.txt\".\n" +
                "Завдання 5\n" +
                "Створіть програму для копіювання бінарного файлу. Виберіть будь-який бінарний файл, наприклад, зображення або аудіофайл, і скопіюйте його у новий файл з іншим ім'ям.";
        copyText.writeTextToFile(fileName1, content);

        copyText.readTextFromFileAndWriterTextToFile(fileName1, fileName2);

    }
}
