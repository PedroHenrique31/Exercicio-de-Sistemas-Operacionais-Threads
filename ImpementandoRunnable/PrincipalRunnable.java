package ImpementandoRunnable;

/*
 * Crie uma class que implements runnable e o trabalho a ser feito � que ela conte de 1 � 15 e 
 * quando um n�mero impar for encontrado, a thread entra em suspens�o. Depois, quando concluir a 
 * contagem, informe quantas vezes a thread entrou em suspens�o.
 */
public class PrincipalRunnable {
	public static void main(String[] args) {
		System.out.println("Iniciando sem o uso de Thread, apenas na main");
		Contador.conta();
		Contador counter=new Contador("Minha thread #2");
		Thread t1=new Thread(counter);
		t1.start();
	}
}
