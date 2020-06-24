package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		// Effectuez une rotation à droite des éléments.
		// Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
		int[] array = {1, 2, 4, 6, 7, 0, -3, 5};
		
		int dernierElement = array[array.length-1];
		
		for (int i = array.length - 2; i >=0 ; i--) {
				
			array[i+1] = array[i];
								
		}
		
		array[0] = dernierElement;
		
		for(int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
		
	}

}
