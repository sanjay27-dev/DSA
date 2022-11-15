package stack;

public class StackTest {

	public static void main(String[] args) {
		
		MyStack theStack= new MyStack(5);
		
		   theStack.push(10);
		   theStack.push(20);
		   theStack.push(30);
		   theStack.push(40);
		   theStack.push(50);
		   //theStack.push(60);
		   
		   System.out.println("element of the top" + theStack.peek());
		   
		   System.out.println(theStack.pop());
		   System.out.println("===> element of the top");
		   
		   System.out.println(theStack.pop());
		   System.out.println(theStack.pop());
		   System.out.println(theStack.pop());
		   System.out.println("element of the top");
		   
		   System.out.println(theStack.pop());
		   
		  
	}
}
	
 class MystackEmptyException extends RuntimeException{
	     
	 MystackEmptyException(String str){
		 super(str);
	 }
 }
 
  class MyStackOverFlowException extends RuntimeException{
	  
	  MyStackOverFlowException(String str){
	  super (str);
  }
  }
	
class MyStack{
	int index=-1;
	int top;
	int size;
	int array[]; // just a reference to int array
	
	MyStack(int size){ // parametrised constructor creation
		this.size =size;
		array = new int [size]; // allocation of the integer
		
	}
	
	void push(int item) {
		System.out.println("pushing"+item+"to the stack....");
		
		if(index > size-2) {
			throw new MyStackOverFlowException("stack size is overflown.. ");
		}
		array[++index]= item;
	}
	
	int pop() {

		System.out.println("popping item from the stack...");
		if(index <0) {
		    throw new MystackEmptyException("stack is empty....");
		}
		
		return  array[index-- ];
	}
	
	int peek() {
		
		return array [index];
	}
}


