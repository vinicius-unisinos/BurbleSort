package com.vinicius.Listas_Simplesmente_Encadeadas;

import java.util.ArrayList;

public class EmptyListException extends RuntimeException {

   // no-argument constructor
   public EmptyListException() {
      this( "List" );   // call other EmptyListException constructor
   }

   // constructor
   public EmptyListException( String name ) {
      super( name + " is empty" );  // call superclass constructor
   }

} // end class EmptyListException

/*
// objects to store in list
Boolean bool = Boolean.TRUE;
Character character = new Character( '$' );
Integer integer = new Integer( 34567 );
String string = "hello";

// insert references to objects in list
list.insertAtFront( bool );
//list.print();
list.insertAtFront( character );
//list.print();
list.insertAtBack( integer );
//list.print();
list.insertAtBack( string );
//list.print();

// remove objects from list; print after each removal
try { 
   Object removedObject = list.removeFromFront();
   System.out.println( removedObject.toString() + " removed" );
   list.print();

   removedObject = list.removeFromFront();
   System.out.println( removedObject.toString() + " removed" );
   list.print();

   removedObject = list.removeFromBack();
   System.out.println( removedObject.toString() + " removed" );
   list.print();

   removedObject = list.removeFromBack();
   System.out.println( removedObject.toString() + " removed" );
   
   list.print();


} // end try block 


// catch exception if remove is attempted on an empty List 
catch ( EmptyListException emptyListException ) {
   emptyListException.printStackTrace();
}
Node current = firstNode;		
	
        java.util.List<Integer> figuras = new ArrayList<>();
        
        
        while(current != null) {
        	figuras.add((Integer) current.getData());
        	current = current.getNext();
        }
        
        System.out.println(figuras.get(0));
        
        
        for (int j = figuras.size(); j > 0 ; j--) {
			for (int i = 0; i < figuras.size(); i++) {
				if(figuras.get(i) > figuras.get((i + 1))) {
					int aux = figuras.get(i);
					figuras.set(i,figuras.get((i+1)));
					figuras.set(i+1, aux);
				}
			}
		}


}*/