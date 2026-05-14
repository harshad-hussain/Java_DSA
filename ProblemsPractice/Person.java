    public class Person {

        String name;
        int age;

        Person(String name,int age){
            this.name = name;
            this.age = age;
        }

        public void walk(){
            System.out.println("the " + name+ "is walking");
        }

        public void eat(){
            System.out.println( name + " is eating"  );
        }
        
        
    }
