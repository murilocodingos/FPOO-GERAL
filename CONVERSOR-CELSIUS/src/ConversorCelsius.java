import java.util.Scanner;

public class ConversorCelsius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double celsius, conversao;
		
		System.out.println("####----BEM VINDO AO CONVERSOR DE CELSIUS----####: ");
		
		System.out.println("CELSIUS: ");
		
		celsius = scanner.nextDouble();

		conversao = (celsius * 9/5 + 32);
		
		System.out.println("CELSIUS:" + conversao);
		
		System.out.println("####----OBRIGADO POR USAR O PROGRAMA DE CONVERSÃO----####" );
		

	}

}
