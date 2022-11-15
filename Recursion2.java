package recursion;

public class Recursion2 {
   
	public static void emptyVase(int flowerInvase) {
		if(flowerInvase>0) {
			
			emptyVase(flowerInvase-1);
			System.out.println(">"+flowerInvase);			
		}
		else {
			//nothing
		}	
	}
	public static void main(String[] args) {
		emptyVase(7);

	}

}
