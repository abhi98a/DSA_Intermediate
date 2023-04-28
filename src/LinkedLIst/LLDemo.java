package LinkedLIst;


class  Node{
    int data;
    Node next;

    Node(int d){
        data =d;
        next = null;
    }
}
public class LLDemo {

    static Node createLl(int N){
        Node head = new Node(1);
        Node tail = head;

        for(int i=2;i<=N; i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;

    }


    static  void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }

    static  int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        return count;
    }

    static Node insertAtHead(Node head,int data){
        Node temp = new  Node(data);
        temp.next = head;
        head = temp;
        return head;// return the new head

    }

    static Node insertAtPos(Node head,int data,int pos){
        if(pos==0){
            return insertAtHead(head,data);
        }
        if(pos>length(head)){
            return head;
        }
        Node n = new Node(data);
        Node temp = head;
        for(int jump=1;jump <pos;jump++){
            temp =temp.next;

        }

        n.next = temp.next;
        temp.next =n;

        return head;


    }

    public static void main(String[] args) {

        Node LinkedList = createLl(7);
        printLL(LinkedList);
        System.out.println();
        System.out.println("The length of LL is  = "+length(LinkedList));
        LinkedList = insertAtHead(LinkedList,20);
        printLL(LinkedList);
        System.out.println();
        LinkedList = insertAtPos(LinkedList,40,3);
        printLL(LinkedList);
        System.out.println();
        LinkedList = insertAtPos(LinkedList,100,6);
        printLL(LinkedList);



        /*loop to create a linked list of nodes from 1 to n
        Node head = new Node(1);
        Node tail = head;
        int N =7;
        for(int i=2;i<=N; i++){
            tail.next = new Node(N);
            tail = tail.next;
        }
        */

        /* Linke list with 3 nodes by adding at tail
        Node head =new Node(5);
        Node tail =head;

        tail.next = new Node(7);
        tail = tail.next;
        tail.next = new Node(8);

        //n1.next =n2;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

         */


    }

}
