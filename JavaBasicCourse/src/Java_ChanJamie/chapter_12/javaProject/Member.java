/**
 * java project fitness center
 *
 * @author Valentyn Mozul
 * @version 1.0 from 31.07.2023
 */

package Java_ChanJamie.chapter_12.javaProject;

public class Member {
    private char memberType;
    private int memberID;
    private String name;
    private double fees;

    Member(char pMemberType, int pMemberID, String pName, double pFees) {
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees;
    }

    public void setMemberType(char pMemberType) {
        memberType = pMemberType;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberID(int pMemberID) {
        memberID = pMemberID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setFees(double pFees) {
        fees = pFees;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "memberType " + memberType + " \n" +
                "memberID " + memberID + " \n" +
                "name " + name + " \n" +
                "fees " + fees + "\n";
    }
}
