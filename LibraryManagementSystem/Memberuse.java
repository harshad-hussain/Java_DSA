package LibraryManagementSystem;

public class Memberuse {
    public static void main(String[] args) {
        Member m1 = new StudentMember("Harsh");

        Member m2= new FacultyMember();

       

        m1.SetMemberId(101);
        m1.SetMemberName("Param");
        m1.SetMemberphnNo(989324085);

         BorrowableInterface s1 = new StudentMember("Harsh");
        s1.borrowBook("Game of thrones");
        s1.returnBook("Game of thrones ");

        BorrowableInterface f1 = new FacultyMember();
        f1.borrowBook("Metamorphosis");
        f1.returnBook("Metamorphosis");

        m2.SetMemberId(2001);
        m2.SetMemberName("Harsh");
        m2.SetMemberphnNo(949820493);

        m1.getMemberShipType();
        m1.printDetails();

        m2.getMemberShipType();
        m2.printDetails();

        
    }
}
