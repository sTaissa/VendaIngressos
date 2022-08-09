package Ingresso;

import Evento.Evento;

public class IngressoVip extends Ingresso {
    //construtores
    public IngressoVip(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    public IngressoVip() {
        
    }
    
    //valor do ingresso camarote é 30% mais caro que o valor único do evento
    @Override
    protected void calculaValor() {
        this.setValor(this.getEvento().getValor() * 1.3);
    }
    
    @Override
    public void imprimirValor() {
        System.out.println("Tipo do ingresso: Camarote");
        System.out.println("Valor do ingresso: " + this.getValor());
        System.out.println();
    }
}
