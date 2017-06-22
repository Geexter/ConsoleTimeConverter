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
public class Generico {
    private int num;
    private int hor;
    private int minu;
    private int seg;
    private Scanner leer;
    
    public void iniciarGenerico(){
        leer = new Scanner(System.in);
        System.out.print("Introduzca los segundos: ");
        num = leer.nextInt();
        hor = num / 3600;
        minu = (num - (hor * 3600)) / 60;
        seg = num - ((hor * 3600) + (minu * 60));
        System.out.println(hor+"h "+minu+"m "+seg+"s");
    }
}
