package Day13;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    public void insertAtstart(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    public void insertAtend(int data){
        Node nn=new Node(data);
        Node ptr=head;
        if(head==null){
            head=nn;
            return;
        }
        while(ptr.next!=null)
            ptr=ptr.next;
        ptr.next=nn;
    }
    public void insertAtpos(int pos,int data){
        if(pos==0){
            insertAtstart(data);
            return;
        }
        Node nn=new Node(data);
        Node ptr=head;
        for(int i=1;i<pos;i++){
            if(ptr==null)
                return;
            ptr=ptr.next;
        }
        nn.next=ptr.next;
        ptr.next=nn;
    }
    
    public void delAtstart(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        head=head.next;
    }
    public void delAtend(){
        Node ptr=head;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(ptr.next.next!=null)
            ptr=ptr.next;
        ptr.next=null;
    }
    public void delAtpos(int pos){
        if(pos==0){
            delAtstart();
            return;
        }
        Node ptr=head;
        for(int i=1;i<pos;i++){
            if(ptr==null)
                return;
            ptr=ptr.next;
        }
        if(ptr==null || ptr.next==null)
            return;
        ptr.next=ptr.next.next;
    }
    
    public void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
}

public class linked_list {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtstart(10);
        ll.insertAtend(30);
        ll.insertAtend(45);
        ll.display();
        ll.delAtstart();
        System.out.println();
        ll.display();
        ll.delAtend();
        System.out.println();
        ll.display();
        System.out.println();
        ll.insertAtpos(0,20);
        ll.insertAtpos(1, 35);
        ll.insertAtpos(2, 40);
        ll.display();
        ll.reverse();
        System.out.println();
        ll.display();
    }
}
