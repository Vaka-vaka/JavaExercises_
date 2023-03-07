/**
 * Basic information about the default methods
 * Основные сведения о методах по умолчанию
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.03.2023
 */

package chapter_8;

public interface MyIF {
    //Объявление обычного метода интерфейса, которое НЕ включает определение реализации по умолчанию
    int getUserID();

    //Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 0;
    }

    //Объявление статического метода интерфейса
    static int getUniversalID() {
        return 2 * 2;
    }
}
