/*
 * Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/


package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio21 {

public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um numero");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        
        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Nao e primo - divisivel por " + i);
                primo = false;
                //break;
            }
        }
        
        if (primo){
            System.out.println("e numero primo");
        }
    }

}
