/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.deleteFile;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileDelete_ {

    private final String basePath;

    public FileDelete_(String basePath) {
        this.basePath = basePath;
    }

    public void fileDeleteMethod() {
        try {
            Files.deleteIfExists(Paths.get(basePath));
        } catch (NoSuchFileException e) {
            System.out.println("No such file/directory exists");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory id not empty.");
        } catch (IOException e) {
            System.out.println("Invalid permissions.");
        }
        System.out.println("Deletion successful.");
    }
}
