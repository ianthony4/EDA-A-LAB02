public class Ejercicio2{
	public int[] rotarIzquierdaArray(int[] A){
		int[] Aiz = new int[A.length];
		//caso prueba
		int d = 2;
		int aux;
		for(int i = 0; i < Aiz.length; i++){
			//Colocamos en nuestro auxiliar el elemento del arreglo
			aux = A[i];
			//Cuando estemos aptos para empezar la rotacion se hara
			if(i - d >= 0){
				Aiz[i-d] = aux;
			}else{
				//En el caso que este apto, se ira colocando los primero elementos
				// adelante
				Aiz[Aiz.length - Math.abs(i-d)] = aux;
			}
		}	
		return Aiz;
	}
}
