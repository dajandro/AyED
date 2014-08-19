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
public interface IStack<T> {
    public T pop();
    public void push(T t);
    public boolean isEmpty();
}
