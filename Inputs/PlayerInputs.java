import java.util.Scanner;

public class PlayerInputs {

    protected Scanner myScan = new Scanner(System.in);

    protected int getUserInput() {
        System.out.print("Digite seu palpite: ");
        return Integer.pars eInt(myScan.nextLine());
    }

}
