package practiceQueue;

public class Node {
    private int key;
    protected Node next;
    public Node(int key){
        this.key=key;
        this.next=null;
    }

    public int getKey() {
        return key;
    }
}
