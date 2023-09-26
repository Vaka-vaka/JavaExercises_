/**
 * java basic
 * lesson 1
 *
 * @author Valentyn Mozul
 * @version 1.0 from 29.08.2023
 */

package iT_VDN.java_Essential.lesson_1;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    void getPrint() {
        System.out.println(
                "index - " + getIndex() + "\n"
                        + "city - " + getCity() + "\n"
                        + "street - " + getStreet() + "\n"
                        + "house - " + getHouse() + "\n"
                        + "apartment - " + getApartment());
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Address address = new Address(
                19804, "Ukraine", "Kiev", "Sashenka", 33, 234);
        address.getPrint();
        System.out.println("+++=====++++===++++====++++===");

        address.setIndex(12300);
        int index = address.getIndex();
        System.out.println("index - " + index);

        address.setCountry("Ukraine");
        System.out.println("country - " + address.getCountry());

        address.setCity("Kiev");
        String city = address.getCity();
        System.out.println("city - " + city);

        address.setStreet("Sashenka");
        System.out.println("street - " + address.getStreet());

        address.setHouse(45);
        int house = address.getHouse();
        System.out.println("house - " + address.getHouse());

        address.setApartment(344);
        System.out.println("apartment - " + address.getApartment());
    }
}
