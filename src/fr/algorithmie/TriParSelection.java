package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		// Implémenter la méthode tri par sélection
		int minIndex = 0; 
				
		for (int i = 0; i <= array2.length - 2; i++) {
			for (int j = i +1; j < array2.length; j++) {
				if(array2[j] < array2[minIndex]) {
					minIndex = j;
				}
				int intermediaire = array2[minIndex];
				array2[minIndex] = array2[i];
				array2[i] = intermediaire;
		
							}
				}
		for (int k = 0; k <= array2.length - 1; k++) {
			System.out.print(array2[k]+" ");
		}

	}

}
