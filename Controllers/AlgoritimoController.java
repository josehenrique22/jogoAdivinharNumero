import java.util.Random;

public class AlgoritimoController extends PlayerInputs{

    private int numTentativas = 5;
    private boolean acertou = false;
    private int numRandom;
    Random random = new Random();

    public void AdivinhaNumero() {

        while (numTentativas > 0 && !acertou) {
            numRandom = random.nextInt(10) + 1; // Gera número aleatório de 1 a 10

            System.out.println("Número de tentativas restantes: " + numTentativas);

            int inputs = getUserInput(); // Ler a entrada do usuário a cada tentativa

            if (inputs == numRandom) {
                System.out.println("Parabéns, você acertou o número!" +
                        "\nNúmero Digitado: " + inputs +
                        "\nNúmero Aleatório: " + numRandom);
                acertou = true;
            } else {
                numTentativas--;
                System.out.println("Você errou o número. Tente novamente.");
                System.out.println("Número digitado: " + inputs + " "
                + "Número Aleatorio: " + numRandom);
            }
        }

        // Mensagem final após o loop
        if (!acertou) {
            System.out.println("O jogo terminou. Você não acertou o número.");
            System.out.println("O número correto era: " + numRandom);
        } else {
            System.out.println("O jogo terminou. Parabéns!");
        }

        myScan.close(); // Fechar o Scanner após o término do jogo
    }
}
     

