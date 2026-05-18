package fabricas;

import personajes.Personaje;

public interface FabricaPersonajes {
    Personaje crearPersonaje(String nombre);
}