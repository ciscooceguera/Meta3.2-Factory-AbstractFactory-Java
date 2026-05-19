package fabricasEquipamiento;

import equipamiento.Arma;
import equipamiento.Armadura;
import equipamiento.EscamasDragon;
import equipamiento.EspadaDemoniaca;

public class FabricaDemoniaca implements FabricaEquipamiento {
    @Override
    public Arma crearArma() {
        return new EspadaDemoniaca();
    }

    @Override
    public Armadura crearArmadura() {
        return new EscamasDragon();
    }

    @Override
    public String getTematica() {
        return "Demoníaco";
    }

    @Override
    public String getBonusDescripcion() {
        return "+25 Daño mágico";
    }
}