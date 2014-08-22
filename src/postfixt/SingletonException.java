/*
 * Universidad del Valle de Guatemala.
 * Pablo Díaz 13203
 * Daniel Orozco 13312 
*/

package postfixt;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class SingletonException extends RuntimeException {
    
    //new exception type for singleton classes
    public SingletonException()
    {
        super();
    }
    //-----------------------------------------------
    public SingletonException(String s)
    {
        super(s);
    }    
}
