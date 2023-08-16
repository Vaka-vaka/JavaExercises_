/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.08.2023
 */

package java_ChanJamie.chapter_12.javaProject;

public class MultiClubMember extends Member {

    private int memberShipPoints;

    MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMemberShiPoints) {
        super(pMemberType, pMemberID, pName, pFees);

        memberShipPoints = pMemberShiPoints;
    }

    public void setMemberShipPoints(int pMemberShipPower) {
        memberShipPoints = pMemberShipPower;
    }

    public int getMemberShipPoints() {
        return memberShipPoints;
    }

    public String toString() {
        return super.toString() + ", " + memberShipPoints;
    }
}
