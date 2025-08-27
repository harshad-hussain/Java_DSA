package OOPs;

public class StudentUser {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 =new Student();

        s1.name ="Harshad";
        s1.setrollNo(20);

        System.out.println(s1.name + " " + s1.getrollNo());

        s2.name = "Hussain";
        s2.setrollNo(40);
        System.out.println(s2.name+ " "+ s2.getrollNo());
    }
}
