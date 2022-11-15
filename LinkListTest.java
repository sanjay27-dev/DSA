package linklist;

public class LinkListTest {

	public static void main(String[] args) {
	
		Kite k1= new Kite("red","sanjay",50,true);
		Kite k2= new Kite("pink","akash",70,true);
		Kite k3= new Kite("green","sushant",60,true);
		Kite k4= new Kite("blue","sumit",40,true);
		
		k1.next=k2;
		k2.next=k3;
		k3.next=k4;
		
		System.out.println("k1 :"+k1);
		System.out.println("k2 :"+k2);
		System.out.println("k3 :"+k3);
		System.out.println("k4 :"+k4);
		
		System.out.println("..................");
		
		System.out.println("k1:"+k1.hashCode());//100
		System.out.println("k2:"+k2.hashCode());//200
		System.out.println("k3:"+k3.hashCode());//300
		System.out.println("k4:"+k4.hashCode());//400
		
		System.out.println("k1.next"+k1.next.hashCode());//200
		System.out.println("k2next"+k2.next.hashCode());//300
		System.out.println("k3.next"+k3.next.hashCode());//400
		System.out.println("k4.next:"+k4.next);//null

	}
}
   
	class Kite{
		String color;
		String owner;
		int length;
		boolean flying;
		
		Kite next;// this is a reference variable

		public Kite(String color, String owner, int length, boolean flying) {
			super();
			this.color = color;
			this.owner = owner;
			this.length = length;
			this.flying = flying;
		}

		@Override
		public String toString() {
			return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", next="
					+ next + "]";
		}
	}

