/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-04-30
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    private final String basePathInp;
    private final String basePathOut;

    public CopyFile(String basePathInp, String basePathOut) {
        this.basePathInp = basePathInp;
        this.basePathOut = basePathOut;
    }

    public void copyFile(String sourceFile, String destinationDirectoryName) {
        try {
            File file = new File(basePathInp, sourceFile);
            File destinationDirectory = new File(basePathOut, destinationDirectoryName);
            File destinationFile = new File(destinationDirectory, sourceFile);

            try (FileInputStream fileInputStream = new FileInputStream(file);
                 FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {
                byte[] buffer = new byte[1024];

                int byteRead;
                while ((byteRead = fileInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }
                System.out.println("Файл " + sourceFile + " успішно скопійовано в директорію "
                        + destinationDirectoryName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
