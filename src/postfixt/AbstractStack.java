/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Daniel Orozco
*/

package postfixt;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 * @param <T>
 */
public abstract class AbstractStack<T> implements IStack<T> {

    /**
     *
     * @return
     */
    @Override
    public abstract T pop();
    //post: método para sacar un valor generico a la pila

    /**
     *
     * @param t
     */
    @Override
    public abstract void push(T dato);
    //post: método para meter un valor a la pila

    /**
     *
     * @return
     */
    @Override
    public abstract boolean isEmpty();
    //post: método para saber si el stack esta vacio
}
