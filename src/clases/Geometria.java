package clases;

import interfaz.FiguraGeometrica;

public class Geometria {
	
	private FiguraGeometrica figura;

	/**
	 * @param figura
	 */
	public Geometria(Figura figura) {
		this.figura = figura;
	}
	
	  public double calcularArea() {
	        return figura.calcularArea();
	    }
	

}
