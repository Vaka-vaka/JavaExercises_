/**
 * Comparison of the publix and private access modifiers
 *
 * @author Valentyn Mozul
 * @version 1.0 from 14.11.2022
 */

package chapter_6;

public class MyClass {
    private int alpha;  // закрытый доступ
    public int beta;  // открытый доступ
    int gamma;  // тип доступа по умолчанию (по сути, puЬlic)

    // Методы доступа к переменной alpha. Члены класса могут
    // обращаться к закрытым членам того же класса.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Доступ к переменной alpha возможен только с помощью
        // специально предназначенных для этой цели методов
        myClass.setAlpha(-99);
        System.out.println("myClass.alpha = " + myClass.getAlpha());

        // Обращение к переменной alpha так, как показано ниже недопустимо
        //myClass.alpha = 10; // Ошибка : alpha - закрытая переменная !

        // Следующие обращения вполне допустимы, так как
        // переменные beta и gamma являются открыты
        myClass.beta = 88; //  открытый доступ
        myClass.gamma = 99; //  открытый доступ
    }
}
