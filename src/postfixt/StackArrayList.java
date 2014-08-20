/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Daniel Orozco
*/

package postfixt;

import java.util.ArrayList;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class StackArrayList<T> extends AbstractStack<T> {

    private int sp;    
    private ArrayList<T> pila;
    
    public StackArrayList()
    {   
        // inica el ArrayList con un tamaño de 10
        pila = new ArrayList<T>();
        //sp = pila.size() - 1;
        sp = 0;
    }
    
    /**
     *
     * @param t
     */
    public StackArrayList(int t)
    {
        // inica el ArrayList con un tamaño t de parámetro
        pila = new ArrayList<T>(t);        
        //sp = pila.size() - 1;
        sp = 0;
    }
    
    @Override
    public T pop() {
        T dato = null;
        if ((this.sp < pila.size()) && (this.sp > 0))
        {           
            //dato = pila.get(sp);
            dato = pila.remove(sp);            
            sp--;
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }

    @Override
    public void push(T t) {
        if ((this.sp < pila.size()) && (this.sp >0))
        {           
            pila.add(sp, t);
            sp++;
        }
        else
            System.out.println("Stack out of bounds");
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
}
