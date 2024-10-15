package MyStackLL;

class Node{
    public int data;//
    public Node next = null;//node object that points to null

    public Node(int data){//this will require the node to have data when created
        this.data = data;

    }
}

public class MyStackLL {

    /*
     * what do we need??
     * properties/variables - 
        * items(nodes),
        * top(head),
        * size(varies with top variable)
     * 
     * methods/functions -
     *  push(add node in front/top)
     *  pop(remove nod from front/top)
     *  isEmpty()
     *  peek(return top/head node value)
     */

    private Node top;
    private int size;

    public MyStackLL(){
        top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){//basically remove the first element of LL
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public int peek(){
        return top.data;
    }

    public boolean isEmpty(){
        if(top.next == null) return true;
        
        return false;
    }

    public int size(){
        return size;
    }

    public String toString(){
        Node current = top;
        StringBuilder result = new StringBuilder();

        while(current != null){//traversing and adding element to StringBuilder
            result.append(current.data);
            if(current.next != null){
                result.append("-->");
            }
            current = current.next;
        }
        
        return result.toString();
    }
}

