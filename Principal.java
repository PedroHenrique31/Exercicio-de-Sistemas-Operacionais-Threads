
/*
 * 
 * Crie uma class que extends Thread e, no trabalho a ser executado, 
 * fa�a a soma dos n�meros de 1 a 10. Esse processo deve ser dividido entre duas 
 * linhas de execu��o.
 * Crie uma class que implements runnable e o trabalho a ser feito � que ela conte de 1 � 15 e, 
 * quando um n�mero impar for encontrado, a thread entra em suspens�o e depois, 
 * quando concluir a contagem, informe quantas vezes a thread entrou em suspens�o.
 * */
public class Principal {
	static int[] numeros={1,2,3,4,5,6,7,8,9,10};
	public static final int TAMANHO=10;
	public static final int MEIO_TAMANHO=TAMANHO/2;
	
	public static void main(String[] args) {
		Somatorio soma1,soma2;
		soma1=new Somatorio("Thread #1");
		soma2=new Somatorio("Thread #2");
		
		int[] metade1,metade2;
		int somaTotal;
		metade1=new int[MEIO_TAMANHO];
		for(int j=0;j<MEIO_TAMANHO;j++) {
			metade1[j]=numeros[j];
		}
		metade2=new int[MEIO_TAMANHO];
		for(int j=MEIO_TAMANHO;j<TAMANHO;j++) {
			metade2[j-MEIO_TAMANHO]=numeros[j];
		}
		soma1.atribuiNumerosESoma(metade1);
		soma2.atribuiNumerosESoma(metade2);
		
		somaTotal=soma1.getSomatorio()+soma2.getSomatorio();
		System.out.println("Somatorio total �: "+somaTotal);
		
		
	}

}
