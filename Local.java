package Inmueble;

public class Local extends Inmueble {
    private String localizacion;

    public Local(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.localizacion = localizacion;
    }

     public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}