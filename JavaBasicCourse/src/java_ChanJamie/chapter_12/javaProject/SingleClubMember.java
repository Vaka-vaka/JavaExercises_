/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.08.2023
 */

package java_ChanJamie.chapter_12.javaProject;

public class SingleClubMember extends Member {
    private int club;

    SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);

        club = pClub;
    }

    public void setClub(int pClub) {
        club = pClub;
    }

    public int getClub() {
        return club;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " + club;
    }
}
