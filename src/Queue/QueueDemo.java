package Queue;

//Fixed size queue
public class QueueDemo {

    //Queue of INT

    int arr[];
    int front;
    int rear;
    int cs;
    int N;


    QueueDemo(int defaultSize){
        N =defaultSize;
        arr = new int[defaultSize];
        front =0;
        rear =0;

    }

    void push(int x) {//push is also know as enqueue
        //if queue is not full
        if (!full()) {
            arr[rear] = x;

            rear = (rear + 1) % N;
            cs++;
        }
        else {
            System.out.println("Can't Insert " +x +" as queue is full");
        }
    }

    void pop(){
        // if queue is not empty
        if(!isEmpty()) {
            front = (front + 1)%N;
            cs--;
        }
    }

    int getFirst(){
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("Queue is empty ");
            return -1;
        }
    }

    boolean isEmpty(){
        return cs ==0;
    }

    boolean full(){
        return cs == N;
    }
}
