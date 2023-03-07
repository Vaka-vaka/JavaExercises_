/**
 * Using the default interface method
 * Использование интерфейсного метода по умолчанию
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.03.2023
 */

package chapter_8;

public class MyIFDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyIFImp imp = new MyIFImp();
        // Вызов метода getUserID() возможен, поскольку он явно реализован классом MyIFImp
        System.out.println("Идентификатор пользователя " + imp.getUserID());

        //Вызов метода getAdmiпID() также возможен, поскольку предоставляется его реализация по умолчанию
        System.out.println("Идентификатор администратора : " + imp.getAdminID());

        int uID = MyIF.getUniversalID() + 1000002302;
        //Вызов метода getUniversalID() также возможен
        System.out.println("Идентификатор универсальный : " + uID);

        //Вызов метода getuID() также возможен
        System.out.println("Идентификатор универсальный2 : " + imp.getuID());
    }
}
