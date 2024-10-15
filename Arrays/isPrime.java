package JavaDSA.Arrays;
import java.util.Scanner;
import java.util.Arrays;

class isPrime {
    public static void main(String[] args) {
        //Sieve of Eratosthenes
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        //create an boolean array of n+1 
        boolean[] primes = new boolean[n+1];

        //set every value to true
        Arrays.fill(primes,true);

        //set 0 and 1 as false
        primes[0] = false;
        primes[1] = false;
        int count = 0;
        //start checking with 2
        for(int i = 2;i<n; i++){
            if(primes[i]){
                count++;
                //set all the multiples of i till n as false
                //run a table of i till n, eg. for 2 => 2,4,6,8...
                //start from second multiple, e.g. for 2 => j - 4,6,8,10...
                for(int j = i*2;j<n; j+=i){
                    primes[j] = false;
                }
            }
        }
        //optimised solution:
        // boolean[] a = new boolean[n];
        // int count = 0;
        // for (int p = 2; p * p < n; p++) { //run till square is under n
        //     if (a[p]) continue;
        //     for (int t = p * p; t < n; t = t+p) {
        //         if (a[t] == false) {
        //             a[t] = true;
        //             count++;
        //         }
        //     }
        // }
        // return n - 2 - count > 0 ? n - 2 - count : 0;
        System.out.println(count);
        sc.close();
    }
}
