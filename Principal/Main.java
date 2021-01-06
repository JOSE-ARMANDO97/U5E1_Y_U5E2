package Main;

import Ordenamiento.Ordenamiento;
import java.util.Scanner;


public class Main  {
     public static void main(String[] args) {
       Ordenamiento obj= new Ordenamiento ();
       Scanner leer=new Scanner (System.in);
     boolean continuar = true;
              Object Procesos;
       int  menu=0; 
              
    
        while(continuar){
    
        System.out.println("\n BIENVENIDOS A LOS METODOS DE ORDENAMIENTO \n"
                   + "1: INSERTAR NUMEROS A LA LISTA \n"
                   + "2: ORDENAMIENTO CON METODO BURBUJA "+"\n"
                   + "3: ORDENAMIENTO CON EL METODO QUICKSORT"+"\n"
                   + "4: SALIR DEL PROGRAMA.. ");
        menu=leer.nextInt();
        
          switch(menu){
            case 1:  
                  System.out.println(obj.insertar());
                break;
            case 2: 
                System.out.println(" ***********LISTA ORDENADA CON EL METODO BORBUJA ****************");
                System.out.println(obj.todoBurbuja());
               break;
            case 3:
                System.out.println("************ LISTA ORDENADA CON EL METODO QUICKSORT *************");
                int izq=0; int der=obj.lista.size()-1;
                System.out.println(obj.quicksort(izq,der));
                break;
           
            case 4:
               System.out.println("fuera");
                    continuar =false;
                break;
                 default:
                 System.out.println("fuera de rango");
                 break;
           
          }
     }
  }
     
     
}
