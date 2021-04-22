package br.com.erickfreire.programadeimpressaodelosangomodificado;

import java.util.Scanner;

/**
 * Programa que desenha losangos com asteriscos modificado
 * @author Erick Freire
 * @version 1 - Criado em 22-04-2021 as 15:08
 */

public class ProgramaDeImpressaoDeLosangoModificado {
	public static void main(String[] args) {
		
		int numero,
        espacos,
        asteriscos;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Insira um número ímpar: ");
    numero = entrada.nextInt();
    
    System.out.println();
    
    if(numero%2 != 0){
        asteriscos = 1;
        espacos = (numero-1)/2;
        for(int linha = 1 ; espacos > 0 ; linha++){
            
            //Espaços
            for(int count = 1 ; count <= espacos ; count++){
                System.out.print(" ");
            }
            
            //Asteriscos
            for(int count = 1 ; count <= asteriscos ; count++){
                System.out.print("*");
            }
            
            espacos--;
            asteriscos += 2;
            System.out.println();
        }
        
        //Imprimindo a parte de baixo do diamante
        for(int linha=1 ; asteriscos > 0 ; linha++){
            
            //Espaços
            for(int count = 1 ; count <= espacos ; count++){
                System.out.print(" ");
            }
            
            //Asteriscos
            for(int count = 1 ; count <= asteriscos ; count++){
                System.out.print("*");
            }
            
            espacos++;
            asteriscos -= 2;
            System.out.println();
        }
        
    }else{
        System.out.println("Não é ímpar!");
    }
		
	}

}
