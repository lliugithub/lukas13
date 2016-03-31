/**
 * Hier ist die Dokumentation zu Beispiel 1
 * git@github.com:lliugithub/lukas13.git
 * @author Larry Liu
 * @version 31-03-2016
 */

public class FibonacciLukas {

	static int lucasberechnen(int x) {
		int lucas = 0;
		if (x < 0)
			throw new IllegalStateException("Number not available for this function");
		
		else if (x == 0)
			return 2;
		else if (x == 1)
			return 1;
		else
			lucas = lucasberechnen(x - 2) + lucasberechnen(x - 1);
			if(lucas> Integer.MAX_VALUE|| lucas< Integer.MIN_VALUE){
				throw new IllegalStateException("Ergebnis kann nicht m datentyp dargestellt werden");
			}
			 return lucas;
	}

	static long fibonacciberechnen(int x) {
		long cache=0;
		long newcache=0;
		long n1 = 0;
		long n2 = 0;
		if (x < 0 )
			throw new IllegalStateException("Number not available for this function");
		else if (x == 0)
			return 0;
		else if (x == 1)
			return 1;
		else {
			n1 = 0;
			n2 = 1;			
			for (int counter =2;counter<= x;counter++) {
				cache=n2;
				newcache = n1 + n2;
				n1 = cache;
				n2 = newcache;
			}
			
			if(n2> Long.MAX_VALUE|| n2< Long.MIN_VALUE){
				throw new IllegalStateException("Ergebnis kann nicht m datentyp dargestellt werden");
			}
			return n2;
		}
		
	}
	
	public static void main (String args []){
		System.out.println(fibonacciberechnen(8));
		System.out.println(lucasberechnen(5));
		
	}
}
