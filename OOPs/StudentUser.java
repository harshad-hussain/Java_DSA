package OOPs;

public class StudentUser {
    public static void main(String[] args) {
        Student s1 = new Student("ANkush");
        Student s2 =new Student("Afrid");

        // s1.name ="Harshad";
        // s1.setrollNo(20);
           
        System.out.println(s1.name + " " + Student.getStudentCount()  + " " + s1.dateofBirthReturn() );

        // s2.name = "Hussain";
        // s2.setrollNo(40);
        System.out.println(s2.name+ " "+  " " +  Student.getStudentCount() + "  " + s2.getrollNo() );

        

    }
}
