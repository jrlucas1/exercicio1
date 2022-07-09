package model;

public class Funcionario{
    private String nome;
    private double salario;

    //getters

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    //setters

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //instancias

    public Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
