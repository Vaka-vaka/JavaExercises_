/**
 * java basic
 * lesson 3
 *
 * @version 1.0 from 2023-09-11
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_3;

public class ClassRoom {
    Pupil Vaka;
    Pupil Nata;
    Pupil Ramsas;
    Pupil Vova;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.Vaka = pupil1;
        this.Nata = pupil2;
        this.Ramsas = pupil3;
        this.Vova = pupil4;

        System.out.println("Vaka:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();

        System.out.println("Nata:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();

        System.out.println("Ramsas:");
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();

        System.out.println("Vova:");
        pupil4.study();
        pupil4.read();
        pupil4.write();
        pupil4.relax();
    }

    public Pupil getVaka() {
        return Vaka;
    }

    public void setVaka(Pupil vaka) {
        Vaka = vaka;
    }

    public Pupil getNata() {
        return Nata;
    }

    public void setNata(Pupil nata) {
        Nata = nata;
    }

    public Pupil getRamsas() {
        return Ramsas;
    }

    public void setRamsas(Pupil ramsas) {
        Ramsas = ramsas;
    }

    public Pupil getVova() {
        return Vova;
    }

    public void setVova(Pupil vova) {
        Vova = vova;
    }
}
