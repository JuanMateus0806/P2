package co.edu.uptc.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

public class ListUptc implements List {

    Node head;

    public ListUptc(){
        head = null;
    }

    @Override
    public int size() {
        Node tmp =head;
        int count = 0;
        while (tmp!=null){
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        Node aux = findNode(o);
        if (aux!=null)
            return true;
        else
            return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node tmp = head;
        Node node = new Node(o,null);
        if (head==null){
            head=node;
        }else{
            while(tmp.getNext()!=null){
                tmp = tmp.getNext();
            }
            tmp.setNext(node);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node tmp = head;
        Node node = findNode(o);
        int count = 0;
        while (tmp.getNext() != null && tmp.getNext()!=node){
            count++;
            tmp = tmp.getNext();
        }
        remove(count);
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        head=null;
    }

    @Override
    public Object get(int index) {
        Node tmp = head ;
        try {
            for (int i=0; i<index;i++){
                tmp = tmp.getNext();
            }
        }catch (NullPointerException e){
            throw new IndexOutOfBoundsException();

        }
        if (tmp==null){
            throw new IndexOutOfBoundsException();
        }
        return tmp.getObject();
    }

    @Override
    public Object set(int index, Object element) {
        Node tmp = findNode(index);
        Object aux = tmp.getNext();
        tmp.setObject(element);
        return aux;
    }

    private Node findNode(int index) {
        Node tmp = head;
        int count = 0;
        while (tmp != null && count<index){
            count++;
            tmp = tmp.getNext();
        }
        if (count != index){
            throw new IndexOutOfBoundsException();
        }else
            return tmp;
    }

    private Node findNode(Object object){
        Node tmp = head;
        while (tmp != null && tmp.getObject()!= object){
            tmp = tmp.getNext();
        }
        return tmp==null?null:tmp.getObject()==object?tmp:null;
    }



    @Override
    public void add(int index, Object element) {
        Node node = new Node(element,null);
        if(index==0){
            node.setNext(head);
            head = node;
        }else {
            Node tmp = findNode(index);
            node.setNext(tmp.getNext());
            tmp.setNext(node);
        }
    }

    @Override
    public Object remove(int index) {
        Node tmp = head;
        if (index==0){
            head = head.getNext();
        } else{
            tmp = findNode(index-1);
            tmp.setNext(tmp.getNext().getNext());
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        Node node = head;
        Node tmp = findNode(o);
        int count = 0;
        while (tmp!=node && tmp!=null){
            System.out.println("eee");
            count++;
            node = node.getNext();
        }
        return count;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {

        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
