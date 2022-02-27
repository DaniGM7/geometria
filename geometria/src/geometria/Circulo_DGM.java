package geometria;

public class Circulo_DGM extends FiguraGeometrica_DGM {
	private double radio;
	
	static final double PI = 3.1416;
	
	public Circulo_DGM(double r, String tipoFigura) {
		super(tipoFigura);
		radio=r;
		 if (radio<0) {
            radio = r*-1;
        }
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
