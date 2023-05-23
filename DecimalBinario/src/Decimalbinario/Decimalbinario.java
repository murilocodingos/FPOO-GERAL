package Decimalbinario;

import java.util.Scanner;

public class Decimalbinario {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int decimal;
		String binario;
		
		System.out.println("DIGITE O NÚMERO DECIMAL: ");
		decimal = scanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("O NÚMERO EM DECIMAL É: " + decimal);
		System.out.println("VALOR DECIMAL CONVERTIDO EM BINÁRIO: " + binario);

	}

}
