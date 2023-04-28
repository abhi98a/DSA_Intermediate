package Queue;

public class QueueTest {

    public static void main(String[] args) {
        QueueDemo q =  new QueueDemo(5);
        q.push(1);
        System.out.println(q.getFirst());
        q.push(5);
        q.push(10);
        System.out.println(q.getFirst());
        q.push(7);
        q.push(9);
        q.push(5);
        q.push(10);
        q.pop();
        System.out.println(q.getFirst());
        while(!q.isEmpty()){
            System.out.println("The queue is " +q.getFirst());
            q.pop();
        }


        q.push(89);
        q.push(6);
        q.pop();

        while(!q.isEmpty()){
            System.out.println("The queue is " +q.getFirst());
            q.pop();
        }


    }
}
