package model;

public class Conta {
    private String id;
    private double saldo;


    //comportamentos

    public double getSaldo() { //getter
        return saldo;
    }

    public String getId() {
        return id;
    }

    public void deposita(double saldo) { //setter
        this.saldo = this.saldo + saldo;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void atualiza(double taxa){
        this.saldo = this.saldo * taxa;
    }

    public Conta(String id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    //


    @Override
    public String toString() {
        return "Conta{" +
                "id='" + id + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
