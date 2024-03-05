
package pilas;

import java.util.Stack;


public class Pilas {

    
    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacia " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        
        //Agregar
        
         pila.push(1);
         pila.push(2);
         pila.push(3);
         pila.push(4);
         pila.push(5);
          
         
         
         
         //Recorrido 
         for(Integer pilita:pila){
             System.out.println(pilita); 
         } 
        
         
         
         //Mostrar
         System.out.println("pila vacia " + pila);
         System.out.println("esta vacia? " + pila.isEmpty());
         
         
         pila.pop(); //ES PARA ELIMINAR EL ULTIMO REGISTRO QUE ENTRO
         
         System.out.println("Esta el 3? " + pila.search(3)); // ES PARA BUSCAR UN ELEMENTO EN PARTICULAR
         
         System.out.println("Ultimo agregado " +  pila.peek());//Es para ver cual fue el ultimo elemento 
         //agregado sin eliminarlo
         
         
        
    }
    
}
