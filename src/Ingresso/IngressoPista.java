package Ingresso;

import Evento.Evento;

public class IngressoPista extends Ingresso {
    public IngressoPista(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }
    
    @Override
    public void calculaValor() {
    }
    
    @Override
    public void imprimirValor() {
    }
}
