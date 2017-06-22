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
public class TimeConverter {
    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Opciones");
    System.out.println("1- Generico");
    System.out.println("2- Convertir Segundos");
    System.out.println("3- Convertir Minutos");
    System.out.println("4- Convertir Horas");
    System.out.println("5- Convertir Dias");
    System.out.println("6- Convertir Semanas");
    System.out.println("7- Convertir Meses");
    System.out.println("8- Conertir Años");
    System.out.println("0- Salir");
    System.out.print("Opcion: ");
    int n = leer.nextInt();
    switch(n){
        case 1:
            Generico generico = new Generico();
            generico.iniciarGenerico();
            break;
        case 2:
            Segundos segundos = new Segundos();
            segundos.convertirSegundos();
            break;
        case 3:
            Minutos minutos = new Minutos();
            minutos.convertirMinutos();
            break;
        case 4:
            Horas horas = new Horas();
            horas.convertirHoras();
            break;
        case 5:
            Dias dias = new Dias();
            dias.convertirDias();
            break;
        case 6:
            Semanas semanas = new Semanas();
            semanas.convertirSemanas();
            break;
        case 7:
            Meses meses = new Meses();
            meses.convertirMeses();
        case 8:
            Años años = new Años();
            años.convertirAños();
            break;
        case 0:
            break;
    }
    }
    
}
