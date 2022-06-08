package view;

public class TesteEstatico {
	public static int contadorDeObjetos;
	public String nome;

	public TesteEstatico(String nome) {
		System.out.println("TesteEstatico:: Rodou construtor");
		contadorDeObjetos++;
		this.nome = nome;
	}

	public static void metodoEstatico() {
		System.out.println("TesteEstatico:: Método Estatico");
	}

	static {
		System.out.println("TesteEstatico:: Bloco Estatico");
	}

}