package formageometrica.core;

import formageometrica.model.FormaGeometrica;
import formageometrica.model.interfaceForma2D;

public class Circulo extends FormaGeometrica implements interfaceForma2D {
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.raio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "Circulo de raio " + this.raio + " A: " + this.calcularArea() + " - P: " + this.calcularPerimetro();
    }
}
