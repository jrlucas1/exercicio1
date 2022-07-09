package model;

public class Produto{
    private String name;
    private String descricao;
    private double valor;
    private int estoque;

    // getters


    public String getName() {
        return name;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }


    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //instancias

    public Produto(String name, String descricao, double valor, int estoque){
        this.name = name;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    //


    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
