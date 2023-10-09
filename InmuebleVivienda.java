package Inmueble;

public class InmuebleVivienda extends Inmueble {
    private int numHabitaciones;
    private int numBanios;

    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanios) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanios = numBanios;
    }

     public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }
}