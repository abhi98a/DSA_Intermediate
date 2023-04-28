package Stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
         StackDemo s = new StackDemo();
         s.push(1);
         s.push(2);
         s.push(3);
        s.pop();
        s.push(0);
        s.push(2);
        s.push(7);
         s.pop();

        while(!s.empty()){
            System.out.println(s.top());
            s.pop();
        }

        Stack<Integer> mystack = new Stack<Integer>();
        mystack.push(5);
        mystack.push(4);
        mystack.push(3);
        mystack.push(2);
        mystack.push(8
        );
        mystack.push(9);

        mystack.pop();
        System.out.println(mystack.peek());
    }
}
