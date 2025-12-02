
public class TestMagicBall {
		
	
	public static void main (String[] args) {
		MagicEightBall a = new MagicEightBall("will i be rich?"); 
		MagicEightBall b = new MagicEightBall("will I go to college?"); 
		
		System.out.println(a.ask()); 
		System.out.println(b.ask()); 
	}
	
}

