package Ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordenamiento {
public ArrayList <Integer>lista = new ArrayList();
 Scanner leer = new Scanner(System.in);
    int num ;
    String xl;
    public List<Integer>insertar (){
      do{  
        System.out.println("INGRESE NUMEROS  A LA LISTA ");
           lista.add(num=leer.nextInt());
            System.out.println("QUIERES INGRESAR MAS");
           xl=leer.next();
           xl=xl.toUpperCase();
          }while(!xl.equals("NO"));
         
    return lista;
  }
    
    public  ArrayList<Integer> todoBurbuja(){ 
        int aux;
        for(int i=0;i<lista.size()-1;i++){
       
            for( int j=0;j<lista.size()-i-1;j++){
            
               if(lista.get(j)>lista.get(j+1)){
   
                    aux = lista.get(j);
                
                      lista.set(j, lista.get(j+1));
                           
                                lista.set((j+1), aux);     
               }   
            }
         
        }
    return lista;
    }

    public  ArrayList<Integer> quicksort (int izq, int der){
        
    int i=izq;
    int j=der;
    int pivote=lista.get((i+j)/2);
    do {
         while (lista.get(i)<pivote){
             i++;
        }
         while (lista.get(j)>pivote){
            j--;
        }
        if (i<=j){
            int aux=lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, aux);
            i++;
            j--;
        }
    }while(i<=j);
    if (izq<j){
        quicksort( izq, j);
    }
    if (i<der){
        quicksort( i, der);
    }
    return lista;
}
    
 }
    
 
