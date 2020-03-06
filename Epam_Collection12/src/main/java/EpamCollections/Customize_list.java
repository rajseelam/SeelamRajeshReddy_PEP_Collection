package EpamCollections;
import java.util.*;
import java.io.*;
public class Customize_list<A> {
	private int size =0;
	private static final int Defaultsize=10;
	private Object ListElements[];
	public Customize_list()
	{
		
		ListElements=new Object[Defaultsize];
		for(int i=0;i<10;i++)
		{
			
			ListElements[size++]=i+1;
			
		}
	}
	public void addingElementsintoList(A I) {
		
        if (size == ListElements.length) {
        	
            ensureCapacity();
            
        }
        ListElements[size++] = I;
    }
    public A  fetch(int FetchElement) {
    	
        if (FetchElement >= size || FetchElement< 0) {
        	
            throw new IndexOutOfBoundsException("Index: " + FetchElement + ", Size " + FetchElement);
        }
        
        return (A) ListElements[FetchElement];
    }
    public A remove(int removeElement) {
    	
        if (removeElement >= size || removeElement < 0) {
        	
            throw new IndexOutOfBoundsException("Index: " + removeElement + ", Size " + removeElement);
            
        }
        Object items = ListElements[removeElement];
        
        int newSize1 = ListElements.length - ( removeElement + 1 ) ;
        
        System.arraycopy( ListElements, removeElement + 1,ListElements, removeElement, newSize1 ) ;
        
        size--;
        
        return (A) items;
        
    }
    
    public int size() {
    	
        return size;
        
    }
    public String toString() 
    {
    	
         StringBuilder sb = new StringBuilder();
         
         for(int i = 0; i < size ;i++) {
        	 
             sb.append(ListElements[i].toString());
             
             if(i<size-1){
            	 
                 sb.append(" ");
                 
             }
             
         }
         
         return sb.toString();
         
    }
     
    private void ensureCapacity() {
    	
        int newlength = ListElements.length * 2;
        
        ListElements = Arrays.copyOf(ListElements, newlength);
        
    }


}
	





