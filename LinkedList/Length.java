package LinkedList;

public class Length {

    public static Node<Integer> createList(){

        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);

        n1.next= n2;
        n2.next = n3;

        return n1;
    }

    public static int printLength(Node<Integer> head){
        int count =0;
        Node<Integer> temp = head;

        while(temp!= null){
            count++;
            temp = temp.next;
        }

        return   count;

    }


    public static void main(String[] args) {
        
        Node<Integer> head = createList();
        printLength(head);
       
        System.out.println(printLength(head));
        
    }
}
