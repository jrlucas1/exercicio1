package model;

public class Conta {
    public int id;
    private double saldo;


    //comportamentos

    public double getSaldo() { //getter
        return saldo;
    }

    public void deposita(double saldo) { //setter
        this.saldo = this.saldo + saldo;
    }

    public void setSaldo(double saldo) {
        if (this.saldo != 0) {
            this.saldo = this.saldo - saldo;
        }
    }

    public void atualiza(double taxa){
        this.saldo = this.saldo * taxa;
    }

    public Conta(int id, double saldo){
        this.saldo = saldo;
    }

    //

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
