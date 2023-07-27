package br.com.classes;

public class Diarista extends Pessoa {
	
	private String chavePix;
	
	public void atender(String nomeCliente) {
		
		System.out.println("Realizando atendimento para cliente: " + nomeCliente);
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int valor) {
		// TODO Auto-generated method stub
		
	}
}
