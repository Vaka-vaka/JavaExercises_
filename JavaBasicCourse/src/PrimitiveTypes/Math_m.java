package PrimitiveTypes;
/*Никакой высшей математики - школьный курс, класс эдак 5-6:
a + b = c - переносим с влево
a + b - c = 0
Вспоминаем лекцию - double это не целый тип и имеет погрешность. Погрешность задана в условии: 0.0001 (1E-4).
 То есть:
-0.0001 < a + b - c < 0.0001
А теперь самостоятельно формализуем это все в одну строчку в операторе return...*/

public class Math_m {
    public static boolean doubleExpression(double a, double b, double c) {
        /*return Math.abs((a + b) - c) < 0.0001;*/

        /*java.math.BigDecimal A = new java.math.BigDecimal(String.valueOf(a));
        java.math.BigDecimal B = new java.math.BigDecimal(String.valueOf(b));
        java.math.BigDecimal C = new java.math.BigDecimal(String.valueOf(c));
        return java.util.Objects.equals(A.add(B), C);*/

        return String.format("%.4f",a + b).equals(String.format("%.4f",c));
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(1, 0.2,1.2));
    }
}
