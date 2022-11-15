package example.array;

public class ArrayTest {
      public static void main(String[] args) {
		Account accArray[]=new Account[5];
		
		System.out.println("Begin again....");
		
		Account accObj= new Account(101,"john",1001);
		System.out.println("accObj:"+accObj);
		accObj.withdraw(400);
		System.out.println("accObj:"+accObj);
		
		//System.out.println(accArray[0]);
		
		System.out.println("end main");
		
	}
}

class Account { // create class
	
	private int accountNumber;
	private String accountHolderName;
	private float acountBalance;
	
	
	
	public Account(int accountNumber, String accountHolderName, float acountBalance) {// create constructor
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.acountBalance = acountBalance;
	}

     float withdraw(float amtTowithdraw) {
    	 float accountBalance=acountBalance -amtTowithdraw;
    	 return accountBalance;
    	 
     }
    	 
  
	@Override
	public String toString() 
	{// generate  to string
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", acountBAlance=" + acountBalance + "]";	
	}
 
}




/*
 * 1. function without arrgument and without return type 
 * 
 *  without return           without argument 
 *        |                   |
 *        void clearScreen(void) 
 *        {
 *        } 
 *        
 *  2. function with argument but without return value 
 *  
 *        void gotThisLocation('float longitude, float latitude)
 *        {
 *        
 *        }
 *  3. function with argument and with return value
 *  
 *       float calculate simple interest(float prin,int numyear,float rate) 
 *       {
 *         flaot interest =(prn*int *rate)/100;
 *         return interest;
 *         
 *       }
 *       
 *  4. funtion without argument but with return value
 *  
 *       double calculateDistance()
 *       {  
 *           flaot speedOfLight = 186000.519;//miles/sec
 *           int timeTook = 400;//second
 *           double distance = speedOfLight * timeTook;
 *           return distance;
 *           
 *
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 
 // knowledge -> apply it ->WISDOM
 //the Word-> WATER <-is not WATER