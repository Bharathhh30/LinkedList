public class Practice {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class LinkedList{
        Node head;

        // insert
        void insert(int data){
            Node newNode = new Node(data);

            if(head==null){
                head = newNode;
                return;
            }

            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newNode;
        }


        // delete
        void delete(int value){
            if(head == null){
                return;
            }

            if(head.data == value){
                head = head.next;
                return;
            }

            Node temp = head;
            Node prev = null;

            while (temp!=null) {
                if(temp.data == value){
                    prev.next = prev.next.next;
                    break;
                }

                prev = temp;
                temp = temp.next;
            }
        }

        // display
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(40);

        list.display();

        list.delete(10);

        list.display();
    };
}
