package Inmueble;

public class LocalComercial extends Local {
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

     public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
}