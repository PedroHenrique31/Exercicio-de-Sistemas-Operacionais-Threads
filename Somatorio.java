
public class Somatorio extends Thread{
	protected String nome;
	protected int[] conjuntoNumeros;
	protected int somatorio=0,size;
	
	
	public Somatorio(String nome) {
		int tamanho=Principal.MEIO_TAMANHO;
		conjuntoNumeros= new int[tamanho];
		this.nome=nome;
		this.size=tamanho;
	}
	public void atribuiNumerosESoma(int[] numeros) {
		for(int i=0;i<size;i++) {
			conjuntoNumeros[i]=numeros[i];
		}
		System.out.println("Numeros inseridos:");
		for(int num:conjuntoNumeros) {
			System.out.print(num+" ");
		}
		System.out.println();
		start();
	}
	public int somatorio() {
		int soma=0;
		for(int num:conjuntoNumeros) {
			soma=soma+num;
		}
		return soma;
	}
	public int getSomatorio() {
		return this.somatorio;
	}
	public void run() {
		this.somatorio=this.somatorio();
		System.out.print("Soma de "+conjuntoNumeros[0]+" até "+conjuntoNumeros[size-1]+
				" é igual a "+somatorio);
		System.out.println(" conforme calculado por "+this.nome);
	}
	
	
	

}
