
public class Check2 {
	public long formelfn;
	
	public Check2(){
		
	}
	
	public long getfn (int n){
		Check1 c = new Check1();
		
		long a =   ( (long) Math.pow(c.getln (n+1),2)) *2;
		long b =((long) c.getln (n))  * ((long) c.getln (n));
		long d = ( (long) Math.pow(c.getln (n-1),2)) *2;
		
		formelfn= a - b+d ;
		return formelfn;
		
	}
	
	public static void main(String args []){
		Check2 c = new Check2();
		System.out.println(c.getfn(5));
		System.out.println (Math.pow(FibonacciLukas.fibonacciberechnen(5),2)*25);
	}
}
