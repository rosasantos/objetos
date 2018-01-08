import java.util.Arrays;


public class Ejercicio3Profe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    final int TAMANO=100;
    int[] arrayEnteros=new int[TAMANO];
    for (int i=0; i<arrayEnteros.length; i++){
    arrayEnteros[i]=(int)(Math.random()*101);	
    System.out.println(Arrays.toString(arrayEnteros));
    }
    
    
    
    
    //AL USAR SORT() NOS ORDENA EL ARRAY Y PERDEMOS EN ORIGINAL SIN ORDENAR

	//Para no perder el array original con sort hacemos:
	int[] arrayOriginal=arrayEnteros.clone();
	
	
	
    System.out.printf("La media es %.2f y la varianza es %.2f",calcularValorMedioArrayEnteros(arrayEnteros), calcularDesviacionTipica( arrayEnteros) );

	System.out.println("Array original es "+arrayEnteros+"  y el ordenado es "+ ordenarArray(arrayEnteros));
    int [] arrayADevolver=devolverMaximoMinimoArray( arrayEnteros);
	int maximo=arrayADevolver[1];
	int minimo=arrayADevolver[0];
	System.out.println("Maximo :"+maximo+ "  minimo: "+minimo);
	
	}
	
	
	public static double calcularValorMedioArrayEnteros(int[] array){
	   int suma=0;	
	   for(int i: array){
		suma+=i;
	   }	
		
		
	return 1.0*suma/array.length;	
	}
	
	
	public static double calcularDesviacionTipica(int[] array){
		
		double suma=0.0;
		for(int i:array){
		suma+=Math.pow((i-calcularValorMedioArrayEnteros(array)), 2);	
			
		}
		
	return Math.sqrt(suma/array.length);	
	}
	
	
	public static int[] ordenarArray(int[] array){
	Arrays.sort(array);	
	return array;	
	}
	
	public static int[] devolverMaximoMinimoArray(int[] array){
	int[] arrayADevolver=new int[2];
	arrayADevolver[0]=array[0];
	arrayADevolver[1]=array[array.length-1];	
		
	return arrayADevolver;	
	}
	
	public static int[] DevolverParesDelArrray(int[] array){
	    int numerosPares=0;
	    for(int i: array){
		   if(i%2==0){
		   numerosPares++;	
		   }
		
	     }
	   
	
	   int [] arrayPares=new  int[numerosPares];
	   int contador=0;
	   for(int i=0; i<array.length; i++){
		   if(i%2!=0){
			 contador++;  
		   }
		  arrayPares [contador]= array[i];
	   }
	
	
	
	
	
		
	return array;	
	}
	
	

}







