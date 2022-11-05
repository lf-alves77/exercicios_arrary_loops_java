package loops;

import java.util.Scanner;

public class ex4ParImpar {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int quantN;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Quantidade de números: ");
        quantN = scan.nextInt();

        int count = 0;

        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;


            count++;



        } while(count < quantN);

        System.out.println("Quantidade de números Pares: " + quantPares);
        System.out.println("Quantidade de números Impares: " + quantImpares);

    }
    
}
