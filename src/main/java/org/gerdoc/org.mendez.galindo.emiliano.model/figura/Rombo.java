package org.gerdoc.org.mendez.galindo.emiliano.model.figura;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Menu;


public class Rombo extends Figura
{
    private double lado, DMayor, DMenor;

    public Rombo () {

    }

    public Rombo( double lado, double dMayor, double dMenor) {
        this.lado = lado;
        DMayor = dMayor;
        DMenor = dMenor;

    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public double area() {
        return (DMenor * DMayor) / 2;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalMenor() {
        return DMenor;
    }

    public void setDiagonalMenor(double dMenor) {
        DMenor = dMenor;
    }

    public double getDiagonalMayor() {
        return DMayor;
    }

    public void setDiagonalMayor(double dMayor) {
        DMayor = dMayor;
    }

    @Override
    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
        Menu.menuDMayor();
        DMayor = ReadUtil.getInstance().leerInt();
        Menu.menuDMenor();
        DMenor = ReadUtil.getInstance().leerInt();

    }
}
