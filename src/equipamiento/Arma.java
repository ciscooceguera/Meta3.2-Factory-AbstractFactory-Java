package equipamiento;

import personajes.Personaje;

public interface Arma {
    int getDaño();

    String getNombre();

    void usar(Personaje portador, Personaje objetivo);
}