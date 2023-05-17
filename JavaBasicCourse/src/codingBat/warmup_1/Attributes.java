/**
 * Defining Attributes
 *
 * @author Valentyn Mozul
 * @version 1.0 from 09.12.2022
 */

package codingBat.warmup_1;

import java.util.Scanner;

public class Attributes {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        //set customer's data to object here
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {
    //add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}
