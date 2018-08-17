

package Video16PedirEdadKev;

import java.util.*;

public class Pedir2 {
    
    public void esEdad(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tu edad: ");  
        int edad1 = entrada.nextInt();  
        System.out.println();
        
        if(edad1 < 18){
            System.out.println("Eres un adolescente");
            
        }else if(edad1 < 40){
            
            System.out.println("Eres un joven");
            
        }else if(edad1 < 65){
               
            System.out.println("Eres maduro");
            
        }else {
            
            System.out.println("Cuidate, jeje");
        }
            
    }
}
