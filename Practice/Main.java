public class Main {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head; // very importanrt guru

        // insert data
        void insert(int data){
            // create newnode first
            Node newNode = new Node(data);

            // if head is null
            if(head==null){
                head = newNode;
                return;
            }

            // insertion 
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // deletion 
        void delete(int value){
            // if no head return 
            if (head == null){
                return;
            }

            // if head is asked for deletion
            if (head.data == value){
                head = head.next;
            }

            // rest any kind of deletion
            Node temp = head;
            Node prev = null;

            while(temp!=null){
                if (temp.data == value){
                    prev.next = prev.next.next;
                    break;
                }

                prev = temp;
                temp = temp.next;
            }
        }

        // display list
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display(); // 1-2-3-4

        list.delete(3);

        list.display();
    }
}
