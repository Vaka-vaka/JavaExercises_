/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 08.08.2023
 */

package java_ChanJamie.chapter_12.javaProject;

import java.util.LinkedList;

public class JavaProject {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */

    public static void main(String[] args) {

        String mem;

        MemberschipManagement mm = new MemberschipManagement();
        FileHandler fh = new FileHandler();
        LinkedList<Member> members = fh.readFile();
        int choice = mm.getChoice();

        while (choice != -1) {
            switch (choice) {
                case 1 -> {
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                }
                case 2 -> {
                    mm.removeMembers(members);
                    fh.overWriteFile(members);
                }
                case 3 -> mm.printMemberInfo(members);
                default -> System.out.println("\nYou have \n" +
                        " selected an invalid option.\n\n");
            }
            choice = mm.getChoice();
        }
        System.out.println("\nGood Bye");
    }
}
