package EX_04;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        boolean error = false;

    Scanner lector = new Scanner(System.in);
        while(!error) {
        try {
            System.out.println("Num");
            int numero = Integer.parseInt(lector.nextLine());
            int elevado;
            elevado = numero * numero;
            System.out.println("elevado = "+elevado);

        } catch(NumberFormatException e) {
            //ignore

        }

    }

}
}
