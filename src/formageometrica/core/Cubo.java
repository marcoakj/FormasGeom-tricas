package formageometrica.core;

import formageometrica.model.FormaGeometrica;
import formageometrica.model.interfaceForma2D;
import formageometrica.model.interfaceForma3D;

public class Cubo extends FormaGeometrica implements interfaceForma3D, interfaceForma2D {
    private double lado;

    public Cubo(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.lado, 3);
    }

    @Override
    public String toString() {
        return "Cubo de lado " + this.lado + " - A: " + this.calcularArea() + " - P: " + this.calcularPerimetro()
                + " - V: " + this.calcularVolume();
    }
}
