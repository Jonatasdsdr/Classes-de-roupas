
public class Sistema {

    public static void main(String[] args) {
        
        Camiseta camiseta = new Camiseta ();
        camiseta.tipo = "camiseta";
        camiseta.tamanho = 15;
        camiseta.marca = "Adiddas";

        Gravata gravata = new Gravata ();
        gravata.tipo = "Gravata";
        gravata.tamanho = 17;
        gravata.marca = "Fish";

        Broxe broxe = new Broxe ();
        broxe.tipo = "Broxe";
        broxe.tamanho = 2;
        broxe.marca = "Flute";

        camiseta.mostraDados ();
        gravata.mostraDados1 ();
        broxe.mostraDados1 ();

    }
    
}
