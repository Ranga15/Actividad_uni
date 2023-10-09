package Inmueble;

public class Apartamento extends InmuebleVivienda {
    private double valorAdministracion;

    public Apartamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanios, double valorAdministracion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanios);
        this.valorAdministracion = valorAdministracion;
    }

     public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}