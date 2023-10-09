package Inmueble;

public class Oficina extends Local {
    private boolean esDelGobierno;

    public Oficina(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion, boolean esDelGobierno) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        this.esDelGobierno = esDelGobierno;
    }

       public boolean isEsDelGobierno() {
        return esDelGobierno;
    }

    public void setEsDelGobierno(boolean esDelGobierno) {
        this.esDelGobierno = esDelGobierno;
    }

}