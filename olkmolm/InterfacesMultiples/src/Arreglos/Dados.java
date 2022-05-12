/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Random;

/**
 *
 * @author invitado
 */
public class Dados {

    //generar los numeros de forma aleatoria
    Random numerosAleatorios = new Random();

    int frecuencia1 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia2 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia3 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia4 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia5 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia6 = 0; //Cuenta las veces que se lanzo el numero 1
    int frecuencia7 = 0; //Cuenta las veces que se lanzo el numero 1

    int cara; //Almacena el valor que se tiro mas recientemente 

    //Sintetiza los resultados de tirar un dado 10 veces 
    for(int tiro = 1, tiro
    <=60,tiro

    
        ++){
    cara = 1 + numerosAleatorios.nextInt(6); // Caras del dado
        //Determinar el valor del tiro de 1 a 6 e incrementar el contador apropaido

        switch (cara) {
            case 1:
                ++frecuencia1;
                break;
            case 2:
                ++frecuencia2;
                break;
            case 3:
                ++frecuencia3;
                break;
            case 4:
                ++frecuencia4;
                break;
            case 5:
                ++frecuencia5;
                break;
            case 6:
                ++frecuencia6;
                break;
        }
    }

    System.out.println ("Cara \t Frecuencia ");
            System.out.printf ("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", frecuencia1, frecuencia2, frecuencia3,frecuencia4,frecuencia5, frecuencia6);
    }
    
}
