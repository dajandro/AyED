/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Daniel Orozco
*/

package postfixt;

import java.util.Vector;

/**
 *
 * @author Pablo
 */
public class StackVector<T> extends AbstractStack<T> {
    
    private int sp;
    private Vector pila;
    
    public StackVector()
    {
        pila = new Vector(10);
        sp = pila.size()-1;
    }

    public StackVector(int tamaño)
    {
        pila = new Vector(tamaño);
        sp =  pila .size()-1;
    }
    @Override
    public T pop() 
   /**
    * post: regresa como entero el valor el valor que esta apuntando el puntero
    */
    {
        T dato = null;
        if ((this.sp <  pila .size()) && (this.sp > 0))
        {            
            sp++;
            dato = (T)  pila .get(sp);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }

    @Override
    public void push(T dato) 
    {
         if ((this.sp <  pila .size()) && (this.sp >0))
        {           
             pila .set(sp, dato);           
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    public boolean isEmpty() 
    {
        return  pila.isEmpty();
    }

}
