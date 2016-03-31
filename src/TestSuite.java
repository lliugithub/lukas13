import org.junit.*;
public class TestSuite {
	
	@Test
	public void checkFormel1 (){
		Check1 c = new Check1();
		double lukastest1 = c.getln(10);
		int lukastest11 = FibonacciLukas.lucasberechnen(10);
		
		double lukastest2 =c.getln(19);
		int lukastest22 = FibonacciLukas.lucasberechnen(19);
		
		Assert.assertEquals(lukastest1, lukastest11,1);
		Assert.assertEquals(lukastest2, lukastest22,1);
				
		
	}
	
	@Test
	public void checkFormel2 (){
		Check2 c = new Check2();
		long fibtest1 = c.getfn(10);
		double fibtest11 = Math.pow(FibonacciLukas.fibonacciberechnen(10),2)*25;
		
		long fibtest2 = c.getfn(19);
		double fibtest22 = Math.pow(FibonacciLukas.fibonacciberechnen(19),2)*25;
		
		Assert.assertEquals(fibtest1, fibtest11,1);
		Assert.assertEquals(fibtest2, fibtest22,1);
				
		
	}
}
