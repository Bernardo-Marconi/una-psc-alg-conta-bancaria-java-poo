import java.util.Scanner;

public class ProjetoContaBancaria {
    public static void main(String[] args) {

        System.out.println("Conta Bancária");

        Scanner scan = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Informe seu nome: ");
        contaBancaria.setregistrarNomeCliente(scan.nextLine());

        System.out.println("Informe o número da sua conta bancária: ");
        contaBancaria.setregistrarNumeroContaBancaria(scan.nextLong());

        System.out.println("Infome seu saldo:");
        contaBancaria.setdepositarNovoValor(scan.nextDouble());

        System.out.println("Conta bancária criada com sucesso!");

        while(contaBancaria.getrepetirOperacao().equalsIgnoreCase("r")) {

            System.out.println("Escolha uma das operações: ");
            System.out.println("Depositar: Digite 1\nSacar: Digite 2\nExibir extrato bancário: Digite 3");
            contaBancaria.setrealizarOperacaoEscolhida(scan.nextByte());

        switch (contaBancaria.getoperacaoEscolhida()) {

            case 1:
                System.out.println("Informe o valor do deposito: ");
                contaBancaria.setdepositarNovoValor(scan.nextDouble());

                System.out.printf("Depósito de R$ %.2f realizado com sucesso.",
                contaBancaria.gethistoricoUltimoDeposito());

            break;

            case 2:

                System.out.println("Informe o valor do saque a ser realizado: ");
                contaBancaria.setrealizarSaque(scan.nextDouble());

            do {

                if (contaBancaria.getrealizarSaque() > contaBancaria.getsaldoContaBancaria()) {
                    System.out.println("Saldo insuficiente para realizar a operação!\nInforme um valor válido: ");
                    contaBancaria.setrealizarSaque(scan.nextDouble());

                } else if (contaBancaria.getrealizarSaque() < 1) {
                    System.out.println("Não é possível realizar um saque abaixo de R$ 1,00!\nInforme um valor válido: ");
                    contaBancaria.setrealizarSaque(scan.nextDouble());

                } else if (contaBancaria.getrealizarSaque() > 5000) {
                    System.out.println("Valor do saque acima do permitido (R$ 5000,00)!\nInforme um valor válido: ");
                    contaBancaria.setrealizarSaque(scan.nextDouble());

                } else {
                    System.out.printf("Saque de R$ %.2f realizado com sucesso.", contaBancaria.getrealizarSaque());
                }

            } while (contaBancaria.getrealizarSaque() > contaBancaria.getsaldoContaBancaria()
                    || contaBancaria.getrealizarSaque() < 1);

                    System.out.printf("Saque de R$ %.2f realizado com sucesso.", contaBancaria.getrealizarSaque());

                break;

            case 3: 
                 
                System.out.printf("%s\nNúmero da Conta: %d\nSeu saldo é de: R$ %.2f",contaBancaria.getnomeCliente(), contaBancaria.getnumeroContaBancaria(), contaBancaria.getsaldoContaBancaria());
            }
                System.out.println("\nPara realizar outra operação digite 'R':");
                scan.nextLine();
                contaBancaria.setrepetirOperacao(scan.nextLine());
            }

        scan.close();
    }
}
