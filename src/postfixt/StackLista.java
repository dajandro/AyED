/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Daniel Orozco
*/

package postfixt;

/**
 *
 * @author Pablo
 * @param <T>
 */
public class StackLista<T> extends AbstractStack<T> {
    
    private int sp;
    private AbstractList<T> _pila;
    
    
    public StackLista(int tipoLista)
    {
        FactoryListas _nFactory = new FactoryListas();
        //se implementa el tipo Integer
        //si se quiere cambiar el tipo, basta con cambiar este tipo, las entradas 
        //y el parametro del bubblesort
         _pila = _nFactory.getLista(tipoLista, 1);
         for (int i = 0; i < 100; i++)
            _pila.Agregar(null,i); 
      
         sp = _pila.getTamaño()-1;
        
    }

    @Override
    public T pop() {
        /**
    * post: regresa como entero el valor el valor que esta apuntando el puntero
    */
    {
        T dato = null;
        if ((this.sp <_pila.getTamaño()) && (this.sp > 0))
        {            
            sp++;
            dato = (T)  _pila.get(sp);
        }
        else
        {
            System.out.println("Stack out of bounds");
            dato = null;
        }
        return dato;
    }
}

    @Override
    public void push(T dato) //pre: el parametro dato no es nulo
    //post: mete valor generico a la pila
    {
         
         if ((this.sp < _pila.getTamaño()) && (this.sp >0))
        {           
             _pila.set(dato, sp);
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    
    }

    @Override
    public boolean isEmpty() {
        return _pila.isEmpty();
    }

}
