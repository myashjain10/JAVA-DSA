package JavaDSA.Recursion;

import java.util.Scanner;

public class Factorial {
    public static int facto(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int result = n * facto(n-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + facto(n));
        sc.close();
    }
}
