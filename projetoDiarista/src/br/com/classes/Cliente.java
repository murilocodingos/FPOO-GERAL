package br.com.classes;

public class Cliente extends Pessoa {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int valor) {
		// TODO Auto-generated method stub
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + (valor * 0.1);
		this.setSaldo(novoSaldo);
		
	}

}
