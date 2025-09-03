package LibraryManagementSystem;

public class FacultyMember extends Member implements BorrowableInterface {
    
    public String DepartmentName;

     public void getMemberShipType(){
        System.out.println("This is Faculty Membership");
     }

     public void printDetails(){
        System.out.println("This is faculty member and  name is " + getMemberName() +  " phnone number is "+getMemberphnNo());
     }

     @Override
     public void borrowBook(String BookName){
       System.out.println("Student " + getMemberName() + "borrowed" + BookName ) ;
     }

    @Override
    public void returnBook(String bookName) {
        System.out.println("Student " + getMemberName() + " returned the book: " + bookName);
    }
}
