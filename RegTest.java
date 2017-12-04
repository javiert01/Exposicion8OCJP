import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese la expresión a buscar");
		 String pattern = sc.nextLine();
		 Pattern p = Pattern.compile(pattern);
		 System.out.println("Ingrese el string donde se realizará la busqueda");
		 String str = sc.nextLine();
		 Matcher m = p.matcher(str); // string donde se va a buscar
		 System.out.println("\nstring: " + str);
		 System.out.println("expresión: " + m.pattern()); // la expresión
		 System.out.print("posiciones encontradas:\n"); // posiciones encontradas
		 while(m.find()) {
			 System.out.println(m.start() + " " + m.group());
		 }
		 System.out.println("");
		 }
}
