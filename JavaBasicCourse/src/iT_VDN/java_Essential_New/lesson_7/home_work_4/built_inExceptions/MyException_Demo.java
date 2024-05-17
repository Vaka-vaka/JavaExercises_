/**
 * java basic
 * home_work
 *
 * @version 1.0 from 2024-05-08
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work_4.built_inExceptions;

public class MyException_Demo extends Exception {
    private static final int[] accno = {1001, 1002, 1003, 1004};

    private static final String[] name = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

    private static final double[] bal = {10000.0, 12000.00, 5600.0, 999.00, 1100.55};

    MyException_Demo() {
    }

    MyException_Demo(String str) {
        super(str);
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);

                if (bal[i] < 1000) {
                    MyException_Demo me = new MyException_Demo("Balance is less than 1000");
                    throw me;
                }
            }
        } catch (MyException_Demo e) {
            e.printStackTrace();
        }
    }
}
