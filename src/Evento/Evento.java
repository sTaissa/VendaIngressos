package Evento;

import Ingresso.Ingresso;
import java.util.ArrayList;

public class Evento {
    private String nome, data;
    private float valorUnico;
    private int capMax;
    private ArrayList<Ingresso> ingressos;
    
    public void venderIngresso(Ingresso ingresso) {
        if(this.ingressos.size() < capMax) {
            ingressos.add(ingresso);
        } else {
            System.out.println("Não é possível vender mais ingressos, capacidade máxima atingida\n");
        }
    }
    
    public void quantidadeIngressos() {
        System.out.println("Evento: " + this.nome + "\nQuantidade de ingressos vendidos: " + this.ingressos.size());
        
        for(Ingresso ingresso : this.ingressos) {
            ingresso.resumo();
        }
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
