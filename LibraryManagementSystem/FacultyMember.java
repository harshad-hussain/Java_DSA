package LibraryManagementSystem;

public class FacultyMember extends Member {
    
    public String DepartmentName;

     public void getMemberShipType(){
        System.out.println("This is Faculty Membership");
     }

     public void printDetails(){
        System.out.println("This is faculty member and  name is " + getMemberName() +  " phnone number is "+getMemberphnNo());
     }
}
