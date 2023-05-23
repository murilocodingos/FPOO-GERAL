
public class Main {

	public static void main(String[] args) {
		
		operadoresrelacionais objrelacionais = new operadoresrelacionais();
		new DecisaoSimples();
		new DecisaoComposta();
		new Textos();
		objrelacionais.testeslogicos();
		EstruturaDecisaoTexto objDecisaoTexto = new EstruturaDecisaoTexto();
		
		//objrelacionais.testeslogicos();
		//objDecisaoSimples.testeMenor(40, 50);
		//objDecisaoSimples.testeMenorIgual(50, 50);
		//objDecisaoSimples.testeMaior(50, 10);
		//objDecisaoSimples.testeMaiorIgual(100, 20);
		//objDecisaoSimples.testeIgual(5, 5);
		//objDecisaoSimples.testeDiferente(5, 9);
		
		//objDecisaoComposta.testeMenor(1000, 10);
		
		//objTextos.testesLogicos();
		objDecisaoTexto.testeVazio("SESI/SENAI DESENVOLVIMENTO DE SISTEMAS!");
		objDecisaoTexto.testeIgual("SESI", "SENAI");
		objDecisaoTexto.testeIgual("SESI", "SESI");
		objDecisaoTexto.testeIgual("SENAI", "SENAI");
		objDecisaoTexto.contador("mamadeira69");
	}

}
