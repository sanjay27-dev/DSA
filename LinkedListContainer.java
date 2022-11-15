package linklist;

public class LinkedListContainer 
{
   
	public static void main(String[] args) 
	{
		
		Kite k1= new Kite("red","sanjay",50,true);
		Kite k2= new Kite("pink","akash",70,true);
		Kite k3= new Kite("green","sushant",60,true);
		Kite k4= new Kite("blue","sumit",40,true);
		Kite k6 = new Kite("purpul","yash",80,true);
		
		MyLinkedList myList = new MyLinkedList();
		myList.showList();
		
		myList.add(k1);
		
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.showList();
		
		System.out.println("..................");
	
		//Kite k6 = new Kite("purpul","yash",80,true);
		
		//myList.searchKiteBylength(60);
		
		//myList.addAtBegining(k6);
		System.out.println("...........");
		//myList.showList();
		
		//myList.searchKiteByName("sushant");
		//myList.deleteWithLength(70);
		//myList.deletewithLength(60);
		
		System.out.println("===============================================");
//		myList.modifywithlength(40,100);
//		myList.showList();
		
		//myList.deleteKiteByOwner("sanjay");
		myList.insertKite("sushant", k6);
		myList.showList();
		
	 }		

}

// class where all operation to be done 
 class MyLinkedList 
 {
	 Kite start,ptr,prev;
	 
	 void showList()// method to showList (1)
	 {
		 if(start==null) 
		 {
			System.out.println("the list is empty...."); 
		 }
		 else 
		 {
			System.out.println("list is Not Empty....");
			ptr=start;
			while(ptr!=null) 
			{
				System.out.println("data"+ptr);
				ptr=ptr.next;
			}
		 }
		 
	 }
	 
	 // method to searchBylength  (3)
	 void searchKiteBylength(int lengthTosearch) 
	 {
		 boolean found = false;
		 
		 if(start==null) 
		 {
			 System.out.println("list is empty.. nothing to search");
		 }
		 else 
		 {
			 System.out.println("list is not empty...searching");
			 ptr=start;
			 while(ptr!=null) 
			 {
				if(ptr.length==lengthTosearch) 
				{
					System.out.println("kite found :"+ptr);
					found=true;
					break;
				} 
				ptr=ptr.next;
				if(found!=true) 
				{
					System.out.println("kite not found...of this length:"+lengthTosearch);
				}
			 }
		 }
		 
	 }
	 
	 
	 void searchKiteByName(String OwnerToSerarch) //4
	 {
		 boolean found=false;
		 
		 if(start==null) {
			 System.out.println("list is empty .....nothing to search");
		 }
		 else {
			 System.out.println("list is not empty....searching");
			 ptr=start;
			 while(ptr!=null) 
			 {
				if(ptr.owner==OwnerToSerarch) {
					System.out.println("owner found"+ptr);
					found =true;
					break;
				}
				ptr=ptr.next;
				if(found!=true) {
					System.out.println("owner not found... of this name"+OwnerToSerarch);
				}
					
			 }
		 }
		
	 }
	 
	 void insertKite(String ownerTofind, Kite newKite) {
		 boolean found=false;
		 if(start==null) {
			 System.out.println("list is empty.....cannot add this object....");
		 }
		 else if(start.owner.equals(ownerTofind)) {
			    addAtBegining(newKite);
		 }
		 else {
			 ptr=start;
			 while(ptr!=null) {
				 if(ptr.owner.equals(ownerTofind)) {
					found =true;
					break;
				 }
				 prev=ptr;
				 ptr=ptr.next;
			 }
			 if(found==true) {
				 prev.next=newKite;
				 newKite.next=ptr;
				 System.out.println("object INSERTED before....."+ownerTofind);
			 }
			 else {
				 System.out.println("Object not found....."+ownerTofind);
			 } 
		 }
	 }
	 
	 
	 
	 
	
	void addAtBegining(Kite newKite) //method addAtBegining  (5)
	{
		if(ptr!=null) 
		{
		  System.out.println("this kite is added at the begining of the existing list of kites...");
		  newKite.next=start;
		  start=newKite;
		}
		else 
		{
			System.out.println("you are the first kite");
			start=newKite;
		}
	} 
	 
	
	//delete the kite with length
	/*void deleteWithLength(int lengthToDelete) {
		
		if(start==null) {
			System.out.println("list is empty......");
		}
		else {
			ptr=start;
		while(ptr!=null) 
		{
			if(ptr.length==lengthToDelete) 
			{
				System.out.println("Deleted the kite....");
				prev.next=ptr.next;
			}
			prev=ptr;
			ptr=ptr.next;
			
		}	
	}
} */
	
	void deletewithLength(int lengthToDelete) { //6
		if(start==null) {
			System.out.println("list is empty");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.length==lengthToDelete) {
					System.out.println("delete the kite:"+lengthToDelete);
					prev.next=ptr.next;
				}
				prev=ptr;
				ptr=ptr.next;
			}
		}
	}
	
	
	
	
	void deleteKiteByOwner(String OwnerName) { //7
		boolean found=false;
		if(start==null) {
			System.out.println("List is empty...nothing to delete");
		}
		else if(start.owner.equals(OwnerName)) {
			prev=start;
			
			start=start.next;
			prev.next=null;
			System.out.println("deleted owner from begining.....");
		}
		else {
			ptr=start;
			//prev=ptr;
			while(ptr!=null) {
				if(ptr.owner.equals(OwnerName)) {
					found=true;
					break;
				}
			}
		}
	}
	
	
	
	void modifywithlength(int lengthofkite ,int lengthtochange)  //7
	{
		if(start==null) {
			System.out.println("list is empty");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.length==lengthofkite) {
					
					
                 System.out.println("Kite to modify is :" +ptr);
				
				ptr.length=lengthtochange;
				
				System.out.println("Modified Kite iS   : "+ptr);
	               			
			
				}
				ptr=ptr.next;
			}
		}
	
	}
	 // method to add  (2)
	 void add(Kite newKite) 
	 {
		 if(start==null) 
		 {
			System.out.println("adding first node...");
			ptr = start;
			start= newKite;
		 }
		 else 
		 {
			System.out.println("adding internal node...."); 
			ptr=start;
			while(ptr!=null) 
			{
				System.out.println("searching...");
				prev=ptr;
				ptr=ptr.next;
			}
			   prev.next=newKite;
			   newKite.next=null;
		 }
	 }
  }
 
 
 // tailor
 //extend a......buisness class
 //is a....... person
 //has a....... sessior,cloth,machines
 //uses a...... m/c,cloth
 //produces a..... shirt, pants,cloths
 //

