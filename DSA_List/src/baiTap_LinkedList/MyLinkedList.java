package baiTap_LinkedList;

import java.util.Objects;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        if (temp == null) {
            head = new Node(element);
        } else {
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(element);
        }
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Out of range");
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Out of range");
        } else if (index == 0) {
            holder = head;
            head = temp.next;
            numNodes--;
            return (E) holder.data;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E) holder;
        }
    }

    public boolean remove(Object e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(e)) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contanins(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Out of range");
        } else {
            Node temp = head;
            for (int i = 0; i < numNodes; i++) {
                if (index == i) {
                    return (E) temp.data;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public void clear(){
        head=null;
        numNodes=0;
    }
    public MyLinkedList clone(){
        Node temp=head;
        MyLinkedList newMyLinkedList=new MyLinkedList();
        newMyLinkedList.addFirst( new Node(temp.data));
        temp=temp.next;
        while (temp!=null){
            newMyLinkedList.addLast( new Node(temp.data));
            temp=temp.next;
        }
        return newMyLinkedList;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

