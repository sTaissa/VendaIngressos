package Ingresso;

import Evento.Evento;

public class IngressoCamarote extends Ingresso {
    public IngressoCamarote(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    @Override
    public void calculaValor() {
    }

    @Override
    public void imprimirValor() {
    }
}
