package postfixt;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class FactoryNodos<T> {

    public BaseNodo<T> getNodo(String entry, T valor, NodoDoble<T> Cola){
        switch (entry) {
            case "1":
                return new Nodo<>(valor);//post: regresa un nodo simple
            case "2":
                return new NodoDoble<>(valor, null, Cola);//post: regresa un nodo doble
            default:
                return new NodoCircular<>(valor);//post: regresa un nodo circula
        }
    }
}
