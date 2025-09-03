package LibraryManagementSystem;

public class StudentMember extends Member implements BorrowableInterface {
     public String courseName;

     public StudentMember(String name){
         SetMemberName(name);
     }

     @Override
     public void borrowBook(String BookName){
       System.out.println("Student " + getMemberName() + "borrowed" + BookName ) ;
     }

    @Override
    public void returnBook(String bookName) {
        System.out.println("Student " + getMemberName() + " returned the book: " + bookName);
    }


     @Override
     public void getMemberShipType(){
        System.out.println("This is student Membership");
     }

     @Override
     public void printDetails(){
        System.out.println("The student name is " + getMemberName() + getMemberphnNo());
     }


}
