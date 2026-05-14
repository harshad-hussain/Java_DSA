public class Employee extends Person{
     
    Employee(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println(name + "is working");
    }

    public static void main(String[] args) {
        Employee e1= new Employee("Harsh", 25);

        e1.walk();
        e1.eat();
        e1.work();
    }
}
