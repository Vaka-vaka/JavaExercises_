/**
 * Implementing the MyIF interface
 * Реализация интерфейса MyIF
 *
 * @author Valentyn Mozul
 * @version 1.0 from 07.03.2023
 */

package java.Herbert_Shield.chapter_8;

public class MyIFImp implements MyIF {
    //Реализации подлежит лишь метод getUserID() интерфейса MyIF.
    // Делать это для метода getAdminID() необязательно, поскольку
    // при необходимости может быть использована его реализация, заданная по умолчанию.
    @Override
    public int getUserID() {
        return 300;
    }

    @Override
    public int getAdminID() {
        return 54544;
    }

    public int getuID(){
        return MyIF.getUniversalID() + 123123;
    }
}


