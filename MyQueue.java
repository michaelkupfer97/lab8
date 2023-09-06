package lab8;

public class MyQueue implements  Queue{

    private int size;
    private MyNode headNode;
    private MyNode tailNode;



    @Override
    public boolean isEmpty() {
        if (headNode==null)return true;
        return false;
    }

    @Override
    public void enqueue(MyNode node) {
        if(isEmpty()){
            headNode=node;
            tailNode=node;
            size++;
        }
        else {
            tailNode.next=node;
            tailNode=node;
            size++;
        }
    }

    @Override
    public MyNode dequeue() {
        if (isEmpty()){
            return null;
        }else {
            MyNode o = headNode;
            headNode = headNode.next;
            size--;
            return o;
        }
    }

    public void printQueue(){
        MyNode o = headNode;
        while(o.next!=null){
            System.out.println(o.toString());
            o=o.next;
        }
        System.out.println(o.toString());
    }
}
