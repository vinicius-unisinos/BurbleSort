package com.vinicius.Listas_Simplesmente_Encadeadas;

public class ListTest {

   public static void main( String args[] ) {
      List list = new List();  // create the List container
      
      list.insertAtBack(10);
      list.insertAtBack(9);
      list.insertAtBack(8);
      list.insertAtBack(3);
      list.insertAtBack(6);
      list.insertAtBack(4);
      list.insertAtBack(13);
      list.insertAtBack(2);
      list.insertAtBack(7);
      list.insertAtBack(5);
      list.insertAtBack(1);
      list.insertAtBack(11);
    
      
     list.print();
      list.ordenacaoLista();
      list.print();

   }
} // end class ListTest
