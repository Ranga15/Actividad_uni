package Inmueble;

public class CasaUrbana extends Casa {
    private boolean conjuntoCerrado;
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public CasaUrbana(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanios, int numPisos, boolean conjuntoCerrado, double valorAdministracion, boolean tieneAreasComunes) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanios, numPisos);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    public boolean isConjuntoCerrado() {
        return conjuntoCerrado;
    }

    public void setConjuntoCerrado(boolean conjuntoCerrado) {
        this.conjuntoCerrado = conjuntoCerrado;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isTieneAreasComunes() {
        return tieneAreasComunes;
    }

    public void setTieneAreasComunes(boolean tieneAreasComunes) {
        this.tieneAreasComunes = tieneAreasComunes;
    }
}