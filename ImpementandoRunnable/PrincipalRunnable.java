package ImpementandoRunnable;

/*
 * Crie uma class que implements runnable e o trabalho a ser feito é que ela conte de 1 à 15 e 
 * quando um número impar for encontrado, a thread entra em suspensão. Depois, quando concluir a 
 * contagem, informe quantas vezes a thread entrou em suspensão.
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
