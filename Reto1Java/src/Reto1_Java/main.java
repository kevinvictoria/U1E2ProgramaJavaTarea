
package Reto1_Java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    
    public static void main(String args []){
        
 /*-------------------Instancias---------------------------*/
         leerArchivo leer = new leerArchivo();
         OrdenaVector or = new OrdenaVector();
         MostrarTXT mt = new MostrarTXT();
         
 /*-------------------Variables---------------------------*/
         String [] mostrar,frase,a;
         String fr,texto;
 
  /*-------------------Obtenemos contenido del archivo TXT---------------------------*/       
        texto = leer.leertxt("demo.txt");
        a = texto.split(" ");
        mt.mostrar(a);
        
 /*-------------------Recibe frase---------------------------*/
        fr = JOptionPane.showInputDialog("Escribe Frase Correcta: ");
        frase = fr.split(" ");
        
 /*-------------------Usando Metodo Ordenar---------------------------*/
        mostrar = or.Ordenar(frase, a);
        
 /*-------------------Mostrando datos final---------------------------*/     
        System.out.println("\n\nFrase ordenada: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(mostrar[i]+" ");
        }  
    }
}
