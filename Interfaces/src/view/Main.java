package view;

public class Main {
    private String nomePrograma;
    public static void main(String[] args) {
        TesteEstatico.metodoEstatico();
        TesteEstatico te1 = new TesteEstatico("TE1");
        TesteEstatico te2 = new TesteEstatico("TE2");
        TesteEstatico te3 = new TesteEstatico("TE3");
        
        System.out.println(te1.nome + " " + te1.contadorDeObjetos);
        System.out.println(te1.nome + " " + te2.contadorDeObjetos);
        System.out.println(te1.nome + " " + te3.contadorDeObjetos);
        System.out.println("Pela Classe: " + TesteEstatico.contadorDeObjetos);
    }
    
}