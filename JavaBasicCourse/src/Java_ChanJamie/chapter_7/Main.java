/**
 * @author Valentyn Mozul
 * @version 1.0 from 24.06.2023
 */

package Java_ChanJamie.chapter_7;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Staff staff = new Staff("Peter");
        staff.setHoursWorked(160);
        int pay = staff.calculatePay(1000, 400);
        System.out.println("Pay " + pay);

        System.out.println("++++++++++++++++++++++");

        Staff staff2 = new Staff("Jane", "Lee");
        staff2.setHoursWorked(160);
        pay = staff2.calculatePay();
        System.out.println("Pay " + pay);

        System.out.println("++++++++++++++++++++++++++++++++");

        System.out.println("\n\nUpdating Jane's Hours Worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked = " + staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Pay " + pay);
    }
}
