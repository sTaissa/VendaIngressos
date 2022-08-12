package Principal;

import Evento.Evento;
import Ingresso.Ingresso;
import Ingresso.IngressoCamarote;
import Ingresso.IngressoPista;
import Ingresso.IngressoVip;

//testes
public class Principal {
    public static void main(String[] args) {
        //cria o evento
        Evento evento1 = new Evento("Rock In Rio 2022", "22/10/2022", 150, 4);
        
        //cria os ingressos
        Ingresso ingresso1 = new IngressoPista("Ana", "107.364.469-31", evento1);
        Ingresso ingresso2 = new IngressoVip("Paulo", "158.315.972-87", evento1);
        Ingresso ingresso3 = new IngressoCamarote("Joaquim", "158.315.972-87", evento1);
        Ingresso ingresso4 = new IngressoCamarote();
        
        //mostra um resumo do evento
        evento1.resumoEvento();
        
        //informa o valor de cada tipo de ingresso para o evento
        ingresso1.imprimirValor();
        ingresso2.imprimirValor();
        ingresso3.imprimirValor();
        
        //vende os ingressos, mostrando um "comprovante" para cada um
        evento1.venderIngresso(ingresso1);
        evento1.venderIngresso(ingresso2);
        evento1.venderIngresso(ingresso3);
        evento1.venderIngresso(ingresso4); //não permite fazer a venda pois não tem dados no ingresso
        
        //mostra quantos ingressos já foram vendidos e seus respectivos dados
        evento1.quantidadeIngressos();
        
        //insere valores ao ingresso vazio criado
        ingresso4.setNome("Taissa");
        ingresso4.setCpf("784.941.326-85");
        ingresso4.setEvento(evento1);
        
        //vende o ingresso e mostra a quantidade de ingressos vendidos atualizada
        evento1.venderIngresso(ingresso4);
        evento1.quantidadeIngressos();
        
        //capacidade máxima atingida, não permite vender mais ingressos
        Ingresso ingresso5 = new IngressoPista("Marcelo", "568.975.135-21", evento1);
        evento1.venderIngresso(ingresso5);
        
        //exibe a quantidade para conferir se o passo anterior funcionou
        evento1.quantidadeIngressos();
    }
}
