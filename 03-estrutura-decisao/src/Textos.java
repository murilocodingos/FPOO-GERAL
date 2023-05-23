
public class Textos {
	
	public void testesLogicos()	{
	
	String nome1 = "MURILO";
	String nome2 = "";
	String nome3 = "murilo";
	String nome4 = "MURILO RODRIGUES FERNANDES DE SÁ";
	
	System.out.println("É VAZIO? " + nome1.isEmpty());
	System.out.println("É VAZIO? " + nome2.isEmpty());
	
	System.out.println("É IGUAL? " + nome1.equals(nome2));
	System.out.println("É IGUAL? " + nome1.equals(nome3));
	System.out.println("É IGUAL? " + nome1.equalsIgnoreCase(nome3));
	
	System.out.println("TAMANHO: " + nome1.length());
	System.out.println("TAMANHO: " + nome2.length());
	System.out.println("TAMANHO: " + nome3.length());
	System.out.println("TAMANHO: " + nome4.length());
	
	}
}
