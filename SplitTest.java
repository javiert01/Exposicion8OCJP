
import java.util.*;
public class SplitTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el string que va a separar");
		String str = sc.nextLine();
		System.out.println("Ingrese la expresión de delimitación");
		String pattern = sc.nextLine();
		String[] tokens = str.split(pattern);
		System.out.println("Tokens: " + tokens.length);
		for(String s : tokens)
			System.out.println(">" + s + "<");
	}
}