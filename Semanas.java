/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconverter;

import java.util.Scanner;

/**
 *
 * @author Geexter
 */
public class Semanas {
    private float seconds = 604800;
    private float minutes = 10080;
    private float hours = 168;
    private float days = 7;
    private float months = 4;
    private float years = 52;
    private float weekss;
    private int semanass;
    private Scanner leer;

public void convertirSemanas() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Minutos");
        System.out.println("3- a Horas");
        System.out.println("4- a Dias");
        System.out.println("5- a Meses");
        System.out.println("6- a Años");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        semanass = leer.nextInt();
        System.out.print("Introduzca las Semanas a convertir: ");
        weekss = leer.nextFloat();
        
        do{
        switch (semanass) {
            case 1:
                {
                    float result = (weekss * seconds);
                    System.out.println(weekss+" Semanas son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (weekss * minutes);
                    System.out.println(weekss+" Semanas son " +result+" Minutos");
                    break;
                }
            case 3:
                {
                    float result = (weekss * hours);
                    System.out.println(weekss+" Semanas son " +result+" Horas");
                    break;
                }
            case 4:
                {
                    float result = (weekss * days);
                    System.out.println(weekss+" Semanas son " +result+" Dias");
                    break;
                }
            case 5:
                {
                    float result = (weekss / months);
                    System.out.println(weekss+" Semanas son " +result+" Meses");
                    break;
                }
            case 6:
                {
                    float result = (weekss / years);
                    System.out.println(weekss+" Semanas son " +result+" Años");
                    break;
                }
            default:
                break;
        }
        System.exit(0);
        }while(semanass <= 6 && semanass > 0);
}
}

