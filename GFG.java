// Sieve of Eratosthenes
// Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
// For example, if n is 10, the output should be “2, 3, 5, 7”. If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19”.
// http://www.geeksforgeeks.org/sieve-of-eratosthenes/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		for(int i=1; i<= n; i++){
		    int num = Integer.parseInt(args[i]);
		    System.out.println(num);
		    ArrayList<Integer> primes = new ArrayList<Integer>();
		    for(int j=2; j <= num; j++){
		        if(isprime(j)){
		            primes.add(j);
		            System.out.print(j + " ");
		        }
		    }
		    System.out.print("\n");
		}
	}
	
	public static boolean isprime(int max){
	    if(max ==2)
	      return true;
	    for(int i=2; i< max; i++){
	        if(max % i == 0)
	          return false;
	    }
	    return true;
	}
}