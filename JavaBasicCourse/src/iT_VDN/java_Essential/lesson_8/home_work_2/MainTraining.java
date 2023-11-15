package iT_VDN.java_Essential.lesson_8.home_work_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class MainTraining {
    public static void main(String[] args) throws IOException {
        Training[] trainings = new Training[1];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < trainings.length; i++) {
            String fio = "";
            String position = "";
            int year;

            System.out.println("Input FIO:");
            fio = reader.readLine();
            System.out.println("Input POSITION:");
            position = reader.readLine();
            System.out.println("Input YEAR:");
            year = Integer.parseInt(reader.readLine());

            trainings[i] = new Training(fio, position, year);
        }

        for (Training num : trainings) {
            System.out.println(num);
        }

        System.out.println("Input value");
        int value = Integer.parseInt(reader.readLine());

        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);

        for (int i = 0; i < trainings.length; i++) {
            int year = trainings[i].year;
            int stag = yearNow - year;
            if (stag > value) {
                System.out.println(trainings[i].toString());
            } else {
                System.out.println("Такого стажу немає");
            }
        }
    }
}
