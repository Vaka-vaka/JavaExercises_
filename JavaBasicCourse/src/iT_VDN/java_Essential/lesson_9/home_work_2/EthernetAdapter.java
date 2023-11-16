/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-07
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.home_work_2;

public class EthernetAdapter {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
