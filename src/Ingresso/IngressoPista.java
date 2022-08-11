package Ingresso;

import Evento.Evento;
import javax.swing.JOptionPane;

public class IngressoPista extends Ingresso {
    //construtores
    public IngressoPista(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento);
    }
    
    public IngressoPista() {
        super();
    }
    
    //valor do ingresso pista é o valor único do evento
    @Override
    protected void calculaValor() {
        this.setValor(this.getEvento().getValorUnico());
    }

    //seta o tipo de ingresso de acordo com a classe
    @Override
    protected void informaTipoIngresso() {
       this.setTipoIngresso("Pista");
    }
}
