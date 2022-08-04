package baiTap_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void add(int index, E element) {
        if (size == elements.length - 1) {
            ensureCapacity();
        }
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Out of range");
        } else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public boolean add(E e) {
        if (size == elements.length - 1) {
            ensureCapacity();
        }
        elements[size++] = e;
        return true;
    }

    public E remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("Out of range");
        }
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean contanins(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i=0;i<size;i++){
            if (elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public E get(int i){
        if (i > size - 1 || i < 0) {
            throw new IndexOutOfBoundsException("Out of range");
        }
        return (E)elements[i];
    }
    public void clear(){
        for (int i=0;i<size;i++){
            elements[i]=null;
        }
        size=0;
    }
    public E[] clone(){
        Object[] newMyList=new Object[size];
        for (int i=0; i<size;i++){
            newMyList[i]=elements[i];
        }
        return (E[]) newMyList;
    }
    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp += elements[i] + " ";
        }
        return "Size: " + size + ", MyList: [ " + temp + "]";
    }
}
