package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número a ser analisado: ");
        int numero = entrada.nextInt();

        if(numero % 7 == 0){
            System.out.println("O número é múltiplo de 7");
        } else{
            System.out.println("O número não é múltiplo de 7");
          }

    }

}
