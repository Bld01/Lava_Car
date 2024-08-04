public class Cliente extends Pessoa {
    private double saldo;

    public Cliente(String nome, String cpf, int idade, double saldo) {
        super(nome, cpf, idade);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}