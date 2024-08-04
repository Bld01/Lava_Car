public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private double saldoLoja;

    public Funcionario(String nome, String cpf, int idade, String cargo, double salario, double saldoLoja) {
        super(nome, cpf, idade);
        this.cargo = cargo;
        this.salario = salario;
        this.saldoLoja = saldoLoja;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public double getSaldoLoja() {
        return saldoLoja;
    }

    public void aumentarSaldo(double valor) {
        if (valor > 0) {
            this.saldoLoja += valor;
        } else {
            System.out.println("Valor inválido para aumento de saldo.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo + ", Salário: " + salario + ", Saldo da Loja: R$ " + saldoLoja;
    }
}
