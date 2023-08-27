/**
 * demo
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.08.2023
 */

package head_First_Java;

public class Dog {
    String name;

    public void bark() {
        System.out.println(name + " сказав Гав");
    }

    public void eat() {
    }

    public void chaseCat() {
    }

    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        //Створюємо обєкт Dog і отримуємо до нього доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        // Тепер створюємо массив типу Dog
        Dog[] myDogs = new Dog[3];

        // додаємо до нього декілька елементів
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //Тепер отримуємо доступ до обєктів
        // Dog за допомогою посилань із массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        //Яке імя у myDogs[2]?
        System.out.print("Імя останньої собаки - ");
        System.out.println(myDogs[2].name);

        //Тепер пройдемся по елементам массиву
        // і визвемо для кожного метод bark()
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
