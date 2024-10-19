package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.modelos.ConsultaApiMonedas;
import com.aluracursos.conversormonedas.modelos.Moneda;
import com.aluracursos.conversormonedas.modelos.listaMonedas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaApiMonedas consulta = new ConsultaApiMonedas();

//        List<String> historialDeBusquedas = new ArrayList<>();

        Map<String, String> listaDeMonedas = new TreeMap<>(listaMonedas.obtenerLista());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create(); // setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        boolean bandera = true;

        while (bandera) {
            System.out.println("===========================================================");
            System.out.println("  Bienvenido(a) a la aplicación 'Conversor de Monedas'");
            System.out.println("===========================================================");
            System.out.println(" ");
            System.out.println("  Ingresa una moneda de base, una moneda objetivo y un");
            System.out.println("  monto a convertir (uno a uno). Las 14 monedas que");
            System.out.println("  puedes escoger son...");
            System.out.println(" ");
            System.out.println("  USD - United States Dollar  GBP - UK Pound Sterling");
            System.out.println("  CAD - Canadian Dollar       AUD - Australian Dollar");
            System.out.println("  EUR - European Union Euro   JPY - Japanese Yen");
            System.out.println("  BRL - Brazilian Real        COP - Colombian Peso");
            System.out.println("  MXN - Mexican Peso          ARS - Argentine Peso");
            System.out.println("  PEN - Peruvian Sol          VES - Venezuelan Bolivar Soberano");
            System.out.println("  CRC - Costa Rican Colon     CLP - Chilean Peso");
            System.out.println("===========================================================");

            System.out.println("Ingresa la clave de la moneda de base (ej: USD) ");
            var monedaBase = lectura.nextLine().toUpperCase();

            System.out.println("Ingresa la clave de la moneda objetivo (ej: MXN) ");
            var monedaObjetivo = lectura.nextLine().toUpperCase();

            System.out.println("Ingresa el monto a convertir ");
            double montoAConvertir = Double.parseDouble(lectura.nextLine());

            if (!listaDeMonedas.containsKey(monedaBase)) {
                System.out.println("  Moneda inválida. Ingresa MONEDA BASE de nuevo.");
                System.out.println("  Presiona <Enter> para continuar.");
                var entrar = lectura.nextLine();
                continue;
            }

            if (!listaDeMonedas.containsKey(monedaObjetivo)) {
                System.out.println("  Moneda inválida. Ingresa MONEDA OBJETIVO de nuevo.");
                System.out.println("  Presiona <Enter> para continuar.");
                var entrar = lectura.nextLine();
                continue;
            }

            if (montoAConvertir <= 0) {
                System.out.println("  Monto debe ser positivo. Ingresa MONTO A CONVERTIR de nuevo.");
                System.out.println("  Presiona <Enter> para continuar.");
                var entrar = lectura.nextLine();
                continue;
            }

            try {
                Moneda consultaMonedas = consulta.buscarMonedas(monedaBase, monedaObjetivo, montoAConvertir);
                System.out.println("Conversion de monedas " + monedaBase + " a " + monedaObjetivo +
                        " , monto "+ montoAConvertir);
                System.out.println(consultaMonedas);

//                GeneradorDeArchivos generarArchivo = new GeneradorDeArchivos();
//                generarArchivos.guardarJson(consultaMonedas, consultaMonedas.conversion_result());

                bandera = false;
            } catch(RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
                bandera = false;
            };
        }
    }
}
