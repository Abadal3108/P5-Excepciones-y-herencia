package EX_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] myArray = new int[3];

        try {
            int numero;
            for (int i = 0; i < 4; i++) {
                System.out.println("Introduce "+i);
                numero = entrada.nextInt();
                myArray[i]=numero;
            }
        }catch(Exception MaxLengthArr){
            System.out.println("maximo de rango");

        }
    }
}
