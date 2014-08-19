package postfixt;

/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz 13203
 */


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Pablo
 */
public class ListaAvanzada {
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado  = new Scanner(System.in);
        
        System.out.println("Elija la lista:");
        System.out.println("1. Lista Enlazada");
        System.out.println("2. Lista Doblemente Enlazada");
        System.out.println("3. Lista Circularmente Enlazada");
        int ingreso = Integer.parseInt(teclado.next());
        
        System.out.println("Elija el tipo de lista");
        System.out.println("1. Integer");
        System.out.println("2. String");
        System.out.println("3. Double");
        int ingreso2 = Integer.parseInt(teclado.next());
        
        FactoryListas _nFactory = new FactoryListas();
        //se implementa el tipo Integer
        //si se quiere cambiar el tipo, basta con cambiar este tipo, las entradas 
        //y el parametro del bubblesort
        AbstractList _lista = _nFactory.getLista(ingreso, ingreso2);
        
        int opcion =0;
        Random aleatorio = new Random();
       
        
        int i = aleatorio.nextInt(10)+1;
        
        while (opcion!=10){
            System.out.print("1. Agregar al final\n");
            System.out.print("2. Mostrar\n");
            System.out.print("3. Agregar en posicion\n");
            System.out.println("4. Agregar al principio");
            System.out.println("5. Remover valor");
            System.out.println("6. Obtener valor en posicion");
            System.out.println("7. Bubble Sort");
            System.out.println("8. Set valor");
            System.out.println("9. Remover ultimo");
            System.out.println("10. salir");
            opcion = teclado.nextInt();
            System.out.println("");
            switch(opcion)
            {
                //se tiene que hacer un if para cada tipo de dato
                //para que funcione la entrada del usuario
                case 1:
                    if (ingreso2==1)
                        _lista.AgregarFinal(teclado.nextInt());
                    if (ingreso2==2)
                        _lista.AgregarFinal(teclado.next());
                    if (ingreso2==3)
                        _lista.AgregarFinal(teclado.nextDouble());
                    break;
                case 2:
                    System.out.print(_lista.toString());
                    System.out.println("");
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Ingrese posicion: ");
                    System.out.print("Ingrese valor: ");
                    int posicion = teclado.nextInt();
                    if (ingreso2==1)
                        _lista.Agregar(teclado.nextInt(), posicion);
                    if (ingreso2==2)
                        _lista.Agregar(teclado.next(),posicion);
                    if (ingreso2==3)
                        _lista.Agregar(teclado.nextDouble(),posicion);                    
                    
                    break;
                case 4:
                    System.out.println("Ingrese el valor: ");
                    if (ingreso2==1)
                        _lista.AgregarPrincipio(teclado.nextInt());
                    if (ingreso2==2)
                        _lista.AgregarPrincipio(teclado.next());
                    if (ingreso2==3)
                        _lista.AgregarPrincipio(teclado.nextDouble());  
                    break;
                case 5:
                    System.out.print("Ingrese valor a remover: ");
                   if (ingreso2==1)
                       _lista.Remover(teclado.nextInt());
                   if (ingreso2==2)
                       _lista.Remover(teclado.next());
                   if (ingreso2==3)
                       _lista.Remover(teclado.nextDouble());
                    break;
                case 6:
                    System.out.print("Ingrese posicion:");
                    int busqueda = teclado.nextInt();
                    System.out.println("Resultado:"+_lista.get(busqueda));
                    break;
                 case 7:
                     //primero se mete la estrucutura en un arreglo tipo Comparable
                    Comparable[] lista = _lista.toArray();
                    //el sort recibe la lista y la ordena
                    Sorting.bubbleSort(lista);
                    //se vuelve a meter de regreso los valores
                    //en la estructura
                    for (int j=0; j<lista.length ; j++){
                        _lista.set(lista[j], j);
                    }            
                     System.out.println("Lista ordenada");
                     break;
                 case 8:
                    
                      System.out.print("Ingrese posicion");
                      int pos = teclado.nextInt();
                      System.out.println("Ingrese valor:");
                      if (ingreso2==1)
                        _lista.set(teclado.nextInt(), pos);
                      if (ingreso2==2)
                          _lista.set(teclado.next(), pos);
                      if (ingreso2==3)
                         _lista.set(teclado.next(),pos);
                 case 9:
                     _lista.RemoverUltimo();
                    
            System.out.println("");
            }//cierra switch
            
        }//cierra while
    
    }
}
