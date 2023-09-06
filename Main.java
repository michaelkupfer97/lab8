package lab8;

public class Main {
    public static void main(String[] args) {
        MyNode node1 = new MyNode(1);
        MyNode node2 = new MyNode(11);
        MyNode node3 = new MyNode(46);
        MyNode node4 = new MyNode(24);
        MyNode node5 = new MyNode(54);
        MyNode node6 = new MyNode(63);
        MyQueue queue = new MyQueue();
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        queue.enqueue(node5);
        queue.enqueue(node6);
        queue.printQueue();
        queue.dequeue();
        System.out.println("=================");
        queue.printQueue();




    }
}
