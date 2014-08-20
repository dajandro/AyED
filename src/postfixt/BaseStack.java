/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz 
 */

package postfixt;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public abstract class BaseStack<T> implements IStack<T> {
    
    public double eval(String exp, BaseStack stack)
    {
        int i = 0;        
        //se recorre todo el string ingresado
        for (i = 0; i < exp.length(); i++ )
        {
            switch (exp.charAt(i))
            {
                //si el string es un numero en caracter, se envia a la pila como numero
                case '0': stack.push(0); break;
                case '1': stack.push(1); break;
                case '2': stack.push(2); break;
                case '3': stack.push(3); break;
                case '4': stack.push(4); break;
                case '5': stack.push(5); break;
                case '6': stack.push(6); break;
                case '7': stack.push(7); break;
                case '8': stack.push(8); break;
                case '9': stack.push(9); break;
                //cuando se lea la operacion de suma se hace la operacion y se 
                //envia el resultado a la pila
                case '+': 
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();                    
                    int n_res = o1 + o2;                                        
                    stack.push(n_res);
                    break;
                }
                case '-':
                //cuando se lea la operacion de la resta se hace la operacion y se 
                //envia el resultado a la pila
                    
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();                    
                    int n_res = -o1 + o2;                                        
                    stack.push(n_res);
                    break;                   
                }
                case '*':
                //cuando se lea la operacion de la mult. se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop();                    
                    int n_res = o1 * o2;                                        
                    stack.push(n_res);
                    break;                    
                }
                case '/':
                 //cuando se lea la operacion de la division se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = (int) stack.pop();
                    int o2 = (int) stack.pop(); 
                    int n_res = 0;
                    if (o1 != 0)
                        n_res = o2 / o1;
                    else
                        System.out.println("No se puede divir por 0");                    
                    stack.push(n_res);
                    break;                    
                }
            }//termina switch
        }//termina for
        return (double) stack.pop();
    }
}
