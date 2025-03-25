package org.gerdoc.org.mendez.galindo.emiliano.vista;


import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.model.figura.*;
import org.gerdoc.org.mendez.galindo.emiliano.model.figura.Pentagono;
import org.gerdoc.org.mendez.galindo.emiliano.model.figura.Rectangulo;
import org.gerdoc.org.mendez.galindo.emiliano.model.figura.Rombo;
import org.gerdoc.org.mendez.galindo.emiliano.model.figura.Trapecio;

import org.gerdoc.org.mendez.galindo.emiliano.model.figura.figura2.Escaleno;
import org.gerdoc.org.mendez.galindo.emiliano.model.figura.figura2.Isosceles;
import org.gerdoc.org.mendez.galindo.emiliano.util.ReadUtil;
import org.gerdoc.vista.Ejecutable;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;

    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if( consola == null )
        {
            consola = new Consola( );
        }
        return consola;
    }

    @Override
    public void run()
    {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while( flag )
        {
            figura = null;
            Menu.principal( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    figura = new Cuadrado( );
                    break;
                case 2:
                    figura = new Equilatero( );
                    break;
                case 3:
                    figura = new Isosceles( );
                    break;
                case 4:
                    figura = new Escaleno( );
                    break;
                case 5:
                    figura = new Pentagono();
                    break;
                case 6:
                    figura = new Rectangulo();
                    break;
                case 7:
                    figura = new Rombo();
                    break;
                case 8:
                    figura = new Trapecio();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            // Si se ha seleccionado una figura válida
            if( figura != null )
            {
                ((org.gerdoc.vista.SolicitaDatos)figura).leerDatos( );
                Menu.print( figura );

                historiales.addFigura(figura);
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}