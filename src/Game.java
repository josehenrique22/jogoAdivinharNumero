public class Game extends AlgoritimoController{
    public static void main(String[] args) {
        System.out.println("Você tem 5 tentativas para adivinhar um número de 1 a 10.");
        AlgoritimoController playGame = new AlgoritimoController();
        playGame.AdivinhaNumero();
    }
}
