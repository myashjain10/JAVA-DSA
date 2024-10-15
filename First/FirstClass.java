import java.util.Arrays;
import java.util.Scanner;

class FirstClass{
    public static void main(String args[]){
        
        //with extra line
        System.out.println("Hello World");

        //without extra line
        System.out.print("new Hello world");

        //variables
        //java intialises variables with null values (zero values)

        String name = "Aman";
        int age = 30;

        String myname = name; //variable value assignment

        //Primitive datatypes
        // 
        // byte - 1 (-128 - 127)
         byte newAge = 22;
        
         // short - 2
        short someNum = 12344;
        
        // int - 4
        int phoneNum = 1234567890;

        // long - 8
        //java thinks the number is integer but since they are outside integer range it will generate error
        //hence the L at the end  to tell java it is an long type variable
        long secPhoneNum = 123456789999L;
        
        // float - 4
        float pi = 3.14F;

        // double - 8
        double BigPi = 3.1456;

        // char - 2
        //single quotes - char, double quotes - string
        char letter = 'a';


        // boolean - 1
        boolean isAdult = false;
        

        //Non Primitive Datatype

        //String - immutable
        String myname2 = new String("jain"); //you can skip new String()
        System.out.println("My second name is " + myname2.length());//returns length
        String newName = myname + ' ' + myname2;//concatenation
        System.out.println("My complete name is " + newName);

        System.out.println("Output of charAt(1) : " + myname2.charAt(1));// will return second character
        String myNewName = myname.replace('h', 'i');//will return the new string with changes, wont change the org string
        System.out.println("Output after replacing h with i : " + myNewName);

        System.out.println("Output of substring(): " + myname2.substring(2,3));// starting index char will not be included



        //Arrays
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 90;
        marks[2] = 97;
        System.out.println("This represent the type and address of array: " + marks);// this will print some strange value(something made from class name and hash code), not the array
        System.out.println("First element of array: " + marks[0]);

        System.out.println("Length of Array" + marks.length);//length is a property of array, not a method hence no brackets
        
        
        Arrays.sort(marks);// method in java.util.Arrays
        System.out.println("after sorting :"+marks[0]);


        int[] myMarks = {97,98,95};

        int[][] finalMarks = {{97, 98, 94},{95, 95, 97}};//2-D arrays
        System.out.println("Output of 2D array" + finalMarks[1][1]);//95


        //casting
        //implicit casting
        double price = 100.0;
        int gst = 18;
        double finalPrice = price + gst;//here java converts int to double implicitly, because double is bigger than int hence it can store all values of int range

        System.out.println("Output of implicit casting: " + finalPrice);//118.0

        //explicit casting
        int p = 100;
        double newGst = 18.2;
        int fP = p + (int)newGst;
        //here if we dont explicitly tell java to convert double to string, it would give error.
        System.out.println("Output of explicit casting" + fP);//118


        //constants
        final double PI = 3.14;// cannot change value of pi

        //Math class
        System.out.println("Math.max(5,6): " + Math.max(5,6));
        System.out.println("Math.min(5,6)" + Math.min(5,6));

        System.out.println("Math.random(): " + Math.random());//from 0-1
        System.out.println("(int)(Math.random()*100): " + (int)(Math.random()*100));// from 0-100
        

        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age(takes Integer): ");
        int age2 = sc.nextInt();
        System.out.println("Your age: " + age2);//similarily for float and double

        System.out.print("Enter your name(takes single word): ");
        String name2 = sc.next();// just takes the first word, cant take a sentence
        System.out.println(" Your Name: "+ name2);

        sc.nextLine();//it brings the scanner to new line
        System.out.print("Enter your intro(takes full sentence): ");
        String intro = sc.nextLine();// can take a full sentence
        System.out.println("Your intro: " + intro);

        //Exception handling - try and catch

        int[] yashMarks = {45,34,78};
        try {
            System.out.print("Inside try block, there will be an exception ");
            System.out.println(yashMarks[5]);
        } catch (Exception e) {
            // ToDo: handle exception
        }
        System.out.println("After Try & Catch");

        System.out.print("Enter your Two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Printing sum numbers using printSum() function: ");
        printSum(num1,num2);
        
    }   

    //Functions/Methods
    public static void printSum(int x,int y){
        int sum = x + y;
        System.out.println(sum);
    }    
}
