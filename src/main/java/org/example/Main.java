package org.example;

import clases.Personaje;
import clases.Calculadora;
import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personaje raton = new Personaje("Raton",90,50,7,18,100);

        Personaje susana = new Personaje("Pikachu",95,32,9,18,100);

        Calculadora calculadora = new Calculadora(12,34);



        //menu

        int observador = 100;

        Scanner ingresarDatos = new Scanner(System.in);

        System.out.println("***Menu***");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Para dividir");
        System.out.println("5. Salir");

        while(observador != 5){


            System.out.println("Digite una opcion: ");
            observador = ingresarDatos.nextInt();

            System.out.println("digite el primer numero");
            calculadora.setNumero1(ingresarDatos.nextInt());
            System.out.println("digite el segundo numero numero");
            calculadora.setNumero2(ingresarDatos.nextInt());
            if(observador == 1){



                System.out.println(calculadora.Sumar());
            } else if(observador == 2){



                System.out.println(calculadora.Restar());
            } else if(observador == 3){



                System.out.println(calculadora.Multiplicar());
            } else if(observador == 4){

                System.out.println(calculadora.Dividir());
            }
            else if(observador==5) {
                break;
            } else {
                System.out.println("digite un numero valido");
            }



        }





    }

}