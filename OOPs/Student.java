package OOPs;

public class Student {
     public  String name;
      private int rollNo;
      final static double DateofBirth = 18.04;
      private static int numStudents;

      
      //Creating constructor and defining the static variable count to the roll no
      public Student(String name){
        this.name = name;
        numStudents++;
        this.rollNo = numStudents;    
      }

      //Getter method for the getting the numStudents static variable
      public static int getStudentCount(){
         return numStudents;
      }

      //Getter method for the getting roll no which is private
     public int getrollNo(){
        return rollNo;  
     }

       //Getter method for the private final static variable so it will be fixed and will not have access to modify by anyone can just view
     public double dateofBirthReturn(){
        return DateofBirth;
     }

      //Setter method to set the private variable
     public void setrollNo(int rollNo){
        if(rollNo <= 0){
            return;
        }
        numStudents++;
        this.rollNo = numStudents;
     }


}
