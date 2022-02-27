package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import geometria.Circulo_DGM;
import org.junit.jupiter.api.Test;

class testCirculo {

	@Test
	void testArea() {
		Circulo_DGM miCirculo = new Circulo_DGM(7, "circulo");
		assertEquals(153.9384,miCirculo.area(),0.001);
		assertEquals(43.9824,miCirculo.perimetro(),0.001);
	}
	
	@Test
	void testArea1() {
		Circulo_DGM miCirculo = new Circulo_DGM(0, "circulo");
		assertEquals(0,miCirculo.area(),0.001);
		assertEquals(0,miCirculo.perimetro(),0.001);
	}
	
	@Test
	void testArea2() {
		Circulo_DGM miCirculo = new Circulo_DGM(-3, "circulo");
		assertEquals(28.2744,miCirculo.area(),0.001);
		assertEquals(18.8496,miCirculo.perimetro(),0.001);
	}


}