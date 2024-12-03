class CircularDoublyLL {
    CircularDoublyLL prev;
    CircularDoublyLL next;
    int info;

    public CircularDoublyLL(CircularDoublyLL tail,int el,CircularDoublyLL head){
        this.prev=tail;
        info=el;
        this.next=head;
    }

}

class LinkedList{
    CircularDoublyLL head;
    CircularDoublyLL tail;
    public LinkedList(){
        head=tail=null;
    }

    public boolean isEmpty(){
        return (head==null)&&(tail==null);
    }
    public void addToHead(int el){
        CircularDoublyLL node=new CircularDoublyLL(tail,el,head);
        if(isEmpty()){
            head=tail=node;
            head.prev=head;
            head.next=head;
        }

        else{
            head.prev=node;
            tail.next=node;
            head=node;
        }
    }

    public void addToTail(int el){
        CircularDoublyLL node=new CircularDoublyLL(tail,el,head);
        if(isEmpty()){
            head=tail=node;
            tail.prev=head;
            tail.next=head;
        }

        else{
            tail.next=node;
            head.prev=node;
            tail=node;
        }
    }

    public void deleteHead(){
        if(isEmpty())
            System.out.println("Empty list!");
        else if(head==tail)
            head=tail=null;
        else{
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
    }

    public void deleteTail(){
        if(isEmpty())
            System.out.println("Empty List!");
        else if(head==tail)
            tail=head=null;
        else{
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
        }
    }

    public void printAll(){
        CircularDoublyLL temp=head;
        do{
            System.out.print(temp.info+"--");
            temp=temp.next;
        }while(temp!=head);
    }

    public void printAllRev(){
        CircularDoublyLL temp=tail;
        do{
            System.out.print(temp.info+"--");
            temp=temp.prev;
        }while(temp!=tail);
    }

    public int search(int el){
        CircularDoublyLL temp=head;
        int counter=1;
        int flag=0;
        if(!isEmpty()){
            do{
                if(temp.info==el){
                    flag=1;
                    break;
                }
            counter++;    
            temp=temp.next;
            }while(temp!=head);
        }
        if(flag==0)
            return 0;
        else
            return counter;
    }

}



class CircularDoublyMain{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addToHead(5);
        list.addToHead(6);
        list.addToTail(7);
        list.addToTail(8);
        
        System.out.println("Before Deletion");
        list.printAll(); 
         list.printAllRev();
        System.out.println("after deletion");
        list.deleteHead();
        list.deleteTail();
        list.printAll();
        list.printAllRev();
    
    }
}
