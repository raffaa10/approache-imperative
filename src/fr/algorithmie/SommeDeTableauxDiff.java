package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array_1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array_2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		// Créer un tableau qui contient la somme des 2 précédents tableaux
		int[] array_3;
		
		
		if (array_1.length - array_2.length >= 0)
			for (int i = 0; i <= array_2.length - 1; i++) {
				array_3 = new int[array_2.length];
				array_3[i] = array_1[i] + array_2[i];
				System.out.println(array_3[i]);
				}
		else 
			for (int i = 0; i <= array_1.length - 1; i++) {
				array_3 = new int[array_1.length];
				array_3[i] = array_1[i] + array_2[i];
				System.out.println(array_3[i]);
			}
		
	}

}
