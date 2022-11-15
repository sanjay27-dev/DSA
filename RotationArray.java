package Binary;

import java.util.Arrays;

public class RotationArray {
	
/*
 *step1 : declare the targetarry as per the length of the  
 *source array 
 *
 * step 2 : iteret thru sourse array from 0 to length 
 *step 3 : 
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		int SA[]= {1,2,3,4} ; 
		int k=3;
		System.out.println(Arrays.toString(SA));
		int rotatedArray[]= RotationTest.solution(SA, k);
		System.out.println(Arrays.toString(rotatedArray));

	}
   class RotationTest{
	   public static int[] solution (int sourceArray[],int K) {
		   int targetArray[]= new int [sourceArray.length];
		   for(int i=0;i<sourceArray.length;i++) {
		       int rotationIndex=(i+K) % sourceArray.length;
		       targetArray [rotationIndex] = sourceArray[i];
		   }
	   
		   return targetArray;
   }
	   
}
   
}
