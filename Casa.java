package Inmueble;

public class Casa extends InmuebleVivienda {
    private int numPisos;

    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanios, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanios);
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
}