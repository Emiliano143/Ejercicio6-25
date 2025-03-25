package org.gerdoc.org.mendez.galindo.emiliano.model.figura;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Menu;


public class Pentagono extends Figura
{
    private double apotema, lado;

    public Pentagono(){

    }

    public Pentagono(double apotema, double lado) {
        this.apotema = apotema;
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*5*apotema/2;
    }

    @Override
    public double perimetro() {
        return lado*5;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();

        Menu.menuApotema();
        apotema = ReadUtil.getInstance().leerInt();
    }
}
