import java.util.Arrays;


public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array1=new int[10];
      int[] array2=new int[10];
      
      
      
      //Rellenamos el array1 con un bucle
      
      for(int i=0;i<array1.length; i++ ){
    	array1[i]=3;    
      }
      
      //Rellenamos el array2 con fill
      
      Arrays.fill(array2, 5);
      System.out.println(Arrays.toString(array1));
      System.out.println(Arrays.toString(array2));
      mostrarArrays(array1, array2);
      
	}

	
	public static void mostrarArrays(int[] miarray1, int[] miarray2){
		if(miarray1.length==miarray2.length){
		     for(int i=0;i<miarray2.length; i++ ){
		     System.out.println("En la posicion "+i+"miarray1  es "+miarray1[i]+"y miarray2 es "+miarray2[i]);	   
		      }
		     
		}     
		     
		     
	}
	
	
	
}
