package Evento;

import Ingresso.Ingresso;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Evento {
    private String nome;
    private LocalDate data;
    private double valorUnico;
    private int capMax;
    private ArrayList<Ingresso> ingressos;
    
    //adiciona todo ingresso criado na lista, a menos que já tenha excedido a capacidade máxima do evento
    public void venderIngresso(Ingresso ingresso) {
        if(this.ingressos.size() < capMax) {
            if(ingresso.getNome() != null && ingresso.getCpf() != null && ingresso.getEvento() != null) {
                this.ingressos.add(ingresso); 
                ingresso.resumoIngresso(); //lista o ingresso vendido, como uma espécie de comprovante
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível vender esse ingressos, informe os dados corretamente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível vender mais ingressos, capacidade máxima atingida");
        }
    }
    
    //mostra a quantidade de ingressos vendidos 
    public void quantidadeIngressos() {
        String msg = "Evento: " + this.getNome() + "\n";
        msg += "Quantidade de ingressos vendidos: " + this.ingressos.size() + "\n\n";
        
        for(int i = 0; i < this.ingressos.size(); i++) {
            msg += "INGRESSO " + (i+1) + "\n";
            msg += "Nome: " + this.ingressos.get(i).getNome() + "\n";
            msg += "CPF: " + this.ingressos.get(i).getCpf() + "\n";
            msg += "Tipo de ingresso: " + this.ingressos.get(i).getTipoIngresso() + "\n";
            msg += "Valor do ingresso: R$" + this.ingressos.get(i).getValor() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
    //mostra um resumo dos dados do evento
    public void resumoEvento() {
        String msg = "DADOS DO EVENTO\n\n";
        msg += "Evento: " + this.getNome() + "\n";
        msg += "Data: " + this.getData() + "\n";
        msg += "Capacidade máxima: " + this.getCapMax() + "\n";
        msg += "Valor do ingresso: R$" + this.getValorUnico() + "\n";
        msg += "Quantidade de ingressos vendidos: " + this.ingressos.size();
        JOptionPane.showMessageDialog(null, msg);
    }

    //construtores
    public Evento() {
        this.ingressos = new ArrayList<>();
    }
    
    //usar o set garante que as instruções adicionais necessárias ao setar uma variável sejam executadas
    public Evento(String nome, String data, double valor, int capMax) {
        this.setNome(nome);
        this.setData(data);
        this.setValorUnico(valor);
        this.setCapMax(capMax);
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
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public void setData(String data) {
        this.data = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valor) {
        this.valorUnico = valor;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
}
