package Ingresso;

import Evento.Evento;

public class IngressoVip extends Ingresso {
    //construtores
    public IngressoVip(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    public IngressoVip() {
        super();
    }
    
    //valor do ingresso camarote é 30% mais caro que o valor único do evento
    @Override
    protected void calculaValor() {
        this.setValor(this.getEvento().getValorUnico() * 1.3);
    }
    
    @Override
    public void imprimirValor() {
        System.out.println("Tipo do ingresso: Vip");
        System.out.println("Valor do ingresso: " + this.getValor());
    }
}
