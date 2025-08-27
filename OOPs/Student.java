package OOPs;

public class Student {
     public  String name;
      private int rollNo;

     public int getrollNo(){
        return rollNo; 
     }

     public void setrollNo(int rollNo){
        if(rollNo <= 0){
            return;
        }
        this.rollNo = rollNo;
     }


}
