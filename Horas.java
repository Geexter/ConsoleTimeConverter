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
public class Horas {
    private float seconds = 3600;
    private float minutes = 60;
    private float days = 24;
    private float weeks = 168;
    private float months = 730;
    private float years = 8760;
    private float hourss;
    private int horass;
    private Scanner leer;

public void convertirHoras() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Minutos");
        System.out.println("3- a Dias");
        System.out.println("4- a Semanas");
        System.out.println("5- a Meses");
        System.out.println("6- a Años");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        horass = leer.nextInt();
        System.out.print("Introduzca las Horas a convertir: ");
        hourss = leer.nextFloat();
        
        do{
        switch (horass) {
            case 1:
                {
                    float result = (hourss * seconds);
                    System.out.println(hourss+" Horas son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (hourss * minutes);
                    System.out.println(hourss+" Horas son " +result+" Minutos");
                    break;
                }
            case 3:
                {
                    float result = (hourss / days);
                    System.out.println(hourss+" Horas son " +result+" Dias");
                    break;
                }
            case 4:
                {
                    float result = (hourss / weeks);
                    System.out.println(hourss+" Horas son " +result+" Semanas");
                    break;
                }
            case 5:
                {
                    float result = (hourss / months);
                    System.out.println(hourss+" Horas son " +result+" Meses");
                    break;
                }
            case 6:
                {
                    float result = (hourss / years);
                    System.out.println(hourss+" Horas son " +result+" Años");
                    break;
                }
            default:
                break;
        }
        System.exit(0);
        }while(horass <= 6 && horass > 0);
}
}