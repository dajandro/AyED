/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Daniel Orozco
*/

package postfixt;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class FactoryStack<T> {
    
    public AbstractStack<T> getStack(int entry, int tipoLista)
    {
        switch (entry)
        {
            case 1:
                return new StackArrayList<>(1);                                            
            case 2:
                return new StackVector<>();                    
            case 3:
                return new StackLista(tipoLista,0);
                         
            default:
                System.out.println("Ha escogido una opción incorrecta");
                return null;
        }
    }
}
