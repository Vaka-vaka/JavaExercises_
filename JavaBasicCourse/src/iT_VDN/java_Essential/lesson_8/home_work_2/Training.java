package iT_VDN.java_Essential.lesson_8.home_work_2;

public class Training {
    String fio;
    String position;
    int year;

    Training(String fio, String position, int year) {
        this.fio = fio;
        this.position = position;
        this.year = year;
    }

    @Override
    public String toString() {
        return "FIO = " + this.fio + " " + "Position = " + this.position + " " + "Year = " + this.year;
    }
}
