package recursion;

public class RecursionTest {

	public static void main(String[] args) {
		
		FactorialTest fact= new FactorialTest();
		
		long answer = fact.findFactorialAgain(5);
		System.out.println("factorial :" +answer);

	}

}

class FactorialTest{
	 long findFactorial(int num) {
		 
		 long factorial=1;
		 
		 while(num>0) {
			 factorial=factorial * num;
			 num--;
		 }
		 return factorial;
	 }
	 
	 long findFactorialAgain(int num) {
		 
		 if(num==0) 
			 return 1;
		 else {
//			 System.out.println("num"+num);
//			 answer=(num*findFactorialAgain (num-1));
//			 System.out.println("answer"+answer);
			 long ans = num * findFactorialAgain(num-1);
			 System.out.println("ans"+ans);
			 return ans;
		 }
		 
	 }
}
