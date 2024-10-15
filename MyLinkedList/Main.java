package JavaDSA.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        

        //overload the toString to output properly
        System.out.println(list);
        list.printRec();
        System.out.println();
        list.deleteFromStart();
        list.deleteFromEnd();
        System.out.println(list);
        list.insertAtStart(9);
        list.insertAtIndex(10,3);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        System.out.println(list.indexOf(3));
        System.out.println(list.sum());


    }
}
