package iT_VDN.java_Essential.lesson_7;

import java.util.EnumSet;

enum PCounter {UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE}
public class Test_1 {
    public static void main(String[] args) {
        EnumSet enumSet = EnumSet.range(PCounter.TRES, PCounter.CINCO);
        EnumSet enumSet1 = EnumSet.complementOf(enumSet);
        System.out.println(enumSet1);
    }
}


