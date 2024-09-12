package Model;

import Model.Enum.Orientation;

public class Aventurier {
	private int x;
	private int y;
	private int tour = 0;
	private int tresor;
	private Orientation orientation;
	private String enchainementTour;
	private String nom;
	
	public Aventurier(String data) {
		String[] splittedData = data.split(" - ");
		nom = splittedData[0];
		x = Integer.parseInt(splittedData[1]);
		y = Integer.parseInt(splittedData[2]);
		orientation = splittedData[3];
		enchainementTour = splittedData[4];
	}
}
