public class DLLNode {
    int info;
    DLLNode prev,next;
    
    public DLLNode(int el){
        this.prev=null;
        this.info=el;
        this.next=null;
    }
    
    public DLLNode(DLLNode prev,int el, DLLNode next)
    {
        this.prev=prev;
        this.info=el;
        this.next=next;
    }
}

class DLList{
    DLLNode head,tail;
    public DLList()
    {
        head=tail=null;
    }

    public boolean isEmpty()
    {
        return head==null&&tail==null;
    }

    public void addToHead(int el)
    {
        DLLNode node;
        if(!isEmpty()){
            node=new DLLNode(null, el, head);
            head=node;
            head.next.prev=head;
        }
        else
        {
            tail=head=new DLLNode(el);
        }
    }

    public void addToTail(int el){
        DLLNode node;
        if(!isEmpty()){
            node= new DLLNode(el);
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        else
            tail=head=new DLLNode(el);
    }

    public void printAll(){
        System.out.println("The list is: ");
        System.out.print("H->");
        DLLNode node=head;
        while(node!=null){
            System.out.print(node.info+"<->");
            node=node.next;
        }
        System.out.println("T<->null");
    }

    public void printAllRev(){
        System.out.println("The list in reverse is: ");
        System.out.print("null<->T<->");
        DLLNode node=tail;
        while(node!=null){
            System.out.print((node.info+"<->"));
            node=node.prev;
        }
        System.out.println("H");
    }

    public void deleteHead(){
        if(isEmpty())
            System.out.println("List is empty!");
        else if(head==tail)
            head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
    }

    public void deleteTail(){
        if(isEmpty())
            System.out.println("List is empty!");
        else if(head==tail)
            head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    public int search(int el){
        DLLNode temp=head;
        int counter=1;
        if(!isEmpty()){
            do{
              if(temp.info==el)
                break;
            counter++;
            temp=temp.next;
            }while(temp!=null);
        }
        if(temp==null)
            return 0;
        else
            return counter;
    } 
}

class DoubleLLMain {

    public static void main(String[] args) {
    
        DLList list = new DLList();
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
