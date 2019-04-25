/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios4;
// importarcion 
import java.util.Scanner; 
import paquetedos.*;
/**
 *
 * @author dani117m
 */
public class SeleccionDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //documentacion
        Scanner entrada = new Scanner(System.in);
        //
        
        int calificacion;
        //
        System.out.println("ingrese la Su nota ");
        calificacion= entrada.nextInt();
        
        //
        String miMensaje = operacion.mensaje;
        String miMensaje2 = operacion.mensaje2;
        
        if (calificacion >=85){
            System.out.printf("%s %d\n", miMensaje,calificacion);
    }else{
        System.out.printf("%s %d\n", miMensaje2,calificacion);
    }
    int calificacion_2 = 45;
    if (calificacion_2 >=85){
        System.out.printf("Usted está aprobado con %d\n", calificacion_2);
    }
   } 
}