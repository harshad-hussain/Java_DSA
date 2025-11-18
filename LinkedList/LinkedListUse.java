    package LinkedList;
import java.net.Inet4Address;
import java.util.Scanner;

import javax.imageio.ImageIO;

    public class LinkedListUse {

        public static Node<Integer> createLinkedList(){
                
            Node<Integer> n1 = new Node<>(10);
            Node<Integer> n2 = new Node<>(20);
            Node<Integer> n3 = new Node<>(30);
            Node<Integer> n4 = new Node<>(40);
            
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;

            return n1;
        }

        public static void increment(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp!= null){
                temp.data++;
                temp = temp.next;
            }
        }
        
        public static void printLinkedList(Node<Integer> head){
            while(head != null){
                System.out.print(head.data + " ");
                head= head.next;
            }   
            System.out.println();
        }

        public static Node<Integer> takeInput(){
            Scanner s = new Scanner(System.in);
            int data = s.nextInt();
             Node <Integer> head = null; 
             Node<Integer> tail = null;
             while (data != -1) {
                Node<Integer> currentNode = new Node<Integer>(data);
                 if(head == null){
                     head = currentNode;
                     tail=currentNode;
                 }
                 else{
                    //this will take more time :
                    // Node<Integer> tail = head;
                    // while(tail.next != null){
                    //     tail= tail.next;
                    // }
                    // tail.next = currentNode;

                    tail.next = currentNode;
                    tail =currentNode;
                 }
                 data = s.nextInt();
             }
             return head;
        }


        public static void main(String[] args) {

        Node<Integer> head = takeInput();
        printLinkedList(head);
        increment(head);
        printLinkedList(head);

        }
    }
