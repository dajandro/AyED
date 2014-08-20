/*
 * Universidad del valle de Guatemala
* Pablo Díaz 13203
* Daniel Orozco 13312
*/

package postfixt;

import java.util.Scanner;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada_datos  = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        FactoryStack factory = new FactoryStack();   
        AbstractStack stack;
        System.out.println("Ingrese el tipo de stack");
        System.out.print("1. ArrayList\n");
        System.out.print("2. Vector\n");
        System.out.print("3. Lista\n");        
        opcion = entrada_datos.nextInt();     
        if (opcion == 3)
        {
            System.out.println("Ingrese el tipo de lista");
            System.out.print("1. Lista\n");
            System.out.print("2. Lista Doble\n");
            System.out.print("3. Lista Circular\n");       
            opcion2 = entrada_datos.nextInt();
        }        
        stack = factory.getStack(opcion, opcion2);
        System.out.println("Ingrese expresión: ");       
        String exp = entrada_datos.next();
        double res = 0;
        res = stack.eval(exp,stack);        
        System.out.println("before"+stack.isEmpty());
        int res2 = stack.eval(exp,stack);        
        System.out.println("Resultado: " + res2);
    }
    
}
