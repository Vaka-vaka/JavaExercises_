package iT_VDN.java_Essential.lesson_9.home_work_1;

public class Animal_IT_VDN {
    //Поля класа
    String name;
    int age;
    Boolean tail;

    //Конструктор с параметрами
    public Animal_IT_VDN(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    //Перегрузка методов toString(). equals(), hashCode()
    @Override
    public String toString() {
        return "Имя: " + this.name + "; возраст: " + this.age + "; хвост: " + this.tail;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
