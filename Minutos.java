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
public class Minutos {
    private float seconds = 60;
    private float hours = 60;
    private float days = 1440;
    private float weeks = 10080;
    private float months = 43800;
    private float years = 525600;
    private float minutess;
    private int minutoss;
    private Scanner leer;

public void convertirMinutos() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Horas");
        System.out.println("3- a Dias");
        System.out.println("4- a Semanas");
        System.out.println("5- a Meses");
        System.out.println("6- a Años");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        minutoss = leer.nextInt();
        System.out.print("Introduzca los Minutos a convertir: ");
        minutess = leer.nextFloat();
        
        do{
        switch (minutoss) {
            case 1:
                {
                    float result = (minutess * seconds);
                    System.out.println(minutess+" Minutos son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (minutess / hours);
                    System.out.println(minutess+" Minutos son " +result+" Horas");
                    break;
                }
            case 3:
                {
                    float result = (minutess / days);
                    System.out.println(minutess+" Minutos son " +result+" Dias");
                    break;
                }
            case 4:
                {
                    float result = (minutess / weeks);
                    System.out.println(minutess+" Minutos son " +result+" Semanas");
                    break;
                }
            case 5:
                {
                    float result = (minutess / months);
                    System.out.println(minutess+" Minutos son " +result+" Meses");
                    break;
                }
            case 6:
                {
                    float result = (minutess / years);
                    System.out.println(minutess+" Minutos son " +result+" Años");
                    break;
                }
            default:
                break;
        }
        System.exit(0);
        }while(minutoss <= 6 && minutoss > 0);
}
}