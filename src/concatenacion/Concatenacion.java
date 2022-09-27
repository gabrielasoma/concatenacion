
package concatenacion;

import java.util.Scanner;

/*Este metodo se va a encargar de solicitar al usuario por teclado nombre y apeliido
y lo vamos a mostrar por la pantalla concatenados*/

public class Concatenacion {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
     
        System.out.println("Introduce tu apellido: ");
        String apellido = entrada.nextLine();
        
        
        System.out.println("Tu nombre y apellidos son : " + nombre + " " + apellido);
        
    }
    
}
