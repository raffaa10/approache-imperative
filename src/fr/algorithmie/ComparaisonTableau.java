package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		int[] array_1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array_2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		// Ecrire le code permettant de compter le nombre d��l�ments en commun dans ces 2
		//	tableaux
		if (array_1.length - array_2.length >= 0) {
			System.out.println(array_2.length);
		}
		else 	{
			System.out.println(array_1.length);
		}

	}

}
