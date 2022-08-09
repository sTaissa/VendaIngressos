package Ingresso;

import Evento.Evento;

public class IngressoPista extends Ingresso {
    //construtores
    public IngressoPista(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }
    
    public IngressoPista() {
    }
    
    //valor do ingresso pista é o valor único do evento
    @Override
    protected void calculaValor() {
        this.setValor(this.getEvento().getValor());
    }
    
    @Override
    public void imprimirValor() {
        System.out.println("Tipo do ingresso: Pista");
        System.out.println("Valor do ingresso: " + this.getValor());
        System.out.println();
    }
}
