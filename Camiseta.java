//Classe filha, ou subclasse, ou classe mais especialista.

public class Camiseta extends Roupa {

    int tamanho;

    public void mostraDados(){

        System.out.println("Dados da roupa:");
        System.out.println(tipo);
        System.out.println(tamanho);
        System.out.println(marca);
    }

}
