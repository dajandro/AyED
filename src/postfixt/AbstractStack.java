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

    /**
     *
     * @param t
     */
    @Override
    public abstract void push(T t);

    /**
     *
     * @return
     */
    @Override
    public abstract boolean isEmpty();
}
