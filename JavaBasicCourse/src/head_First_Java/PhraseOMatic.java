/**
 * demo phrase o matic
 *
 * @author Valentyn Mozul
 * @version 1.0 from 16.08.2023
 */

package head_First_Java;

public class PhraseOMatic {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String[] wordListOne = {"red", "black", "grean", "blue", "gray", "jalow", "purple"};

        String[] wordListTwo = {"allple", "colo", "crug", "orange", "wife", "mom"};

        String[] wordListThree = {"car", "elephant", "dog", "cat", "teacher", "dad", "man", "woman", "child"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Read it " + phrase);
    }
}
