package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("____________________________________");
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		
		for (int k = array.length - 1; k >= 0; k--) {
			System.out.println(array[k]); 
		}
		
		System.out.println("____________________________________");
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] > 3) 
				System.out.println(array[i]);
			
		}
					
		System.out.println("____________________________________");
		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) // on exclut zero 
				System.out.println(array[i]);
		}
		
		System.out.println("____________________________________");
		// Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
		
		// Sans combinaison avec une boucle et plus rapid
		for (int i = 0; i <= array.length - 1; i += 2) {
			System.out.println(array[i]);
		}
		
		System.out.println("-----");
		
		// Combinaison avec une boucle
		for (int i = 0; i <= array.length - 1; i++) {
			if (i % 2 == 0 )
				System.out.println(array[i]);
		}
		
		
		System.out.println("____________________________________");
		// Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		
		for (int i = 0; i <= array.length - 1; i++) {
			if(array[i] % 2 != 0)
				System.out.println(array[i]);
		}
		
		

	}

}
