package View;

import java.util.Scanner;

import Controller.PlateauController;

public class Main {
	
	public static void main(String[] args) {
		// récupérer le fichier d'entrée
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuilez entrer le chemin vers le fichier de la map (ex : )\n");
		String fileName = scanner.nextLine();
		scanner.close();
		
		// initialiser le plateau
		PlateauController plateauController = new PlateauController(fileName);
		// calcul du résultat final
		String output = plateauController.jouer();
		
		// affichage du résultat
		System.out.println(output);
	}

}
