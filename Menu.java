import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Carro carro = new Carro("Sedan", "S14");

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José", "111.111.111-11", 30, "Lavador", 2000.00, 0);
        Cliente cliente = new Cliente("Maria", "222.222.222-22", 28, 1000);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Cliente");
            System.out.println("2: Funcionário");
            System.out.println("0: Sair");

            int opcao = lerInteiro();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            switch (opcao) {
                case 1:
                    menuCliente(cliente, funcionario);
                    break;
                case 2:
                    menuFuncionario(funcionario);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void menuCliente(Cliente cliente, Funcionario funcionario) {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Pagar");
            System.out.println("2: Visualizar Carro");
            System.out.println("0: Voltar");

            int opcao = lerInteiro();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do pagamento: R$ ");
                    double valorPagamento = 0;
                    boolean valorValido = false;

                    while (!valorValido) {
                        try {
                            String input = scanner.nextLine();
                            valorPagamento = Double.parseDouble(input);
                            if (valorPagamento > 0) {
                                valorValido = true;
                            } else {
                                System.out.println("O valor do pagamento deve ser positivo. Tente novamente.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número decimal válido.");
                        }
                    }

                    funcionario.aumentarSaldo(valorPagamento);
                    System.out.println("Valor Pago: R$ " + valorPagamento);
                    break;
                case 2:
                    System.out.println("Modelo: " + carro.getModelo());
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void menuFuncionario(Funcionario funcionario) {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Visualizar Salário");
            System.out.println("2: Ver Cargo");
            System.out.println("3: Visualizar Saldo da Loja");
            System.out.println("0: Voltar");

            int opcao = lerInteiro();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Salário de: R$ " + funcionario.getSalario());
                    break;
                case 2:
                    System.out.println("Cargo: " + funcionario.getCargo());
                    break;
                case 3:
                    System.out.println("Saldo da Loja: R$ " + funcionario.getSaldoLoja());
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
    }
}