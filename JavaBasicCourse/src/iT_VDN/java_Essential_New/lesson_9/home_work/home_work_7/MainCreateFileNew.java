/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-02
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7;

import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.createFile.CreateFileNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.createFile.CreateFileNew2;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.deleteFile.DeleteFile_;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.deleteFile.FileDelete_;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie.BufferedReaderNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie.FileReaderNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie.ReadFromFileUsingScanner;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.readFie.ReadingEntireFileWithoutLoop;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile.BufferedWriterNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile.FileWriterNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile.OutputStreamNew;
import iT_VDN.java_Essential_New.lesson_9.home_work.home_work_7.writeToFile.WriteFileString;

public class MainCreateFileNew {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        String basePathCreateFile = "W:/IT/Intelli IDEA(save projects)/" +
                "JavaExercises/JavaBasicCourse/src/iT_VDN/java_Essential_New/lesson_9/" +
                "home_work/home_work_7/createFile/file_Directory/";
        CreateFileNew createFileNew1 = new CreateFileNew(basePathCreateFile);
        //createFileNew1.createDirectory();
        //createFileNew1.newFile();

        CreateFileNew2 createFileNew2 = new CreateFileNew2();
        //createFileNew2.newFile();

        String basePath = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_5/input.txt";
        BufferedReaderNew bufferedReaderNew = new BufferedReaderNew(basePath);
        //bufferedReaderNew.bufferedReaderNewMethod();

        FileReaderNew fileReaderNew = new FileReaderNew(basePath);
        //fileReaderNew.fileReaderNewMethod();

        ReadFromFileUsingScanner scanner = new ReadFromFileUsingScanner(basePath);
        //scanner.readFromFileUsingScannerMethod();

        ReadingEntireFileWithoutLoop entireFileWithoutLoop = new ReadingEntireFileWithoutLoop(basePath);
        //entireFileWithoutLoop.readingEntireFileWithoutLoopMethod();

        WriteFileString writeFileString = new WriteFileString(basePath);
        String content = "Welcome to you\nAssigning the content of the file";
        //writeFileString.writeFile(content);

        FileWriterNew fileWriterNew = new FileWriterNew(basePath);
        //fileWriterNew.fileWriterMethod(content);

        BufferedWriterNew bufferedWriterNew = new BufferedWriterNew(basePath);
        //bufferedWriterNew.bufferedWriterMethod(content);
        //fileReaderNew.fileReaderNewMethod();

        OutputStreamNew outputStreamNew = new OutputStreamNew(basePath);
        //outputStreamNew.outputStreamMethod(content);
        //fileReaderNew.fileReaderNewMethod();

        String basePathDelete = "W:/IT/Intelli IDEA(save projects)/JavaExercises/JavaBasicCourse/" +
                "src/iT_VDN/java_Essential_New/lesson_9/home_work/home_work_7/createFile/" +
                "file_Directory";
        DeleteFile_ deleteFile_ = new DeleteFile_(basePathDelete);
        //deleteFile_.deleteFileMethod();

        FileDelete_ fileDelete_ = new FileDelete_(basePathDelete);
        //fileDelete_.fileDeleteMethod();
    }
}
