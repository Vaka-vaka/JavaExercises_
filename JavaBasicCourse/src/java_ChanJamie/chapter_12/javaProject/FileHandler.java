/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 03.08.2023
 */

package java_ChanJamie.chapter_12.javaProject;

import java.util.LinkedList;
import java.io.*;

public class FileHandler {

    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("members.txt"));

            lineRead = reader.readLine();

            while (lineRead != null)
            {
                splitLine = lineRead.split(", ");

                if (splitLine[0].equals("S"))
                {
                    mem = new SingleClubMember('S', Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                } else {
                    mem = new MultiClubMember('M', Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return m;
    }

    public void appendFile(String mem) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("members.txt", true))) {
            writer.write(mem + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overWriteFile(LinkedList<Member> m) {
        String s;
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("members2.txt", false))) {
            for (int i = 0; i < m.size(); i++) {
                s = m.get(i).toString();
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File("members.txt");
            File tf = new File("members2.txt");

            tf.renameTo(f);
            tf.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
