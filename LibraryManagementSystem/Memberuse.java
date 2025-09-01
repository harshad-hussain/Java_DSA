package LibraryManagementSystem;

public class Memberuse {
    public static void main(String[] args) {
        Member m1 = new StudentMember();

        Member m2= new FacultyMember();

        m1.SetMemberId(101);
        m1.SetMemberName("Param");
        m1.SetMemberphnNo(989324085);

        m2.SetMemberId(2001);
        m2.SetMemberName("Harsh");
        m2.SetMemberphnNo(949820493);

        m1.getMemberShipType();
        m1.printDetails();

        m2.getMemberShipType();
        m2.printDetails();

        
    }
}
