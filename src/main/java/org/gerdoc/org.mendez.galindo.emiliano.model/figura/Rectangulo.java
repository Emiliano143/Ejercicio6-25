package org.gerdoc.org.mendez.galindo.emiliano.model.figura;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Menu;


public class Rectangulo extends Figura
{

    private double base,altura;

    public Rectangulo(){

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (2*base)+(2*altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void leerDatos() {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();
    }
}
