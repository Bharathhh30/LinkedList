import java.util.ArrayList;
import java.util.Collections;

public class Monday {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    static class LinkedList {
        Node head;

        // insert
        void insert(int data){
            Node newNode = new Node(data);

            if(head==null){
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        //delete
        void delete(int value){
            if(head==null) return;

            if(head.data == value){
                head = head.next;
                return;
            }

            Node temp = head;
            Node prev = null;

            while (temp.next!=null) {
                if(temp.data == value){
                    prev.next = prev.next.next;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        
        // display
        void display(){
            Node temp = head;

            while (temp!=null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        //reverse a linkedlist long way
        void reverseA(){
            Node next = null;
            Node curr = head;
            Node prev = null;

            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(1);
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);

        ls.delete(3);

        ls.display();
        ls.reverseA();
        ls.display();
        
    }
}
