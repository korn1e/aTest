package org.ajigile.aTest;


public class App  {
    public static void main( String[] args ) {
    	
    	
       MyLinkedList<Integer> list = new MyLinkedList<Integer>();
       
       list.add(7);
       list.add(5);
       list.add(1);
       list.add(6);
       list.add(2);
       list.add(7);
       list.add(3);
       list.add(8);
       list.add(4);
       list.add(9);
       list.add(1);
       
       for(int i=0;i<list.getSize();i++){
			System.out.println(list.get(i));
       } System.out.println();
       
       list.removeTailElement();
       
       for(int i=0;i<list.getSize();i++){
			System.out.println(list.get(i));
      } System.out.println();
       
      
       list.removeIfBiggerThan(5);
       for(int i=0;i<list.getSize();i++){
    	   System.out.println(list.get(i));
       } System.out.println();
	
        
    }
}
