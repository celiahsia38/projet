package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Aventurier;
import Model.Case;
import Model.Grille;
import Model.Enum.CaseType;

public class PlateauController {
	
	private Grille grille;
	private List<Aventurier> aventuriers;
	
	/**
	 * Initialiser le jeu avec la fiche d'entrée
	 * @param fileName
	 */
	public PlateauController (String fileName) {
		aventuriers = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File(fileName));
			 
			
			while(sc.hasNextLine()){
			    String data = sc.nextLine();
			    String[] splittedData = data.split(" - ");
			    
			    
			    // initialisation
			    switch (splittedData[0]) {
				case "C":
					grille = new Grille(data.substring(5));
					break;
				case "M":
					grille.getCases()[Integer.parseInt(splittedData[0])][Integer.parseInt(splittedData[1])].setType(CaseType.MONTAGNE);
					break;
				case "T":
					grille.getCases()[Integer.parseInt(splittedData[0])][Integer.parseInt(splittedData[1])].setType(CaseType.TRESOR);
					grille.getCases()[Integer.parseInt(splittedData[0])][Integer.parseInt(splittedData[1])].setNombre(Integer.parseInt(splittedData[1]));
					break;
				case "A":
					Aventurier a = new Aventurier(data.substring(5));
					aventuriers.add(a);
					break;
				}
			    
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String jouer() {
		
		return "";
	}
	
}
