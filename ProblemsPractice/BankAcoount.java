public class BankAcoount {
    
    private String accountNumber;
    private int balance;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        if(balance>0){
        this.balance = balance;
        }
    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String []args){
      
        BankAcoount b1 = new BankAcoount();

        b1.setAccountNumber("IODB23445");
        b1.setBalance(5000);

        System.out.println(b1.getAccountNumber());
        System.out.println(b1.getBalance());



    }
}
