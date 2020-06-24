package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		
		int[] array_1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array_2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		// Créer un tableau qui contient la somme des 2 précédents tableaux
		
		System.out.println(array_1.length);
		System.out.println(array_2.length);
		
		int[] array_3 = new int[array_1.length];
		for (int i = 0; i <= array_1.length -1; i++) {
			array_3[i] = array_1[i] + array_2[i];
			System.out.println(array_3[i]);
		}
		
	}

}
