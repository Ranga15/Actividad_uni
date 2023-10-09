package Inmueble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de gestión de inmuebles.");
        System.out.print("Ingresa el tipo de inmueble (CasaRural, CasaUrbana, Apartamento, Apartaestudio, LocalComercial, Oficina): ");
        String tipoInmueble = scanner.nextLine();

        switch (tipoInmueble) {
            case "CasaRural":
                crearCasaRural(scanner);
                break;
            case "CasaUrbana":
                crearCasaUrbana(scanner);
                break;
            case "Apartamento":
                crearApartamento(scanner);
                break;
            case "Apartaestudio":
                crearApartaestudio(scanner);
                break;
            case "LocalComercial":
                crearLocalComercial(scanner);
                break;
            case "Oficina":
                crearOficina(scanner);
                break;
            default:
                System.out.println("Tipo de inmueble no válido.");
                break;
        }

        scanner.close();
    }

    private static void crearCasaRural(Scanner scanner) {
        System.out.print("Identificador inmobiliario: ");
        int identificador = Integer.parseInt(scanner.nextLine());
        System.out.print("Área en metros cuadrados: ");
        int areaMetrosCuadrados = Integer.parseInt(scanner.nextLine());
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Número de habitaciones: ");
        int numHabitaciones = Integer.parseInt(scanner.nextLine());
        System.out.print("Número de baños: ");
        int numBanios = Integer.parseInt(scanner.nextLine());
        System.out.print("Número de pisos: ");
        int numPisos = Integer.parseInt(scanner.nextLine());
        System.out.print("Distancia a la cabecera municipal (km): ");
        double distanciaCabeceraMunicipal = Double.parseDouble(scanner.nextLine());
        System.out.print("Altitud sobre el nivel del mar (metros): ");
        double altitudSobreNivelMar = Double.parseDouble(scanner.nextLine());

        
        CasaRural casaRural = new CasaRural(identificador, areaMetrosCuadrados, direccion, numHabitaciones, numBanios, numPisos, distanciaCabeceraMunicipal, altitudSobreNivelMar);

       
        System.out.println("Información de la CasaRural:");
        mostrarInformacionInmueble(casaRural);
    }

    private static void crearCasaUrbana(Scanner scanner) {
        
    }

    private static void crearApartamento(Scanner scanner) {
        
    }

    private static void crearApartaestudio(Scanner scanner) {
        
    }

    private static void crearLocalComercial(Scanner scanner) {
       
    }

    private static void crearOficina(Scanner scanner) {
        
    }

    private static void mostrarInformacionInmueble(Inmueble inmueble) {
        System.out.println("Identificador: " + inmueble.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + inmueble.getAreaMetrosCuadrados());
        System.out.println("Dirección: " + inmueble.getDireccion());
        if (inmueble instanceof InmuebleVivienda) {
            InmuebleVivienda vivienda = (InmuebleVivienda) inmueble;
            System.out.println("Número de habitaciones: " + vivienda.getNumHabitaciones());
            System.out.println("Número de baños: " + vivienda.getNumBanios());
        }
        if (inmueble instanceof Casa) {
            Casa casa = (Casa) inmueble;
            System.out.println("Número de pisos: " + casa.getNumPisos());
        }
        if (inmueble instanceof CasaRural) {
            CasaRural casaRural = (CasaRural) inmueble;
            System.out.println("Distancia a la cabecera municipal: " + casaRural.getDistanciaCabeceraMunicipal() + " km");
            System.out.println("Altitud sobre el nivel del mar: " + casaRural.getAltitudSobreNivelMar() + " metros");
        }
    }
}