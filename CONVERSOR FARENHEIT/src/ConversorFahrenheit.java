import java.util.Scanner;

public class ConversorFahrenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double fahrenheit, conversao;
		
		System.out.println("####---- BEM VINDO AO CONVERSOR DE FAHRENHEIT ----####: ");
		
		System.out.println("FAHRENHEIT: ");
		
		fahrenheit = scanner.nextDouble();

		conversao = (fahrenheit - 32) * 5/9;
		
		System.out.println("FAHRENHEIT:" + conversao);
		
		System.out.println("####----OBRIGADO POR USAR O PROGRAMA DE CONVERSÃO----####" );
		

	}

}
