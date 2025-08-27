package OOPs;

public class Student {
     public  String name;
      private int rollNo;

     public int getrollNo(){
        return rollNo; 
     }

     public void setrollNo(int num){
        if(num <= 0){
            return;
        }
        rollNo = num;
     }


}
