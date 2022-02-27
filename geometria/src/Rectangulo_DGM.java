//Versión inicial
/**
 * 
 * @author Daniel García Martínez
 * @version 1.2
 */
public class Rectangulo_DGM extends FiguraGeometrica_DGM {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_DGM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 * Método que devuelve el area
	 * @return area
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Método que devuelve el perimetro
	 * @return perimetro
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
