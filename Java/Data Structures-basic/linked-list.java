// generic class

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data=data;
        setNext(null);
    }

    // getters and setters

    public  Node<T> getNext(){
        return next;
    }
    public void Node<T> setNext(Node<T> next){
            this.next=next;
    }
    public T getData(){
        return data;
    }

    @Override
    public String toString(){
            return String.valueOf(data);
    }
}