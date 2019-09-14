/*
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 * 
 * */
public class MissingInteger {
	
	   public static int solution(int[] A) {
		     
	        int positiveCount = 0;        
	        for(int i=0; i< A.length; i++) {
	            positiveCount++;
	        }
	        
	        int[] B = new int[positiveCount];
	        
	        for(int i=0; i<A.length; i++) {
	            if(A[i]<=A.length && A[i]>0) {
	                B[A[i]-1]=1;
	            }
	        }
	        
	        int min = B.length+1;
	        
	        for(int i=0; i<B.length; i++) {
	            if(B[i]==0) {
	                min = i+1;
	                break;
	            }
	        }
	        
	        return min;
	    }
	    
	public static void main(String[] args) {
		
		int[] a = {1, 3, 6, 4, 1, 2};
		System.out.print(solution(a));

	}

}
