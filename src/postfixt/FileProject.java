 /*
 * Universidad del Valle de Guatemala
 * Pablo Díaz
 * Daniel Orozco
 * Diego Jacobs
 * Roberto Chiroy
 * Clase que maneja archivos
 * 
 */

package postfixt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Pablo
 */
public class FileProject {
    
    

    public FileProject() {
       
    }

   
    
    
    public void CrearArchivo(Comparable[] numerosGenerados){
        try {
            
                
                


                File file = new File("src/hojasorts/NumerosAleatorios.txt");

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i=0;i<numerosGenerados.length;i++)
                {
                   bw.write(numerosGenerados[i].toString()+"\n");
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    public String LeerArchivo(){
      
        int contador=0;
        int tamaño=0;
        String string ="";
        BufferedReader br = null;
 
        try {

                String sCurrentLine;
                 File file = new File("datos.txt");
                br = new BufferedReader(new FileReader(file.getAbsoluteFile()));

               
               
               while ((sCurrentLine = br.readLine()) != null) {
                    
                    tamaño++;
                
                }
               br = new BufferedReader(new FileReader(file));
              
                while ((sCurrentLine = br.readLine()) != null) {
                    string = string.concat(sCurrentLine);
                    
                
                }
                
        return string;
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
        return null;
        
    }

    
    public void CrearArchivoOrdenado(Comparable[] numerosGenerados){
        
         try {
            
           


                File file = new File("src/hojasorts/NumerosOrdenados.txt");

                // if FileCreator doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i=0;i<numerosGenerados.length;i++)
                {
                   bw.write(numerosGenerados[i]+"\n");
                }

                bw.close();

                System.out.println("Se ha creado el archivo exitosamente");

        } catch (IOException e) {
                e.printStackTrace();
        }
        
        
        
    }
    

}
