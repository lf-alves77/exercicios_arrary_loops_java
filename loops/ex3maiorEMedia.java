package loops;

import java.util.Scanner;

public class ex3maiorEMedia {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        

        do {

            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;

            soma = soma + numero;

            count++;



        }

        while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("O média é: " + soma/5);






    }
}
