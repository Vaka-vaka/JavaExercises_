/**
 * The return of the object defined by the programmer
 *
 * @author Valentyn Mozul
 * @version 1.0 from 19.11.2022
 */

package java.Herbert_Shield.chapter_6;

public class Err {
    String msg;  // сообщение об ошибке
    int severity;  // уровень серьезности ошибки

    Err (String m, int s){
        msg = m;
        severity = s;
    }
}

class ErrorInfo{
    String[] msgs = {"Hello and bye",
            "I am fine, are you?",
            "I have three boys",
            "Kostya, Andrey, Zhenya"
    };

    int[] howbad = {1, 2, 3, 4};

    Err getErrorInfo(int i){
        if (i >= 0 & i < msgs.length) return new Err(msgs[i], howbad[i]);
        else return new Err("Не существующий код ошибки ", 0);
    }
}

class ErrInfo{
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " level " + e.severity);

        e = err.getErrorInfo(54);
        System.out.println(e.msg + " level " + e.severity);

        e = err.getErrorInfo(3);
        System.out.println(e.msg + " level " + e.severity);

        e = err.getErrorInfo(1);
        System.out.println(e.msg + " level " + e.severity);
    }
}
