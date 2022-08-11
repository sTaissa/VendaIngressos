package Ingresso;

import Evento.Evento;
import javax.swing.JOptionPane;

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
    
    //seta o tipo de ingresso de acordo com a classe
    @Override
    protected void informaTipoIngresso() {
       this.setTipoIngresso("Camarote");
    }
}
