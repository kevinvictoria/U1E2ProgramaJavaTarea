
package Reto1_Java;

import java.io.BufferedReader;
import java.io.FileReader;

public class leerArchivo {
    
    public String leertxt(String ruta){
        
        String texto = "";
        
        try{
           BufferedReader bf = new BufferedReader(new FileReader(ruta)); 
           String temp = "";
           String bfRead;
           while((bfRead = bf.readLine())!= null ){
           //Mientras tenga algo diferente de nulo
              temp = temp +  bfRead;
              texto = temp;
           }
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
        return texto;
    }
}
