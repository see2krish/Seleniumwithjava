package week1assingnment;

import java.util.Arrays;

public class MissingElementinanArray {
	
	
		public static void main(String[] args) {
			// Here is the input
			int[] arr = {1,2,3,4,7,6,8};

			// Sort the array	
			Arrays.sort(arr);
		    int i;
			int j;

			// loop through the array (start i from arr[0] till the length of the array)
			for(i=0;i<arr.length;i++)
			{
				for(j=i+1;j<6;j++)
				{
					if(j!=arr[i])
					System.out.println(j);
				    break;
				}
				
				}
 }

}                                   
