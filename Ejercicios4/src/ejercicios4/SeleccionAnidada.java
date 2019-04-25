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
public class SeleccionAnidada {

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
        String miMensaje1 = Operaciondos.mensaje1;
        String miMensaje2 = Operaciondos.mensaje2;
        String miMensaje3 = Operaciondos.mensaje3;
        String miMensaje4 = Operaciondos.mensaje4;
        // se muestra por medio de una importacion 
        if (calificacion >=90){
            System.out.printf("%s %d\n", miMensaje1, calificacion);     
    }else{
      if (calificacion < 89 && calificacion >=80){
          System.out.printf("%s %d\n", miMensaje2, calificacion);
      }else{
          if(calificacion < 79 && calificacion >=50){
              System.out.printf("%s %d\n", miMensaje3, calificacion);
          }else{
              if(calificacion < 49 && calificacion >=0){
          }System.out.printf("%s %d\n", miMensaje4, calificacion);
          
      }
    }
    int calificacion_2 = 45;
    if (calificacion_2 >=85){
    }
   }
           
  }      
}