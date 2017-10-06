// Given an array, print k largest elements from the array.  The output elements should be printed in decreasing order.
// Input:
// 2
// 5 2
// 12 5 787 1 23
// 7 3
// 1 23 12 9 30 2 50

// Output:
// 787 23
// 50 30 23



import java.util.*;
import java.lang.*;
import java.io.*;

class KLargest {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int numInputs = Integer.parseInt(scn.nextLine());

		while(numInputs > 0){
			String b = scn.nextLine();
			String[] inputs = b.split(" ");  // N k
			ArrayList<Integer> result = new ArrayList<Integer>(Collections.nCopies(Integer.parseInt(inputs[1]), 0));
			String[] arr = scn.nextLine().split(" ");

			result.add(Integer.parseInt(arr[0]));
			for(int i=1; i < arr.length; i++){
				for(int j=0; j < result.size(); j++){
					if(Integer.parseInt(arr[i]) > result.get(j)){
						result.add(j, Integer.parseInt(arr[i]));
						break;
					}
				}
			}
			for(int i=0; i < Integer.parseInt(inputs[1]); i++){
				System.out.print(result.get(i) + " ");
			}
			System.out.println();
			numInputs--;
		}
	}
}