package org.gerdoc.org.mendez.galindo.emiliano.model.figura;

import org.gerdoc.model.figura.Figura;
import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.org.mendez.galindo.emiliano.vista.Menu;


public class Trapecio extends Figura
{
    private double bmayor, bmenor, altura, lado;

    public Trapecio(){}

    public Trapecio(double bmayor, double lado, double altura, double bmenor) {
        this.bmayor = bmayor;
        this.lado = lado;
        this.altura = altura;
        this.bmenor = bmenor;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado1( );
        lado = ReadUtil.getInstance().leerInt( );
        Menu.menuBMayor( );
        bmayor = ReadUtil.getInstance().leerInt( );
        Menu.menuBMenor( );
        bmenor = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura( );
        altura = ReadUtil.getInstance().leerInt( );
    }

    @Override
    public double perimetro() {
        return bmayor+bmenor+(2*lado);
    }

    @Override
    public double area() {
        return ((bmayor+bmenor)*altura)/2;
    }

    public double getBmayor() {
        return bmayor;
    }

    public void setBmayor(double bmayor) {
        this.bmayor = bmayor;
    }

    public double getLado1() {
        return lado;
    }

    public void setLado1(double lado1) {
        this.lado = lado1;
    }

    public double getBmenor() {
        return bmenor;
    }

    public void setBmenor(double bmenor) {
        this.bmenor = bmenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}