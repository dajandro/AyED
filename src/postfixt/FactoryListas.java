package postfixt;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
* 
*/

/**
 *
 * @author Pablo and Django
 */
public class FactoryListas<T> {

    public AbstractList<T> getLista(int  entry,int entry2){
        switch (entry2) {
            case 1:
                if (entry == 1)
                    return (AbstractList<T>) new Lista<Integer>();//post: regresa una lista enlazada
                 if (entry==2)
                    return (AbstractList<T>) new ListaDoble<Integer>();//post: regresa una lista doblemente
                if (entry==3) 
                    return (AbstractList<T>) new ListaCircular<Integer>();//post: regresa una lista circular
            case 2:
                if (entry==1)
                    return (AbstractList<T>) new Lista<String>();//post: regresa una lista enlazada
                if (entry==2)
                    return (AbstractList<T>) new ListaDoble<String>();//post: regresa una lista doblemente
                if (entry==3)
                  return (AbstractList<T>) new ListaCircular<String>();//post: regresa una lista circular
            case 3:
                if (entry==1)
                    return (AbstractList<T>) new Lista<Double>();//post: regresa una lista enlazada
                if (entry==2)
                    return (AbstractList<T>) new ListaDoble<Double>();//post: regresa una lista doblemente
                else
                    return (AbstractList<T>) new ListaCircular<Double>();//post: regresa una lista circular
                
            default: 
                System.out.println("Ha escogido una opción incorrecta");
                return null;
                    }
    }
}
