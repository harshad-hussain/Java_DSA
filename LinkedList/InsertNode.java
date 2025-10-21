package LinkedList;

import java.util.Scanner;

import Recursion.printNatural;

public class InsertNode {
  
        
    public static Node<Integer> takeInput(){   
       Scanner s = new Scanner(System.in);
       int data = s.nextInt();
       Node<Integer> head = null;
       Node<Integer> tail = null;

       while(data != -1){
         Node<Integer> newNode = new Node<Integer>(data);
        if(head == null){
             head = newNode;
             tail = newNode;
        }else{
            tail.next= newNode;
            tail = newNode;
        }
            data = s.nextInt();
       }
       return head;
    }

    public static Node<Integer> insertNode(Node<Integer> head,int pos,int data){
        int count =0;
        Node<Integer> insertNode = new Node<Integer>(data);
        if(pos==0){
            insertNode.next = head;
            head = insertNode;
        }else{
            Node<Integer> temp = head;
        
        while(count < pos-1 && temp != null){
            temp = temp.next;
            count++;
        }
        if(temp==null){
            return head;
        }
        insertNode.next = temp.next;
        temp.next = insertNode;
    }
        return head;
    }

       public static void printLinkedList(Node<Integer> head){
            while(head != null){
                System.out.print(head.data + " ");
                head= head.next;
            }   
            System.out.println();
        }

      public static void main(String[] args) {
        Node<Integer> head = takeInput();

        insertNode(head, 2, 55);
        printLinkedList(head);

    }
}
