/**
 * Greate class Pet
 *
 * @author Valentyn Mozul
 * @version 1.0 from 25.03.2023
 */

package JavaKids;

public class Pet {
    private int age;
    private int height;
    private int weight;
    private String color;

    Pet(int a, int h, int w, String c) {
        this.age = a;
        this.height = h;
        this.weight = w;
        this.color = c;
    }

    int getAge() {
        return age;
    }

    void setAge(int a) {
        this.age = a;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int h) {
        this.height = h;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int w) {
        this.weight = w;
    }

    String getColor() {
        return color;
    }

    void setColor(String c) {
        this.color = c;
    }

    public void sleep() {
        System.out.println("Спокойной ночи, до завтра");
    }

    public void eat() {
        System.out.println("Я очень голоден… давайте перекусим чипсами!");
    }

    public String say(String aWord) {
        return "Ну ладно!! " + aWord;
    }
}

class Fish extends Pet {

    Fish(int a, int h, int w, String c) {
        super(a, h, w, c);
    }

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Ныряю на глубину " + howDeep + "  футов");
            System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
        }
        return currentDepth;
    }

    public String say(String something) {
        return "Ты чё не знаешь, что рыбы не разговаривают?";
    }
}

class PetMaster {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Pet pet = new Pet(4, 1, 23, "black");
        pet.eat();
        String petReaction = pet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        pet.sleep();
        System.out.println();

        Fish fish = new Fish(1, 1, 10, "grey");
        fish.dive(2);
        fish.dive(3);
        fish.dive(105);
        fish.dive(5);
        fish.dive(91);
        fish.sleep();
    }
}
