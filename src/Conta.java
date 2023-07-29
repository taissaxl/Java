import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Maria José";
        String conta = "Corrente";
        double saldo = 2500.00;
        int operacaoDigitada = 0;

        System.out.println("-------------------------------------");
        System.out.println(" Nome do(a) Cliente: " + nome);
        System.out.println(" Conta: " + conta);
        System.out.println(" Saldo: " + saldo);
        System.out.println("-------------------------------------");

        String menu = """
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        while(operacaoDigitada != 4)
        {
            System.out.println("\nDigite a operação desejada:");
            System.out.println(menu);
            operacaoDigitada = leitura.nextInt();

            if(operacaoDigitada == 1)
                System.out.println(String.format("Saldo: %.2f", saldo));
            else if(operacaoDigitada == 2)
            {
                System.out.println("Digite o valor a receber");
                double valorDeposito = leitura.nextDouble();
                saldo += valorDeposito;
            }
            else if(operacaoDigitada == 3)
            {
                System.out.println("Digite o valor a transferir");
                double valorSaque = leitura.nextDouble();
                if(valorSaque <= saldo)
                    saldo -= valorSaque;
                else
                    System.out.println("O valor da transferência ultrapassa o saldo da conta!");
            }
            else if(operacaoDigitada == 4)
                System.out.println("Saindo...");
            else
                System.out.println("Operação inválida");
        }

    }
}
