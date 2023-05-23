import java.util.Scanner;

public class CalculoTempo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double T, V = 0, D, L;
		
		System.out.println("####---- BEM VINDO AO CALCULADOR DE LITROS ----####: ");
		
		System.out.println("INFORME O TEMPO: ");
		T = scanner.nextDouble();
		
		System.out.println("INFORME A VELOCIDADE");
		V = scanner.nextDouble();
		
		D = T * V;
		
		L = D / 12;
		
		System.out.println("Litros Utilizados = " + L );
		
		System.out.println("####---- OBRIGADO!!! ----####: ");
		

	}

}
