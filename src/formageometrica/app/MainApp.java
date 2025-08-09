package formageometrica.app;

import formageometrica.model.FormaGeometrica;
import formageometrica.core.Quadrado;
import formageometrica.model.interfaceForma2D;
import formageometrica.model.interfaceForma3D;
import formageometrica.core.Cubo;
import formageometrica.core.Circulo;
import formageometrica.core.Paralelepipedo;

public class MainApp {
    public static void main(String[] args) {
        FormaGeometrica formas[] = new FormaGeometrica[4];
        formas[0] = new Quadrado(3);
        formas[1] = new Circulo(2);
        formas[2] = new Paralelepipedo(3, 2, 5 );
        formas[3] = new Cubo(4);

        for (FormaGeometrica forma : formas) {
            System.out.println(forma.toString());
            if (forma instanceof interfaceForma2D) {
                interfaceForma2D forma2D = (interfaceForma2D) forma;
                System.out.println("Area: " + forma2D.calcularArea());
                System.out.println("Perimetro: " + forma2D.calcularPerimetro());
            }
            if (forma instanceof interfaceForma3D) {
                interfaceForma3D forma3D = (interfaceForma3D) forma;
                System.out.println("Volume: " + forma3D.calcularVolume());
            }
            System.out.println("---------------------");
        }
    }
}
