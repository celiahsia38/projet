package Model;

import Model.Enum.CaseType;

public class Case {
	private int x;
	private int y;
	private int nombre;
	private CaseType type; 
	
	public Case(CaseType caseType) {
		setType(caseType);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public CaseType getType() {
		return type;
	}

	public void setType(CaseType type) {
		this.type = type;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
}
