package formageometrica.core;

    import formageometrica.model.FormaGeometrica;
    import formageometrica.model.interfaceForma2D;

public class Quadrado extends FormaGeometrica implements interfaceForma2D {
    private double lado;

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public String toString() {
        return "Quadrado de lado " + this.lado + "A: " + this.calcularArea()+" - P: "+this.calcularPerimetro();
    }
}
