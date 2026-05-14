class Notification extends EmailNotification {
    

    void makePayment(){
        System.out.println("payment has been done using UPI");
    }

    public static void main(String[] args) {
        Notification n1 = new Notification();

        n1.makePayment();
        n1.transaction();
    }
}
