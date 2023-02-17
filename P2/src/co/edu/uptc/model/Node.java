package co.edu.uptc.model;

public class Node {

    Object object;
    Node next;

    public Node(){

    }

    public Node(Object object, Node node){
        this.object = object;
        this.next = node;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
