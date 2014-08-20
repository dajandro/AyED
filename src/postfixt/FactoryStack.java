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
                return (AbstractStack<T>) new StackArrayList<T>();                                            
            case 2:
                return (AbstractStack<T>) new StackVector<T>();                    
            case 3:
                switch (tipoLista)
                {
                    case 1:
                        return (AbstractStack<T>) new StackLista(tipoLista);
                    case 2:
                        return (AbstractStack<T>) new StackLista(tipoLista);
                    case 3:
                        return (AbstractStack<T>) new StackLista(tipoLista);
                     default:
                        System.out.println("Ha escogido una opción incorrecta");
                        return null;
                }              
            default:
                System.out.println("Ha escogido una opción incorrecta");
                return null;
        }
    }
}
