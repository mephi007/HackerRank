//Problem: https://www.hackerrank.com/challenges/beautiful-triplets
//Java 8

/* Hi, I am editing this code for the scenario when repeated digits are present.
* Hopefully, you will see and review it.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        
        Set<Integer>  values = new HashSet<>();
        
        int beautifulTriplets = 0;
        
        
        //Build a set
        for(int i = 0; i < n; i++)
        {
            int x = input.nextInt();
            
            if(!values.contains(x))
            {
                values.add(x);
            }
        }
        
        
        //Check if set has a value, value+d, and value + 2d
        for(Integer digit : values)
        {
            if(values.contains(digit+d) && values.contains(digit+(2*d)))
            {
                //beautifulTriplets++;
                int repeat = countRepeat(arr, digit);
				beautifulTriplets += repeat;
            }
        }
        
        System.out.println(beautifulTriplets);
    }
    
    private static int countRepeat(int[] arr, int digit) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == digit) count++;
		}
		
		return count;
	}
}
