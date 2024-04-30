/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-26
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_5;

import java.io.*;

public class CopyText {

    private final String basePath;

    public CopyText(String basePath) {
        this.basePath = basePath;
    }

    public void createFileText(String fileName) {
        File file = new File(basePath, fileName);
        if (file.exists()) {
            System.out.println("Файл " + fileName + " вже існує!");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл " + fileName + " створено успішно!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeTextToFile(String fileName, String content) {
        try {
            File file = new File(basePath, fileName);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Дані успішно записані у файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTextFromFileAndWriterTextToFile(String fileNameInp, String fileNameOut) {
        try {
            File fileInp = new File(basePath, fileNameInp);
            FileReader fileReader = new FileReader(fileInp);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File fileOut = new File(basePath, fileNameOut);
            FileWriter fileWriter = new FileWriter(fileOut);
            String content;
            while ((content = bufferedReader.readLine()) != null) {
                fileWriter.write(content);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
