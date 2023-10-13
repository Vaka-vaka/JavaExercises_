/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-10-12
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_7.enums.ex_004;

public enum Company {
    // Экземпляры.
    WEBCAMP(1000) {
        // Можно переопределять методы для отдельных экземпляров.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {
        // Можно переопределять методы для отдельных экземпляров.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        // Можно переопределять методы для отдельных экземпляров.

        public String toStringS() {
            return "Company: " + super.toString();
        }

        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "euros";
        }
    };

    int value;

    // Конструктор может быть только private.
    Company(int value) {
        this.value = value;
    }

    // Можно переопределять методы "для всех" экземпляров перечисляемого типа.
    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}
