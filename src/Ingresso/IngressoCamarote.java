package Ingresso;

import Evento.Evento;

public class IngressoCamarote extends Ingresso {
    //construtores
    public IngressoCamarote(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }
    
    public IngressoCamarote() {
        super();
    }

    //valor do ingresso camarote é 60% mais caro que o valor único do evento
    @Override
    protected void calculaValor() {
        this.setValor(this.getEvento().getValorUnico() * 1.6);
    }
    
    @Override
    public void imprimirValor() {
        System.out.println("Tipo do ingresso: Camarote");
        System.out.println("Valor do ingresso: " + this.getValor());
    }
}
