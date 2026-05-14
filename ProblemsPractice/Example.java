import java.util.Scanner;

public class Example{

     String name;
     int id;
    int salary;

     Example(String name,int id, int salary){
     this.name = name;
     this.id =id;
     this.salary = salary;  
    }

    public  void getDetails(){
        System.out.println(" the name is " + name + " and id is " +  id );
    }

    public static void main(String[] args){
     
      Example e1 = new Example("Harsh",101,2000);

      Example e2 = new Example("Kiran",534,8908);


      e1.getDetails();
      e2.getDetails();

        
       
    

     
     
     }    

}