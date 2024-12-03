// class Node { //Node class
//     int info;
//     Node next;

//     public Node(int el) {//constructor
//         info = el;
//         next = null;
//     }

//     public Node(int el, Node next) {//constructor
//         info = el;
//         this.next = next;

//     }
// }

// class LinkedList {
//     Node head, tail;

//     public LinkedList() { //constructor
//         head = tail = null;
//     }

//     public boolean isEmpty() { //checks is the list is empty or not
//         return (head == null) && (tail == null);
//     }

//     public void addToHead(int el) {
//         if(isEmpty())
//         {
//             head = new Node(el, head);
//             tail=head;
//             tail.next=head;
//        }
//        else
//        {
//             head = new Node(el, head);
//             tail.next=head;
//        }
//     }

//     public void addToTail(int el) {
//         Node node=new Node(el);
//         if (!isEmpty()) {
//             tail.next=node;
//             tail=node;
//             tail.next=head;
//         } 
//         else {
//             head=tail=node;
//         }
//     }

//     public void deleteHead() {
//         if (isEmpty()) {
//             System.out.println("There are no elements in the list to delete");
//         } else if (head == tail) {
//             head = tail = null;
//         } else{
//             head=head.next;
//             tail.next=head;
//         }
//     }

//     public void deleteTail() {
//         if (isEmpty()) {
//             System.out.println("There are no elements in the list to delete");
//         } else if (head == tail) {
//             head = tail = null;
//         } else {
//             Node temp=head;
//             while(temp.next!=tail)
//                 temp=temp.next;
//             temp.next=head;
//             tail=temp;
//         }
//     }

//     public int search(int el){
//         Node temp=head;
//         int counter=1;
//         int flag=0;//to know if the key has been found or not
//         if(!isEmpty()){
//             do{
//               if(temp.info==el){
//                 flag=1;
//                 break;
//               }
//             counter++;
//             temp=temp.next;
//             }while(temp!=head);
//         }
//         if(flag==0)
//             return 0;//key not in list
//         else
//             return counter;//key found so returns its position
//     }

//     public void printAll()
//     {
//         System.out.println("The elements in the list are:");
//         Node temp=head;
//         while(temp!=null)
//         {
//             System.out.print(temp.info+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }   

// }

// class SinglyLinkedListDemo {
//     public static void main(String[] args) {
        
//         LinkedList list = new LinkedList();
//       list.addToHead(5);
//        list.addToHead(6);
//        list.addToTail(7);
//        list.addToTail(8);
//     System.exit(0);
//        System.out.println("Before Deletion");
//        list.printAll(); 
//       /*  System.out.println("after deletion");
//        list.deleteHead();
//        list.deleteTail();
//        list.printAll(); */
//         }

//     }
