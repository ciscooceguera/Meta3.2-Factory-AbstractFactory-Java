package personajes;

import java.util.Random;

public class Mago extends PersonajeBase {
    private int mana;
    private int dañoMagico;

    public Mago(String nombre) {
        super(nombre);
        this.mana = generarValor(50, 100);
        this.dañoMagico = 20;
    }

    private int generarValor(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public int getMana() {
        return mana;
    }

    public int getDañoMagico() {
        return dañoMagico;
    }

    @Override
    public String getClasePersonaje() {
        return "Mago";
    }

    @Override
    public int getAtributoPrincipal() {
        return dañoMagico;
    }

    @Override
    public String getNombreAtributoPrincipal() {
        return "Daño mágico";
    }

    @Override
    public void aplicarBonus(String tematica) {
        if (tematica.equalsIgnoreCase("Demoníaco")) {
            dañoMagico += 25;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el Mago - Nivel " + nivel + " | Vida: " + vida + " | Maná: " + mana + " | Daño mágico: " + dañoMagico);
    }
}