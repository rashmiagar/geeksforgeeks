// Given two integers ‘L’ and ‘R’, we need to write a program that finds the count of numbers having prime number of set bits in their binary representation in the range [L, R].

// Examples:

// Input : 6 10
// Output : 4
// 6 -> 110 (2 set bits, 2 is prime)
// 7 -> 111 (3 set bits, 3 is prime)
// 9 -> 1001 (2 set bits , 2 is prime)
// 10->1010 (2 set bits , 2 is prime)

// Input : 10 15
// Output : 5
// 10 -> 1010(2 number of set bits)
// 11 -> 1011(3 number of set bits)
// 12 -> 1100(2 number of set bits)
// 13 -> 1101(3 number of set bits)
// 14 -> 1110(3 number of set bits)
// 15 -> 1111(4 number of set bits)
// Hence total count is 5
// http://www.geeksforgeeks.org/prime-number-set-bits-binary-representation/



import java.util.*;
import java.lang.*;
import java.io.*;

class PrimeCount {
    public static void main (String[] args) {
        int x =10;
        int y = 15;
        int count = 0;
        ArrayList<Integer> primeArr = SieveOfEratosthenes(y);
        for(int i=x; i< y+1; i++){
            int temp = setBits(i);
            if(primeArr.indexOf(temp) != -1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static ArrayList<Integer> SieveOfEratosthenes( int n){

        ArrayList<Integer> lis = new ArrayList<Integer>();
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        

        for(int i=0;i<n;i++){
                prime[i] = true;
        }

        for(int p = 2; p*p <=n; p++){
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        
        
        // append all the prime numbers to the list
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                lis.add(Integer.valueOf(i));
        }
        return lis;
    }
    
    // utility function to count the number of set bits
    public static int setBits(int number){
       int count = 0;
        while(number>0){
            ++count; 
            number &= number-1; 
        } 
        return count;
    }
}