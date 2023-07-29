import java.util.Scanner;
import java.util.Random;
public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 1;

        while(tentativas <= 5)
        {
            System.out.println("Tentativa número " + tentativas);
            System.out.println("Digite um número entre 0 e 100");
            int chute = leitura.nextInt();
            tentativas++;

            if(chute == numeroSecreto)
            {
                System.out.println("Você acertou!");
                break;
            }
            else if(chute < numeroSecreto)
            {
                System.out.println("O número é menor que o número secreto!");
            }
            else
            {
                System.out.println("O número digitado é maior que o número secreto!");
            }
        }

        if(tentativas > 5)
            System.out.println("Você perdeu! O número secreto era " + numeroSecreto);

    }
}
