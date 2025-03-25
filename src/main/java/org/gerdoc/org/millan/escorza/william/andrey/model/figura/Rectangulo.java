package org.gerdoc.org.millan.escorza.william.andrey.model.figura;

import org.gerdoc.model.figura.Figura;
import org.gerdoc.org.millan.escorza.william.andrey.util.ReadUtil;
import org.gerdoc.vista.Menu;
import org.gerdoc.vista.SolicitaDatos;

public class Rectangulo extends Figura implements SolicitaDatos {
    private int base; // Atributo para almacenar la base del rectángulo.
    private int altura; // Atributo para almacenar la altura del rectángulo.

    // Constructor que inicializa los atributos de la clase.
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor por defecto. No realiza ninguna acción específica.
    public Rectangulo() {
    }

    @Override
    public double area() {
        // Calcula el área
        return base * altura;
    }

    @Override
    public double perimetro() {
        // Calcula el perímetro
        return 2 * (base + altura);
    }

    @Override
    public void leerDatos() {
        // Solicita al usuario los valores de la base y la altura.
        System.out.println("Dame la base:");
        this.base = ReadUtil.getInstance().leerInt();
        System.out.println("Dame la altura:");
        this.altura = ReadUtil.getInstance().leerInt();
    }
}