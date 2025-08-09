package formageometrica.core;

import formageometrica.model.FormaGeometrica;
import formageometrica.model.interfaceForma3D;

public class Paralelepipedo extends FormaGeometrica implements interfaceForma3D {

    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo(double comprimento, double largura, double altura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return this.comprimento * this.largura * this.altura;
    }

    @Override
    public String toString() {
        return "Paralelepípedo de dimensões (a/l/c): " + this.altura + "/" + this.largura + "/" + this.comprimento
               + " - Volume: " + this.calcularVolume();
    }
}
