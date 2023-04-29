package Classes;

public class ContaBancaria {
    private Double saldo;
    private String titular;

    public ContaBancaria(Double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
