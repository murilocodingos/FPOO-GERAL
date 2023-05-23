package classe.system;

public class SwitchDemo {
public static void main(String[] args) {

int month = 1;
String monthString;
switch (month) {

case 1: monthString = "Nome do Sistema Operacional:" + System.getProperty("os.name");
break;
case 2: monthString = "Arquitetura do Sistema Operacional:" + System.getProperty("os.arch");
break;
case 3: monthString = "Versão do Sistema Operacional:" + System.getProperty("os.version");
break;
case 4: monthString = "Separador de Arquivos do Sistema Operacional:" + System.getProperty("file.separator");
break;
case 5: monthString = "Separador de Linha:" + System.getProperty("line.separator");
break;
case 6: monthString = "Home do Usuário:" + System.getProperty("user.home");
break;
case 7: monthString = "Diretório Corrente de Trabalho:" + System.getProperty("user.dir");
break;
default: monthString = "Invalid Code";
break;
}
System.out.println(monthString);

}

}