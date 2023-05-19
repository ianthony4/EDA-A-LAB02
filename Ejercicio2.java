public class Ejercicio2{
	public int[] rotarArrayIzquierda(int[] A){
		int[] arrayIzquierda = new int[A.length];
		//caso prueba
		int d = 2;
		int aux;
		for(int i = 0; i < arrayIzquierda; i++){
			//Colocamos en nuestro auxiliar el elemento del arreglo
			aux = A[i];
			if(i - d >= 0){
				arrayIzquierda[i-d] = aux;
			}else{
				arrayIzquierda[arrayIzquierda.length - Math.abs(i-d)] = aux;
		}
	}	
}
