public class Ejercicio2{
	public int[] rotarArrayIzquierda(int[] A){
		int[] arrayIzquierda = new int[A.length];
		//caso prueba
		int d = 2;
		int aux;
		for(int i = 0; i < arrayIzquierda; i++){
			//Colocamos en nuestro auxiliar el elemento del arreglo
			aux = A[i];
			//Cuando estemos aptos para empezar la rotacion se hara
			if(i - d >= 0){
				arrayIzquierda[i-d] = aux;
			}else{
				//En el caso que este apto, se ira colocando los primero elementos
				// adelante
				arrayIzquierda[arrayIzquierda.length - Math.abs(i-d)] = aux;
			}
		}	
	}
}
