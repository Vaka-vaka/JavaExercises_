/**
 * demo inheritance
 *
 * @author Valentyn Mozul
 * @version 1.0 from 21.07.2023
 */

package Java_ChanJamie.chapter_8.inheritanceDemo;

public class NormalMember extends Member {

    public NormalMember() {
        System.out.println("Child constructor with no parameter");
    }

    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 90);
    }
}
