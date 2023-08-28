/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 23.08.2023
 */

package head_First_Java;

public class PhraseOMatic2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String[] s1 = {"I", "You", "She", "He"};
        String[] s2 = {"swing", "wears", "go", "runs", "sleep", "see", "live", "love", "write", "lessen"};
        String[] s3 = {"from animals", "pants", "car", "in the taxi", "you", "fron Odessa", "HomeWork", "your"};

        int number1 = s1.length;
        int number2 = s2.length;
        int number3 = s3.length;

        int rand1 = (int) (Math.random() * number1);
        int rand2 = (int) (Math.random() * number2);
        int rand3 = (int) (Math.random() * number3);

        String phrase = s1[rand1] + " " + s2[rand2] + " " + s3[rand3];

        System.out.println(phrase);
    }
}
