import java.util.Scanner;

public class Main {

	public static void main(String arg[]) {
		
		Scanner tastiera = new Scanner(System.in);
		int a,b;
		
		System.out.println("inserisci a: ");
		a = tastiera.nextInt();
		
		System.out.println("inserisci b: ");
		b = tastiera.nextInt();
		
		System.out.println("La somma di " + a + " e " + b + " è " + sommaInteri(a,b));
		
		System.out.println(sommaStringhe("Ciao", "Mondo"));
		
	}
	
	public static int sommaInteri(int a, int b) {
		int somma;
		somma = a + b;
		return somma;
	}
	
	public static int sommaInteri(int a) {
		return a + 1;
	}
	
	public static String sommaStringhe(String s1, String s2) {
		return s1 + s2;
	}
}
