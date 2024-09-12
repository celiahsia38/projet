package Model;

import Model.Enum.CaseType;

public class Grille {
	
	private Case[][] cases;
	
	/**
	 * set toutes les cases en tant que plaine par défaut
	 * @param data
	 */
	public Grille(String data) {
		String[] splittedData = data.split(" - ");
		cases = new Case[Integer.parseInt(splittedData[0])][Integer.parseInt(splittedData[1])];
		
		for(int x = 0; x < Integer.parseInt(splittedData[0]) + 1; ++x) {
			for(int y = 0; y < Integer.parseInt(splittedData[1]) + 1; ++y) {
				
				Case caseGrille = new Case(CaseType.PLAINE );
				cases[x][y] = caseGrille;
				
			}
		}
		
	}
	
	public Case[][] getCases() {
		return cases;
	}
	
	public void setCases(Case[][] newCases) {
		cases = newCases;
	}
	
}
