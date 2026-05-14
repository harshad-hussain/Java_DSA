public class withdrawl implements AtmTransaction {
    
    public void display (){
     System.out.println("the withdrwall has been processed by the bank");
    }

    public static void main(String[] args) {
        withdrawl w = new withdrawl();

        w.display();
    }
}
