/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.deleteFile;

import java.io.File;

public class DeleteFile_ {
    private final String basePath;

    public DeleteFile_(String basePath) {
        this.basePath = basePath;
    }

    public void deleteFileMethod() {
        File file = new File(basePath);
        if (file.delete()) {
            System.out.println("File delete successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
