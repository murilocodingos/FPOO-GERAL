package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.setNome("João Kleber");
		diarista.setTelefone("(11) 98787-8924");
		diarista.setEndereço("Avenida Cajamar, Nº 666");
		diarista.setChavePix("123");
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereço());
		System.out.println("Chave Pix Diarista: " + diarista.getChavePix());
		diarista.atender("Daniel Petinice");
		
		Cliente cliente = new Cliente();
		
		System.out.println("====================================================");
		
		cliente.setNome("Daniel Petinice");
		cliente.setTelefone("(11) 91283-7293");
		cliente.setEndereço("Avenida Pirapora, Nº 999");
		
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereço());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo Saldo: " + cliente.getSaldo());
		
		System.out.println("====================================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(11);
		System.out.println(atendimento.getHoras());
		
	}

}
