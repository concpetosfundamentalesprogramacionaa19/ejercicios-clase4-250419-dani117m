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
        // escaneo de entrada 
        Scanner entrada = new Scanner(System.in);
        
        // calificaion es entero 
        int calificacion;
        
        // entrada de datos 
        System.out.println("ingrese la Su nota ");
        calificacion = entrada.nextInt();
        
        // se traen paquetes de la clase anteerior mente creada 
        
        String miMensaje = operacion.mensaje;
        String miMensaje2 = operacion.mensaje2;
        
        // se muestra si esta aprobado o no 
        if (calificacion >=85){
            System.out.printf("%s %d\n", miMensaje,calificacion);
    }else{ // se utiliza un else (sino)
        System.out.printf("%s %d\n", miMensaje2,calificacion);
    }
    int calificacion_2 = 45;
    if (calificacion_2 >=85){
        System.out.printf("Usted está aprobado con %d\n", calificacion_2);
    }
   } 
}