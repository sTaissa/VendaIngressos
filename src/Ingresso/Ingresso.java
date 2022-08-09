package Ingresso;

import Evento.Evento;

public abstract class Ingresso {
    private String nome, cpf;
    private Evento evento;
    
    public abstract void calculaValor();
    
    public abstract void imprimirValor();
    
    public void resumo(){
        
    }

    public Ingresso(String nome, String cpf, Evento evento) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}