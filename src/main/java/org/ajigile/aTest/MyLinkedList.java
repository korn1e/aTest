package org.ajigile.aTest;

public class MyLinkedList<E> {

	private E arr[];
	
	static {
		System.out.println("static");
		
	}
	
	public MyLinkedList(){
		System.out.println("init");
	}
	
	public void add(E e){
		
		if(arr == null){
			arr = (E[])new Object[]{e};
			return;
		}
		
		E[] res = (E[])new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			res[i] = arr[i];
		}
		res[arr.length] = e;
		arr = res;
	}
	
	public E get(int i){
		return arr[i]; 
	}
	
	public int getSize(){
		return arr.length;
	}
	
	public void removeTailElement(){
		if(arr == null) return;
		
		E[] res = (E[])new Object[arr.length-1];
		for(int i=0; i<res.length; i++){
			res[i] = arr[i];
		}
		arr = res;
	}
	
	public void removeIfBiggerThan(E e) {
		
		if(e instanceof Comparable<?>){
			
			int sub = 0;
			for(int i=0; i<arr.length; i++){
				if(((Comparable<E>)arr[i]).compareTo(e) > 0){
					sub++;
					arr[i] = null;
				}
			}
			
			int add = 0;
			E[] res = (E[])new Object[arr.length-sub];
			for(int i=0; i<arr.length; i++){
				if(arr[i] != null){
					res[add] = arr[i];
					add++;
				} 
			}
			
			arr = res;
			return;
		} 
		
		throw new RuntimeException("Uncomparable");
		
	}
}
