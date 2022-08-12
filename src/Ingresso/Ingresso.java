package Ingresso;

import Evento.Evento;
import javax.swing.JOptionPane;

//classe abstrata
public abstract class Ingresso {
    private String nome, cpf, tipoIngresso;
    private Evento evento;
    private double valor;
    
    //métodos a serem implementados pelas subclasses
    protected abstract void calculaValor();
    protected abstract void informaTipoIngresso();
    
    //exibe o valor e tipo do ingresso
    public void imprimirValor() {
        String msg = "Evento: " + this.getEvento().getNome() + "\n";
        msg += "Tipo do ingresso: " + this.getTipoIngresso() + "\n";
        msg += "Valor do ingresso: R$" + this.getValor();
        JOptionPane.showMessageDialog(null, msg);
    }
    
    //exibe um resumo mostrando os dados do ingresso
    public void resumoIngresso(){
        String msg = "DADOS DO INGRESSO\n\n";
        msg += "Nome: " + this.getNome() + "\n";
        msg += "CPF: " + this.getCpf() + "\n";
        msg += "Evento: " + this.getEvento().getNome() + "\n";
        msg += "Data do evento: " + this.getEvento().getData() + "\n";
        msg += "Tipo de ingresso: " + this.getTipoIngresso() + "\n";
        msg += "Valor do ingresso: R$" + this.getValor();
        JOptionPane.showMessageDialog(null, msg);
    }

    //construtores
    public Ingresso() {
        
    }
    
    //usar o set garante que as instruções adicionais necessárias ao setar uma variável sejam executadas
    public Ingresso(String nome, String cpf, Evento evento) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEvento(evento);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
        
        this.calculaValor();
        this.informaTipoIngresso();
    }

    public double getValor() {
        return valor;
    }

    //apenas para calculo nas subclasses
    protected void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    //apenas para calculo nas subclasses
    protected void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}