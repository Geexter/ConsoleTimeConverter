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
public class Meses {
    private float seconds = 2628000;
    private float minutes = 43800;
    private float hours = 730;
    private float days = 30;
    private float weeks = 4;
    private float years = 12;
    private float monthss;
    private int mesess;
    private Scanner leer;

public void convertirMeses() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Minutos");
        System.out.println("3- a Horas");
        System.out.println("4- a Dias");
        System.out.println("5- a Semanas");
        System.out.println("6- a Años");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        mesess = leer.nextInt();
        System.out.print("Introduzca los Meses a convertir: ");
        monthss = leer.nextFloat();
        
        do{
        switch (mesess) {
            case 1:
                {
                    float result = (monthss * seconds);
                    System.out.println(monthss+" Meses son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (monthss * minutes);
                    System.out.println(monthss+" Meses son " +result+" Minutos");
                    break;
                }
            case 3:
                {
                    float result = (monthss * hours);
                    System.out.println(monthss+" Meses son " +result+" Horas");
                    break;
                }
            case 4:
                {
                    float result = (monthss * days);
                    System.out.println(monthss+" Meses son " +result+" Dias");
                    break;
                }
            case 5:
                {
                    float result = (monthss * weeks);
                    System.out.println(monthss+" Meses son " +result+" Semanas");
                    break;
                }
            case 6:
                {
                    float result = (monthss / years);
                    System.out.println(monthss+" Meses son " +result+" Años");
                    break;
                }
            default:
                break;
        }
        System.exit(0);
        }while(mesess <= 6 && mesess > 0);
}
}
