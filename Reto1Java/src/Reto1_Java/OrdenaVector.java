
package Reto1_Java;

public class OrdenaVector {
    
    public String [] Ordenar(String frase[], String a[]){
     //Algoritmo Burbuja
    for (int i = 0; i < frase.length-1; i++) {
            for (int j = 0; j < frase.length-1; j++) {
                if ((a[j].equalsIgnoreCase(frase[j]))!= true){
                    String aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    return a;
    }
    
   
 
}