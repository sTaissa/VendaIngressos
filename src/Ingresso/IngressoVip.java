package Ingresso;

import Evento.Evento;
import javax.swing.JOptionPane;

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
    
    //seta o tipo de ingresso de acordo com a classe
    @Override
    protected void informaTipoIngresso() {
       this.setTipoIngresso("Vip");
    }
}
