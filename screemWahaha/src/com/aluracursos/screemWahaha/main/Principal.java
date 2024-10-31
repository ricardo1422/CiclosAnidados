import com.aluracursos.screemWahaha.calculos.CalculaTiempo;
import com.aluracursos.screemWahaha.calculos.ClasificacionFiltros;
import com.aluracursos.screemWahaha.models.Episodios;
import com.aluracursos.screemWahaha.models.Peliculas;
import com.aluracursos.screemWahaha.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Peliculas miPeleicula= new Peliculas("Wahaha", 2000);
        var pelicula3= new Peliculas("Wahaha 3 Más Wahaha que nunca", 2004);
        var pelicula2= new Peliculas("Wahaha 2 la venganza", 2006);
        Serie miSerie= new Serie("Wahaha serie", 1995);
        CalculaTiempo calcula= new CalculaTiempo();
        ClasificacionFiltros clasfil= new ClasificacionFiltros();
        Episodios episodio= new Episodios();

        miPeleicula.setDuracionEnMinutos(120);
        miPeleicula.evalua(2.5);
        miPeleicula.evalua(6.7);
        miPeleicula.evalua(5.2);
        System.out.println(miPeleicula.calculaMedia());
        System.out.println(miPeleicula.getTotalDeEvaluaciones());

        miSerie.setTemporadas(2);
        miSerie.setEpisodiosPorTemporada(12);
        miSerie.setMinutosPorEpisodio(25);
        System.out.println((miPeleicula.toString()));
        System.out.println(miSerie.toString());
        calcula.incluye(miPeleicula);
        calcula.incluye(miSerie);
        System.out.println(calcula.getTiempoTotal());
        clasfil.filtra(miPeleicula);
        clasfil.filtra(episodio);



        ArrayList<Peliculas> listaPeliculas= new ArrayList<>();
        listaPeliculas.add(miPeleicula);
        listaPeliculas.add(pelicula2);
        listaPeliculas.add(pelicula3);
        System.out.println(listaPeliculas.size());
        System.out.println(listaPeliculas);



    }
}
