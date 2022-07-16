package model;

public class Funcionario{
    private String id;
    private String nome;
    private double salario;

    //getters

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }
    //setters

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    //instancias

    public Funcionario(String id, String nome, int salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(){
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
