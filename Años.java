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
public class A�os {
    private float seconds = 31536000;
    private float minutes = 525600;
    private float hours = 8760;
    private float days = 365;
    private float weeks = 52;
    private float months = 12;
    private float yearss;
    private int a�oss;
    private Scanner leer;

public void convertirA�os() {
    System.out.println("Elija tipo de conversion");
        System.out.println("1- a Segundos");
        System.out.println("2- a Minutos");
        System.out.println("3- a Horas");
        System.out.println("4- a Dias");
        System.out.println("5- a Semanas");
        System.out.println("6- a Meses");
        System.out.println("7- Regresar al menú anterior");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        a�oss = leer.nextInt();
        System.out.print("Introduzca los Años a convertir: ");
        yearss = leer.nextFloat();
        
        do{
        switch (a�oss) {
            case 1:
                {
                    float result = (yearss * seconds);
                    System.out.println(yearss+" Años son " +result+" Segundos");
                    break;
                }
            case 2:
                {
                    float result = (yearss * minutes);
                    System.out.println(yearss+" Años son " +result+" Minutos");
                    break;
                }
            case 3:
                {
                    float result = (yearss * hours);
                    System.out.println(yearss+" Años son " +result+" Horas");
                    break;
                }
            case 4:
                {
                    float result = (yearss * days);
                    System.out.println(yearss+" Años son " +result+" Dias");
                    break;
                }
            case 5:
                {
                    float result = (yearss * weeks);
                    System.out.println(yearss+" Años son " +result+" Semanas");
                    break;
                }
            case 6:
                {
                    float result = (yearss * months);
                    System.out.println(yearss+" Años son " +result+" Años");
                    break;
                }
            default:
                break;
        }
        System.exit(0);
        }while(a�oss <= 6 && a�oss > 0);
}
}