package Stack;


class Node{
    int data;
    Node next;
    Node(int d){
        data =d;
        next =null;
    }
}
public class StackDemo {
    Node head;
    StackDemo(){
        head =null;
    }

    void push(int d){

        //insert at head
        if(head==null){
            head = new Node(d);
        }else {
            Node n = new Node(d);
            n.next = head;
            head = n;
        }
    }

    void pop(){
        //remove at head
        if(head!=null){
            head = head.next;
        }

    }

    int top(){
            return head.data;
    }

    boolean empty(){
        return head==null;
    }


}
