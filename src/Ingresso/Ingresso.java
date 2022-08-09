package Ingresso;

import Evento.Evento;

//classe abstrata
public abstract class Ingresso {
    private String nome, cpf;
    private Evento evento;
    private double valor;
    
    //métodos a serem implementados pelas subclasses
    protected abstract void calculaValor();
    public abstract void imprimirValor();
    
    //exibe um resumo mostrando os dados do proprietário do ingresso e do evento
    public void resumo(){
        System.out.println("--Dados do Ingresso--");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Evento: " + this.getEvento().getNome());
        System.out.println("Data do evento: " + this.getEvento().getData());
        this.imprimirValor();
    }

    //construtores
    public Ingresso() {
        this.calculaValor();
    }
    
    public Ingresso(String nome, String cpf, Evento evento) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        
        this.calculaValor();
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
    }

    //apenas para calculo nas subclasses
    protected double getValor() {
        return valor;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }
    
    
}