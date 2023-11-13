/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-14
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3.documentWorker;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats \n" +
                "available in the Expert version");
    }
}
