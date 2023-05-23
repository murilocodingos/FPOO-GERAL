import java.util.Scanner;

public class Variaveis {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double A1, B1, A2, B2;
		
		System.out.println("####---- INFORME O VALOR DE A ----####: ");
		A1 = scanner.nextDouble();
		
		System.out.println("####---- INFORME O VALOR DE B ----####: ");
		B1 = scanner.nextDouble();
		
		A2 = B1;
		B2 = A1;
	
	System.out.println("VALOR DE A = " + A2);
	System.out.println("VALOR DE B = " + B2);
	}
}
