/**
 * demo inheritance
 *
 * @author Valentyn Mozul
 * @version 1.0 from 22.07.2023
 */

package java_ChanJamie.chapter_8.inheritanceDemo;

public class JenMember extends Member {
    public JenMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters\"");
    }

    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * 1160;
    }
}
