import java.util.Scanner;

public class ContaInvestimento {

        private double saldo;

        public  ContaInvestimento(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void aplicar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Aplicação de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor aplicado inválido.");
            }
        }

        public void resgatar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Resgate de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        }

        public void verificarSaldo() {
            System.out.println("Saldo atual: " + saldo);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem-vindo ao Banco Investimento!");


            ContaInvestimento conta = new ContaInvestimento(1000);

            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Aplicar");
                System.out.println("2. Resgatar");
                System.out.println("3. Verificar saldo");
                System.out.println("4. Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser aplicado: ");
                        double valorAplicado = scanner.nextDouble();
                        conta.Aplica(valorAplicado);
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser resgatado: ");
                        double valorSaque = scanner.nextDouble();
                        conta.Resgate(valorSaque);
                        break;
                    case 3:
                        conta.verificarSaldo();
                        break;
                    case 4:
                        System.out.println("Obrigado por usar nossos serviços. Volte sempre!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }

    private void Resgate(double valorSaque) {
    }

    private void Aplica(double valorAplicado) {
    }
}

