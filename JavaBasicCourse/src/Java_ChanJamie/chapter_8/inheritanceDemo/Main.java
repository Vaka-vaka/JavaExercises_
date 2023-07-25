/**
 * demo inheritance
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.07.2023
 */

package Java_ChanJamie.chapter_8.inheritanceDemo;

public class Main {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
//        NormalMember mem1 = new NormalMember("Kostay", 1, 2013);
//        VIPMember mem2 = new VIPMember("Andriy", 15, 2019);
//        JenMember mem3 = new JenMember("Zhenya", 6, 2020);
//
//        mem1.calculateAnnualFee();
//        mem1.displayMemInfo();
//        System.out.println();
//        mem2.calculateAnnualFee();
//        mem2.displayMemInfo();
//        System.out.println();
//        mem3.calculateAnnualFee();
//        mem3.displayMemInfo();
//
//        mem1.setDiscount();
//        mem1.calculateAnnualFee();
//        mem1.displayMemInfo();
        Member[] clubMemers = new Member[7];

        clubMemers[0] = new NormalMember("KostayN", 1, 2013);
        clubMemers[1] = new NormalMember("AndriyN", 15, 2019);
        clubMemers[2] = new NormalMember("ZenyaN", 6, 2020);
        clubMemers[3] = new VIPMember("AndriyV", 15, 2019);
        clubMemers[4] = new VIPMember("ZenyaV", 6, 2020);
        clubMemers[5] = new JenMember("Zenya", 6, 2020);
        clubMemers[6] = new VIPMember("VIPMember", 1, 2222);

//      for (int i = 0; i < clubMemers.length; i++){
//          clubMemers[i].calculateAnnualFee();
//          clubMemers[i].displayMemInfo();
//          System.out.println();
//      }

        for (Member m : clubMemers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
            System.out.println();
        }
    }
}
