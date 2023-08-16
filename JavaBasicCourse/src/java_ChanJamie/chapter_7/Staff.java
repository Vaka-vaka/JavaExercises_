/**
 * @author Valentyn Mozul
 * @version 1.0 from 24.06.2023
 */
package java_ChanJamie.chapter_7;

public class Staff {
    private String nameOfStaff; //имя сотрудника
    private final int hourlyRate = 30; //почасовая ставка
    private int hoursWorked; //отработанные часы

    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------------------");
    }

    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("-----------------------------");
    }

    public void setHoursWorked(int hours) {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: HoursWorked Cannot be \n" +
                    " Smaller than Zero");
            System.out.println("Error: HoursWorked is not \n" +
                    " updated");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void printMessage() {
        System.out.println("Calculating Pay....");
    }

    public int calculatePay() {
        printMessage();

        int staffPay;
        staffPay = hourlyRate * hoursWorked;

        if (hoursWorked > 0) {
            return staffPay;
        } else {
            return -1;
        }
    }

    public int calculatePay(int bonus, int allowance) {
        printMessage();

        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }
}
