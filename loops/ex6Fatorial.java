package loops;

import java.util.Scanner;

public class ex6Fatorial {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int mult = 1;
        
        System.out.println(fatorial + "! = ");

        for(int i = fatorial; i >= 1 ; i = i--){

            mult = mult * i;


        }

        System.out.println(mult);
        





    }




    
}
