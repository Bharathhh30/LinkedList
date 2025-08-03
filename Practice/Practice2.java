public class Practice2 {
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

            if (head==null){
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
            if(head==null){
                return;
            }

            if(head.data == value){
                head = head.next;
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

            while (temp!=null) {
                System.out.print(temp.data+ "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(21);
        ls.insert(22);
        ls.insert(23);
        ls.insert(24);

        ls.delete(23);
        ls.display();
    }
}
