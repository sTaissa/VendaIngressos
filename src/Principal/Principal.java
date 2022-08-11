package Principal;

import Evento.Evento;
import Ingresso.IngressoCamarote;
import Ingresso.IngressoPista;
import Ingresso.IngressoVip;

//testes
public class Principal {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Rock In Rio 2022", "22/10/2022", 150, 4);
        
        IngressoPista ingresso1 = new IngressoPista("Ana", "107.364.469-31", evento1);
        IngressoVip ingresso2 = new IngressoVip("Paulo", "158.315.972-87", evento1);
        IngressoCamarote ingresso3 = new IngressoCamarote("Joaquim", "158.315.972-87", evento1);
        IngressoCamarote ingresso4 = new IngressoCamarote();
        
        ingresso1.imprimirValor();
        ingresso2.imprimirValor();
        ingresso3.imprimirValor();
        
        evento1.venderIngresso(ingresso1);
        evento1.venderIngresso(ingresso2);
        evento1.venderIngresso(ingresso3);
        evento1.venderIngresso(ingresso4);

        evento1.resumoEvento();
        evento1.quantidadeIngressos();
        
        ingresso4.setNome("Taissa");
        ingresso4.setCpf("784.941.326-85");
        ingresso4.setEvento(evento1);
        
        evento1.venderIngresso(ingresso4);
        evento1.quantidadeIngressos();
    }
}
