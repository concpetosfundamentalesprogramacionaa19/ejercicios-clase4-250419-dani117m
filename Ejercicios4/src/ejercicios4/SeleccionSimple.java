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
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // escaneo de datos 
        Scanner entrada = new Scanner(System.in);
        
        // calificacion es entero 
        int calificacion;
        
        //ingreso de la variable por teclado 
        System.out.println("ingrese la Su nota ");
        calificacion = entrada.nextInt();
        String miMensaje =operacion.mensaje;
        
        
        // se muestra por medio de una importacion 
        if (calificacion >=85){
            System.out.printf("%s %d\n", miMensaje,calificacion);
    }
    int calificacion_2 = 45;
    if (calificacion_2 >=85){
        System.out.printf("Usted está aprobado con %d\n", calificacion_2);
    }
   } 
}