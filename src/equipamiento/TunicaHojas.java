package equipamiento;

import personajes.Personaje;

public class TunicaHojas implements Armadura {
    private final String nombre;
    private final int defensa;

    public TunicaHojas() {
        this.nombre = "Túnica de hojas de árbol";
        this.defensa = 20;
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
        System.out.println(nombre + " suaviza el impacto de " + daño + " a " + dañoFinal + ".");
    }
}