
public class MagicEightBall {
	
	private final String[] replies = {
        "Definitely!",
        "Ask again later.",
        "I can't tell you.",
        "It is uncertain.",
        "Hmm. I don't know."
	};
	public MagicEightBall(String question){
	}
	public String ask(){
		int x = (int)(Math.random()*replies.length); 
		return replies[x]; 
	}
}

