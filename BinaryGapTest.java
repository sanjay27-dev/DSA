package Binary;

import java.util.ArrayList;

public class BinaryGapTest {

	public static void main(String[] args) {
		int Count1=Solution.solveThis(1041);
		System.out.println("max 0 count :"+Count1);
		
		int Count2=Solution.solveThis(15);
		System.out.println("max 0 count :"+Count2);
		
		int Count3=Solution.solveThis(9);
		System.out.println("max 0 count :"+Count3);
		
		int Count4=Solution.solveThis(2147483647);
		System.out.println("max 0 count :"+Count4);
	
	}

	class Solution{
		public static int solveThis(int N) { // write a method it takes input N
		  String binaryRepresentation= Integer.toBinaryString(N);//integer to binary representation
		  System.out.println(N+ "Binary:"+binaryRepresentation); // print binary number
		  
		   int logestgap=0; // declare one variable
		   
		   ArrayList<Integer>oneList=new ArrayList<Integer>(); //create Arraylist of integer
		   for(int i=0;i<binaryRepresentation.length();i++) { // write loop upto boolean string length
			   if(binaryRepresentation.charAt(i) =='0') // check if char is zero or not
				   continue;// if found zero then countinue with list
			   oneList.add(i);//found 1 then add  its position to arraylist
			   
		   }
		   
		   for(int i=0;i<oneList.size()-1;i++) { //write loop for ones list size
			 int indicesDiffernce=oneList.get(i+1) - oneList.get(i)-1;//find difference between two position in the arraylist from zero postion 
			      logestgap=Math.max(logestgap, indicesDiffernce);  //here we take the max. value form the two position 
			   
		   }
			return logestgap;
			
		}
		
	}
}
