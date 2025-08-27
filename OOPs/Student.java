package OOPs;

public class Student {
     public  String name;
      private int rollNo;
      final static double DateofBirth = 18.04;
      static int numStudents;


      public Student(String name){
        this.name = name;
        numStudents++;
        this.rollNo = numStudents;
      }
     public int getrollNo(){
        return rollNo;  
     }

     public double dateofBirthReturn(){
        return DateofBirth;
     }

     public void setrollNo(int rollNo){
        if(rollNo <= 0){
            return;
        }
        numStudents++;
        this.rollNo = numStudents;
     }


}
