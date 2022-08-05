package baiTap_LinkedList;

import java.util.Arrays;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Huy");
        myLinkedList.addFirst("Thang");
        myLinkedList.addFirst("Chương");
        myLinkedList.addFirst("Trình");
        myLinkedList.addLast("Son");
        myLinkedList.add(5, "tanh");
        myLinkedList.printList();
        System.out.println(myLinkedList.remove("Huy"));
        myLinkedList.printList();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contanins("tanh"));
        myLinkedList.add("Ken");
        myLinkedList.add("Tung");
        myLinkedList.printList();
        System.out.println(myLinkedList.get(6));
        myLinkedList.remove(0);
        myLinkedList.printList();
        System.out.println(myLinkedList.getFirst());
        myLinkedList.printList();
    }
}
