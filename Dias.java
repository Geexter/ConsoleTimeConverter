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
public class Dias {
    private float seconds = 86400;
    private float minutes = 1440;
    private float hours = 24;
    private float weeks = 7;
    private float months = 30;
    private float years = 365;
    private float dayss;
    private int diass;
    private Scanner leer;

public void convertirDias() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Minutos");
        System.out.println("3- a Horas");
        System.out.println("4- a Semanas");
        System.out.println("5- a Meses");
        System.out.println("6- a Años");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        diass = leer.nextInt();
        
        do{
            System.out.print("Introduzca los Dias a convertir: ");
        dayss = leer.nextFloat();
        switch (diass) {
            case 1:
                {
                    float result = (dayss * seconds);
                    System.out.println(dayss+" Dias son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (dayss * minutes);
                    System.out.println(dayss+" Dias son " +result+" Minutos");
                    break;
                }
            case 3:
                {
                    float result = (dayss * hours);
                    System.out.println(dayss+" Dias son " +result+" Horas");
                    break;
                }
            case 4:
                {
                    float result = (dayss / weeks);
                    System.out.println(dayss+" Dias son " +result+" Semanas");
                    break;
                }
            case 5:
                {
                    float result = (dayss / months);
                    System.out.println(dayss+" Dias son " +result+" Meses");
                    break;
                }
            case 6:
                {
                    float result = (dayss / years);
                    System.out.println(dayss+" Dias son " +result+" Años");
                    break;
                }
            default:
                break;
        }
    System.exit(0);
        }while(diass <= 6 && diass > 0);
        
}
}
