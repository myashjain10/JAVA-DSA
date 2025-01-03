package JavaDSA.MyLinkedList;

class Node{
    public int data;//
    public Node next = null;//node object that points to null

    public Node(int data){//this will require the node to have data when created
        this.data = data;
    }

}

public class MyLinkedList {
    private Node head;
    private Node tail;
    
    public MyLinkedList(){
        head = null;
        tail = null;
    }
    public void insert(int value){// insert a new value
        Node node = new Node(value);

        if(head == null){//LL is empty
            head = tail =  node;//remember the syntax

        }
        else{

            tail.next = node;//first add address of new node to previous node i.e. link the new node
            tail = node;//then move the tail to new node
        }
    }

    // find the index of given element value
    public int indexOf(int value){
        int index = 0;
        Node current = head;

        while(current != null){
            if(current.data == value){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    // find of sum of elements of LL
    public int sum(){
        Node current = head;
        int sum = 0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
    // add a node at the start
    public void insertAtStart(int value){
        Node node = new Node(value);//first- create a node of new value

        if(head == null){//if LL is empty
            head = tail = node;
            return;
        }

        node.next = head; //second - point that node to head
        head = node;      // third - make the new node as head

    }

    //add element at specific index
    public void insertAtIndex(int value, int index){
        Node node = new Node(value);
        Node current = head;
        Node prev = null;

        while(index >0 && current != null){//set current & prev to desired index nodes, by traversing till that index
            prev = current;
            current = current.next;
            index--;
        }

        prev.next = node;
        node.next = current;

    }

    public void reverse(){
        //we will basically reverse all the links
        //edge cases
        // if LL is empty or head=null
        //if LL has only one element
        if(head == null || head.next == null){
            return;
        }


        //initialize the 3 variables prev, current, next
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(next != null){
            current.next = prev; // links the current element to prev
            prev = current; // shift prev to current element
            current = next; // shift current to next element
            next = next.next; // shift next to its next element(which it points to)
        }
        current.next = prev;// links the last element to second last element
        head = current;

    }

    public void deleteFromStart(){
        if(head == null){return;}

        //just change the head to second element
        Node secNode = head.next;//save the second element
        head.next = null;//remove the link from 1st to 2nd Element
        head = secNode;// make 2nd element as head

    }

    public void deleteFromEnd(){
        if(head == null){return;}

        if(head == tail){ //single element LL
            head = tail = null;
            return;
        }
        //traverse the array just before the tail and remove the link
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = null;//removes the link to last element
        tail = current; // update the tail to current

    }

    public void printRec(Node head){
        if(head == null) return;

        System.out.print(head.data + "-->");
        printRec(head.next);
        //if you want to print the LL in reverse
        // put the sysout after the printRec() call in function block
        // it prints while backtracking
    }
    public void printRec(){
        printRec(head);
        // this is done so that we dont have to make our private head public
    }



    public Node reverseRec(Node head){
        //check whether LL is empty or has only one element
        if(head == null || head.next == null) return head;

        // it prints while backtracking
        Node rest = reverseRec(head.next);

        Node next = head.next;
        next.next = head;
        head.next = null;

        return rest;
    }
    public void reverseRec(){
        reverseRec(head);// this way we dont have to expose private variables

    }

    public void removeNthFromEnd(int n){
        if(head == null) return;//return head;
        if(head.next == null) return;//return null;

        Node fast = head;
        Node current = head;
        Node prev = null;

        while(n > 1 && fast != null){
            fast = fast.next;
            n--;
        }

        while(fast.next != null){
            prev = current;
            current = current.next;
            fast = fast.next;
        }

        if(prev == null){
            head = current.next;
            current.next = null;
            return;//return head;

        }
        
        prev.next = current.next;
        current.next = null;
        
        return;//return head;
    }



    //overloading the toString which runs at sysout
    public String toString(){
        Node current = head;
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
