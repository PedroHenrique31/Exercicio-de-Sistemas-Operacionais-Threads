package ImpementandoRunnable;

public class Contador implements Runnable{
	static final int tempo_espera=900;
	private String nome;
	public Contador(String nome) {
		this.nome=nome;
	}
	public static void conta() {
		try {
			for(int i=1;i<=15;i++) {
				System.out.print("Número: "+i);
				if(!(i%2==0)) {
					System.out.println(" esperando "+tempo_espera+"ms ");
					Thread.sleep(tempo_espera);
				}else {
					System.out.print("\n");
				}
			}// FIM FOR
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}//FIM CONTA()
	
	@Override
	public void run() {
		System.out.print("=================================================== ");
		System.out.print("Começando a Thread "+this.nome+" ");
		System.out.print("===================================================\n");
		this.conta();
		System.out.print("\n=================================================== ");
		System.out.print("Terminando a Thread "+this.nome+" ");
		System.out.print("===================================================\n");
		
	}
	
}//FIM CLASSE
