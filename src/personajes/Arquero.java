package personajes;

import java.util.Random;

public class Arquero extends PersonajeBase {
    private int punteria;

    public Arquero(String nombre) {
        super(nombre);
        this.punteria = generarValor(70, 90);
    }

    private int generarValor(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public int getPunteria() {
        return punteria;
    }

    @Override
    public String getClasePersonaje() {
        return "Arquero";
    }

    @Override
    public int getAtributoPrincipal() {
        return punteria;
    }

    @Override
    public String getNombreAtributoPrincipal() {
        return "Puntería";
    }

    @Override
    public void aplicarBonus(String tematica) {
        if (tematica.equalsIgnoreCase("Élfico")) {
            punteria += 20;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el Arquero - Nivel " + nivel + " | Vida: " + vida + " | Puntería: " + punteria);
    }
}