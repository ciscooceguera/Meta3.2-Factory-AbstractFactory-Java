package fabricas;

import personajes.Arquero;
import personajes.Personaje;

public class FabricaArquero implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Arquero(nombre);
    }
}