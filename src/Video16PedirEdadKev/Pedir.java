
package Video16PedirEdadKev;

import java.util.*;

public class Pedir {
    
    public void esMayor(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tu edad: ");
        
        int edad = entrada.nextInt();
        
        System.out.println();
        
        if(edad >=18){
            
            System.out.println("Eres mayor de edad");
            
        }else{
            
            System.out.println("Eres menor de edad");
            
        }
    }
    
}
