package br.com.main;

import br.com.loja.veiculo;

public class main {

	public static void main(String[] args) {

		//iniciando objeto
		veiculo carro = new veiculo();
		carro.nome = "Fiat Uno com escada";
		carro.cor = "Branco";
		carro.motor = "75cv";
		carro.velocidade = 157;

		System.out.println("Nome: " + carro.nome);
		System.out.println("Cor: " + carro.cor);
		System.out.println("Motor: " + carro.motor);
		System.out.println("Velocidade: " + carro.velocidade);

		carro.ligar();

	}

}
