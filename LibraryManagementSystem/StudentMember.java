package LibraryManagementSystem;

public class StudentMember extends Member {
     public String courseName;

     @Override
     public void getMemberShipType(){
        System.out.println("This is student Membership");
     }

     @Override
     public void printDetails(){
        System.out.println("The student name is " + getMemberName() + getMemberphnNo());
     }
}
