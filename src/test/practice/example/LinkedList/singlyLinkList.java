package test.practice.example.LinkedList;

public class singlyLinkList {
    public static void printNodes(Node head){
        while (head!=null) {
            System.out.print(head.data+" -> ");
            head=head.next;
        }
    }

    public static Node insertAtStart(int n,Node head){
        Node temp=new Node(n);
        temp.next=head;
        head=temp;

        return head;
    }

    public static Node insertAtEnd(int n,Node head){
        Node temp=head;

        while (temp.next!=null)
            temp=temp.next;

        temp.next=new Node(n);

        return head;
    }

    public static Node deleteFirstNode(Node head){

        Node temp=head.next;
        head.next=null;
        head=temp;

        return head;
    }

    public static Node deleteLastNode(Node head){
        if (head==null) return null;
        if (head.next==null)return null;
        Node temp=head;
        while (temp.next.next!=null)
            temp=temp.next;

        temp.next=null;

        return head;
    }

    public static Node insertAtPosition(Node head,int n,int position){
        Node temp=head;
        int i=1;
        while(temp!=null && i<=position-2){
            temp=temp.next;
            i++;
        }
        Node temp2=new Node(n);
        temp2.next=temp.next;
        temp.next=temp2;

        return head;
    }
    public static void main(String[] args) {
        Node head= null;
        head=insertAtStart(30,head);
        head=insertAtStart(20,head);
        head=insertAtStart(30,head);

        head=insertAtEnd(40,head);
        printNodes(head);
        System.out.println("------------before deleting starting node------------");
        head=deleteFirstNode(head);
        printNodes(head);
        System.out.println("------------before delete end node------------");
        head=deleteLastNode(head);
        printNodes(head);
        System.out.println("----------------------");
        head=insertAtPosition(head,66,2);
        printNodes(head);
    }
}
