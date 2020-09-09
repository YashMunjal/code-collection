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

// Linked list class

public class LinkedList<T extends Comparable<T>> implements cloneable {
    private Node<T> head=null;
    public LinkedList(){

    }

    //traverse 
    Node<Integer> h=head;
    while(h!=null){
        h.getNext();
    }
}

// count the number of nodes in the linkedList
public int countNodes(){
    if(head==null){
        return 0;
    }else{
        Node<T>=curr;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}


//Add a node

public void addNode(T data){
    if(head==null){
        head=new Node<T>(data);

    }else{
        Node<T> curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node<T>(data);
    }
    curr.setNext(new Node<T> data);
}

//return the first element in list

public T pop(){
    if(head!=null){
            T topElement=head.data;
            head=head.next;
            return topElement; 
    }
    return null;
}