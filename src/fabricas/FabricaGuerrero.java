package fabricas;

import personajes.Guerrero;
import personajes.Personaje;

public class FabricaGuerrero implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}