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
public class Segundos {
    protected float minutes = 60;
    protected float hours = 3600;
    protected float days = 86400;
    protected float weeks = 604800;
    protected float months = 2628005;
    protected float years = 31536036;
    protected float secondss;
    protected int segundoss;
    protected Scanner leer;
    
public void convertirSegundos(){
        System.out.println("Elija tipo de conversion");
        System.out.println("1- a Minutos");
        System.out.println("2- a Horas");
        System.out.println("3- a Dias");
        System.out.println("4- a Semanas");
        System.out.println("5- a Meses");
        System.out.println("6- a Años");
        leer = new Scanner(System.in);
        System.out.print("Opcion: ");
        segundoss = leer.nextInt();
        System.out.print("Introduzca los Segundos a convertir: ");
        secondss = leer.nextFloat();
        
        do{
        switch (segundoss) {
            case 1:
                {
                    float result = (secondss / minutes);
                    System.out.println(secondss+" Segundos son " +result+" Minutos");
                    break;
                }
            case 2:
                {
                    float result = (secondss / hours);
                    System.out.println(secondss+" Segundos son " +result+" Horas");
                    break;
                }
            case 3:
                {
                    float result = (secondss / days);
                    System.out.println(secondss+" Segundos son " +result+" Dias");
                    break;
                }
            case 4:
                {
                    float result = (secondss / weeks);
                    System.out.println(secondss+" Segundos son " +result+" Semanas");
                    break;
                }
            case 5:
                {
                    float result = (secondss / months);
                    System.out.println(secondss+" Segundos son " +result+" Meses");
                    break;
                }
            case 6:
                {
                    float result = (secondss / years);
                    System.out.println(secondss+" Segundos son " +result+" Años");
                    break;
                }
            default:
                System.out.println("Introduzca una opcion valida");
                break;
        }
        System.exit(0);
        }while(segundoss <= 6 && segundoss > 0);
}
}
