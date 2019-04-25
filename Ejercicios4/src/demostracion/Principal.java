/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

// importarcion 
import java.util.Scanner; 

/**
 *
 * @author dani117m
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // escaneo de datos 
        Scanner entrada = new Scanner(System.in);
        
        // tarifa y  mensaje 
       
        int mensajes;
        double iva = 0.12;
        double total;
        double p_iva;
        //ingreso de la variable por teclado 
        System.out.println("Ingrese el numero de mensajes utilizado ");
       
        mensajes = entrada.nextInt();
        
        
        // se muestra por medio de una importacion 
    if ( mensajes <=40){
            total = (mensajes*3);
            p_iva = (total*iva)+total;         
        System.out.printf("El valor a pagar es (incluye iva) 2.f", p_iva);     
    }else{   
      if (mensajes < 41 && mensajes >=200){
            total = (mensajes*3.05);
            p_iva = (total*iva)+total; 
          System.out.printf("El valor a pagar es (incluye iva) 2.f ", p_iva);
      }else{
          if(mensajes >= 201){
              total = (mensajes*3.05);
                p_iva = (total*iva)+total;
              System.out.printf("El valor a pagar es (incluye iva) 2.f", p_iva);   
      }
      }
    }        
    }
}