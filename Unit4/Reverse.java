
public class Reverse {
	public static String reverse(String str){
		String flip = ""; 
		for(int i = str.length()-1; i >= 0; i--){
			flip += str.charAt(i);
		}
		return flip; 
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("bad"));
		System.out.println(reverse("Hello, world!"));
		System.out.println(reverse("tacocat"));
		System.out.println(reverse("What's up?"));
	}
}

