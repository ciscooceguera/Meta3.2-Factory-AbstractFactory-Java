package equipamiento;

import personajes.Personaje;

public class CueroMetal implements Armadura {
    private final String nombre;
    private final int defensa;

    public CueroMetal() {
        this.nombre = "Armadura de cuero y metal";
        this.defensa = 30;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void proteger(Personaje portador, int daño) {
        int dañoFinal = Math.max(0, daño - defensa);
        System.out.println(nombre + " reduce el daño de " + daño + " a " + dañoFinal + ".");
    }
}