
public class Check1 {
	public double alpha;
	public double beta;
	public double formelln;
	
	public Check1(){
		alpha = (1+ Math.sqrt(5))/2;
		beta = (1- Math.sqrt(5))/2;
	}
	
	public double getln (int n){
		
		formelln = (  Math.pow(alpha, n)) +(Math.pow(beta, n)) ;
		return formelln;
	}
	
	
	public static void main(String args []){
		Check1 c = new Check1();
		System.out.println(c.getln(19));
		System.out.println (FibonacciLukas.lucasberechnen(19));
	}
}
