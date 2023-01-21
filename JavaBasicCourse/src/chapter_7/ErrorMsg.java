/**
 * Return an object of type String
 * Возврат объекта типа String
 *
 * @author Valentyn Mozul
 * @version 1.0 from 20.01.2023
 */

package chapter_7;

public class ErrorMsg {
    final int OUTTER = 0;
    final int INNER = 1;
    final int DISKER = 2;
    final int INDEXERR = 3;  // Объявление констант final

    String[] msq = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    //Возврат сообщения об ошибке
    String getError(int i){
        if (i >= 0 & i < msq.length)
            return msq[i];
        else return "Несуществующий код ошибки";
    }
}

class FinalDemo{
    public static void main(String[] args) {
        ErrorMsg errorMsg = new ErrorMsg();
        System.out.println(errorMsg.DISKER);
        System.out.println(errorMsg.INDEXERR);
        System.out.println(errorMsg.getError(2));
        System.out.println(errorMsg.getError(4));
    }
}
