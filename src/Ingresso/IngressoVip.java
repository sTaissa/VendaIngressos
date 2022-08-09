package Ingresso;

import Evento.Evento;

public class IngressoVip extends Ingresso {
    public IngressoVip(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    @Override
    public void calculaValor() {
    }

    @Override
    public void imprimirValor() {
    }
}
