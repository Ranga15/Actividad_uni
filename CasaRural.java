package Inmueble;

public class CasaRural extends Casa {
    private double distanciaCabeceraMunicipal;
    private double altitudSobreNivelMar;

    public CasaRural(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanios, int numPisos, double distanciaCabeceraMunicipal, double altitudSobreNivelMar) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanios, numPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }

    public double getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(double distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public double getAltitudSobreNivelMar() {
        return altitudSobreNivelMar;
    }

    public void setAltitudSobreNivelMar(double altitudSobreNivelMar) {
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }
}