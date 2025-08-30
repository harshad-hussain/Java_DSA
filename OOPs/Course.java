package OOPs;

public class Course {
       String CourseName;
       private int CourseId;

       public Course(int CourseId,String CourseName){

        this.CourseId = CourseId;
        this.CourseName = CourseName;
       
     }

       
       public Course(String CourseName){
        this.CourseName = CourseName;
       }

       public int getCourseId(){
            return CourseId;
       }

       public void print(){
        System.out.println(CourseName +" and the  the course Id is  " + CourseId );
       }




}
