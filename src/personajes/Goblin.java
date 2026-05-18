package personajes;

public class Goblin extends PersonajeBase {
    private int fuerza;

    public Goblin(String nombre) {
        super(nombre);
        this.fuerza = 8;
        this.vida = 60;
    }

    @Override
    public String getClasePersonaje() {
        return "Goblin";
    }

    @Override
    public int getAtributoPrincipal() {
        return fuerza;
    }

    @Override
    public String getNombreAtributoPrincipal() {
        return "Fuerza";
    }

    @Override
    public void aplicarBonus(String tematica) {
        // El Goblin no recibe bonus de equipamiento.
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el Goblin - Nivel " + nivel + " | Vida: " + vida + " | Fuerza: " + fuerza);
    }
}