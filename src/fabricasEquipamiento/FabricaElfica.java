package fabricasEquipamiento;

import equipamiento.ArcoElfico;
import equipamiento.Arma;
import equipamiento.Armadura;
import equipamiento.TunicaHojas;

public class FabricaElfica implements FabricaEquipamiento {
    @Override
    public Arma crearArma() {
        return new ArcoElfico();
    }

    @Override
    public Armadura crearArmadura() {
        return new TunicaHojas();
    }

    @Override
    public String getTematica() {
        return "Élfico";
    }

    @Override
    public String getBonusDescripcion() {
        return "+20 Puntería";
    }
}