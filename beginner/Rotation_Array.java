package beginner;
import java.util.*;
public class Rotation_Array {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= {1,2,3,4,5,6,7};
		int k=3;
		rotate(A,k);
	}
	 public static void rotate(int[] nums, int k) {
	        k = k % nums.length; // for length of array is less to k
	        if(k < 0){ // for -ve value
	            k += nums.length;
	        }
	        reverse(0,nums.length-1,nums);
	        reverse(0,k-1,nums);
	        reverse(k,nums.length-1,nums);
	        for(int i=0;i<nums.length;i++) {
	        	System.out.print(nums[i]+" ");
	        }
	    }
/**@author Nikhil Kumar */
	    public static void reverse(int start,int end,int[]nums){
	        int temp;
	        while(start<end)
	        {   temp=nums[start];
	            nums[start]=nums[end];
	            nums[end]=temp;
	            start++;
	            end--;
	        }
	    }

}
