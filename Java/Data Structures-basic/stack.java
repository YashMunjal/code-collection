public static class Element<T> {
    private T data;
    private Element next;
    
    
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data=data;
    }
    public Element getNext(){
        return next;
    }
    public void setNext(Element next){
        this.next=next;
    }
    public Element(T data, Element next){
        this.data=data;
        this.next=next;
    }
}
// exceptions
public static class StackOverflow extends exceptions{

}
public static class StackUnderflow extends exceptions{

}
//stack implementation

public class Stack<T>{
    private static int MAX_SIZE=40;
    private Element<T> top;
    private int size=0;
    
}