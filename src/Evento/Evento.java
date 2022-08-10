package Evento;

import Ingresso.Ingresso;
import java.util.ArrayList;

public class Evento {
    private String nome, data;
    private float valorUnico;
    private int capMax;
    private ArrayList<Ingresso> ingressos;
    
    //adiciona todo ingresso criado na lista, a menos que já tenha excedido a capacidade máxima do evento
    public void venderIngresso(Ingresso ingresso) {
        if(this.ingressos.size() < capMax) {
            this.ingressos.add(ingresso);
            System.out.println("\nINGRESSO VENDIDO");
            ingresso.resumoIngresso();
        } else {
            System.out.println("\nNão é possível vender mais ingressos, capacidade máxima atingida");
        }
    }
    
    //mostra a quantidade de ingressos vendidos 
    public void quantidadeIngressos() {
        System.out.println("\nEvento: " + this.getNome());
        System.out.println("Quantidade de ingressos vendidos: " + this.ingressos.size());
        
        for(int i = 0; i < this.ingressos.size(); i++) {
            System.out.println("\nINGRESSO " + (i+1));
            this.ingressos.get(i).resumoIngresso();
        }
    }
    
    //mostra um resumo dos dados do evento
    public void resumoEvento() {
        System.out.println("\n--Dados do Evento--");
        System.out.println("Evento: " + this.getNome());
        System.out.println("Data: " + this.getData());
        System.out.println("Capacidade máxima: " + this.getCapMax());
        System.out.println("Valor do ingresso: " + this.getValorUnico());
        System.out.println("Quantidade de ingressos vendidos: " + this.ingressos.size());
    }

    //construtores
    public Evento() {
        this.ingressos = new ArrayList<>();
    }
    
    public Evento(String nome, String data, float valor, int capMax) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valor;
        this.capMax = capMax;
        this.ingressos = new ArrayList<>();
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valor) {
        this.valorUnico = valor;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }
}
