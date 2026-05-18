package equipamiento;

import personajes.Personaje;

public class EscamasDragon implements Armadura {
    private final String nombre;
    private final int defensa;

    public EscamasDragon() {
        this.nombre = "Armadura de escamas de dragón";
        this.defensa = 40;
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
        System.out.println(nombre + " resiste el ataque de " + daño + " y lo reduce a " + dañoFinal + ".");
    }
}