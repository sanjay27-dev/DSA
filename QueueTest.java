package queue;

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue que = new MyQueue(5);
		
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
	    que.add(60);
		
		System.out.println("removing element one by one ");
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
	  //System.out.println(que.remove());
		
	}
}

  class QueueCapacityExceededException extends RuntimeException
  {
	  public QueueCapacityExceededException(String str) 
	  {
	       super(str);
	}
  }
  
  class RunTimeException extends RuntimeException
  {
	  RunTimeException(String str)
	  {
		  super(str);
	  }
  }
  
class MyQueue
{
	int front=-1;
	int index=-1;
	int length;
	int array[];
	
	MyQueue(int lenght)
	{
		this.length=length;
		array= new int [length];
	}
   void add(int item) 
   {
	  
	   if (front>length-2) 
	   {
		   throw new RuntimeException("Queue is full..");
	   } 		   
	   array[++index ]=item;
	   System.out.println("added" +item+"at index "+index);		  
   }
   
   int remove() 
   {
	   if (front > index-1) 
	   {
		  throw new RuntimeException("Rear reached.....");
	   }
	     return array[++front];
	   //          5       -4      -1  =0 
   }
}
      
 

