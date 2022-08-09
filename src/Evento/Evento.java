package Evento;

public class Evento {
    private String nome, data;
    private float valor;
    private int capMax;
    //private ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
    
    public void venderIngresso() {
        
    }
    
    public int quantidadeIngressos() {
        return 0;
    }

    public Evento(String nome, String data, float valor, int capMax) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.capMax = capMax;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }
}
