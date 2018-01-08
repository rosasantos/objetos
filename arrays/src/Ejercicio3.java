
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array=new int[100];
	 for(int i=0;i<10; i++ ){
	    	array[i]=(int)(Math.random()*(101)); 
	        System.out.println("En la posicion "+i+ " del array vale: "+array[i]);	
	  }
	
	 hallarMediaArray(array);
	}
	
	public static void hallarMediaArray(int[] array){
	    double media=0;
	      for(int i=0;i<3; i++ ){
	      media+=array[i]/3.0;
	     
	    }
	 System.out.println("La media es "+media); 
     } 
	
	
	public static void hallarDesviacionTipica(int[] array, double media){
		 double varianza=0.0;
		  for(int i=0;i<3; i++ ){
			varianza+= (Math.pow(media-array[i], 2))/array.length-1; 
			  
		  }	
		System.out.println();
	}
	      
}
