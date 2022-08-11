package Principal;

import Evento.Evento;
import Ingresso.IngressoCamarote;
import Ingresso.IngressoPista;
import Ingresso.IngressoVip;


public class Principal {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Rock In Rio 2022", "22/10/2022", 150, 3);
        
        IngressoPista ingresso1 = new IngressoPista("Ana", "107.364.469-31", evento1);
        IngressoVip ingresso2 = new IngressoVip("Paulo", "158.315.972-87", evento1);
        IngressoCamarote ingresso3 = new IngressoCamarote("Joaquim", "158.315.972-87", evento1);
        IngressoCamarote ingresso4 = new IngressoCamarote("Bruno", "598.315.772-70", evento1);

        evento1.resumoEvento();
        evento1.quantidadeIngressos();
    }
}
