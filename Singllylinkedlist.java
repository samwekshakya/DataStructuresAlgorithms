class Node {
    int data;
    Node next;

    public Node(int el) {
        data = el;
        next = null;
    }

    public Node(int el, Node next) {
        data = el;
        this.next = next;

    }
}

class LinkedList {
    Node head, tail;

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    public void addToHead(int el) {
        Node node = new Node(el, head);
        if (tail == null) {
            tail = node;
        }
        
    }

    public void addToTail(int el) {
        if (!isEmpty()) {
            Node n = new Node(el);
            tail.next = n;
            tail = tail.next;
        } else {
            head = tail = new Node(el);
        }
    }

    public void deleteHead() {
        if (isEmpty()) {
            System.out.println("There are no elements in the list to delete");
        } else if (head == tail) {
            head = tail = null;
        } else
            head = head.next;
    }

    public void deleteTail() {
        if (isEmpty()) {
            System.out.println("There are no elements in the list to delete");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp=head;
            while(temp.next!=tail)
            {
                temp=temp.next;

            }
            temp.next=null;
            tail=temp;
        }
    }
    public void printAll()
    {
        System.out.println("The elements in the list are:");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

}

class Singllylinkedlist{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.isEmpty());
        list.addToHead(5);
        list.addToHead(10);
        list.addToHead(15);
        System.out.println(list.head.data);
        System.out.println(list.tail.data);
        // list.addToTail(6);
        // System.out.println(list.tail.data);
        // list.addToHead(20);
        // System.out.println(list.tail.data);
        // System.out.println(list.head.next.next.data);
        // list.deleteHead();
        // System.out.println(list.head.data);
        // list.deleteTail();
        // System.out.println(list.tail.data);
        list.printAll();


    }
}