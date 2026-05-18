package fabricas;

import personajes.Mago;
import personajes.Personaje;

public class FabricaMago implements FabricaPersonajes {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}