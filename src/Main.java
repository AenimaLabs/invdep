import clases.Figura;
import clases.Geometria;

public class Main {

	public static void main(String[] args) {
	
	     Figura figura = new Figura(); // Crear una instancia de la clase Figura
	     Geometria geometria = new Geometria(figura); // Crear una instancia de Geometria pasando la figura
	     double area = geometria.calcularArea(); // Calcular el área utilizando Geometria
	     System.out.println("El área es: " + area);

	}

}
