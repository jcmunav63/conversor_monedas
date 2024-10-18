package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.modelos.ConsultaApiMonedas;
import com.aluracursos.conversormonedas.modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaApiMonedas consulta = new ConsultaApiMonedas();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create(); // setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)

        System.out.println("===========================================================");
        System.out.println("  Bienvenido(a) a la aplicación 'Conversor de Monedas'");
        System.out.println("===========================================================");
        System.out.println(" ");
        System.out.println("  Ingresa una moneda de base, una moneda objetivo y un");
        System.out.println("  monto a convertir (uno a uno). Las opciones de monedas");
        System.out.println("  permitidas son...");
        System.out.println(" ");
        System.out.println("  USD - United States Dollar  GBP - UK Pound Sterling");
        System.out.println("  CAD - Canadian Dollar       AUD - Australian Dollar");
        System.out.println("  EUR - European Union Euro   CLP - Chilean Peso");
        System.out.println("  BRL - Brazilian Real        COP - Colombian Peso");
        System.out.println("  MXN - Mexican Peso          ARS - Argentine Peso");
        System.out.println("  PEN - Peruvian Sol          VES - Venezuelan Bolivar Soberano");
        System.out.println("  CRC - Costa Rican Colon     ");
        System.out.println("===========================================================");

        System.out.println("Ingresa la clave de la moneda de base (ej: USD) ");
        var monedaBase = lectura.nextLine();

        System.out.println("Ingresa la clave de la moneda objetivo (ej: MXN) ");
        var monedaObjetivo = lectura.nextLine();

        System.out.println("Ingresa el monto a convertir ");
        double montoAConvertir = Double.valueOf(lectura.nextLine());

        try {
            Moneda consultaMonedas = consulta.buscarMonedas(monedaBase, monedaObjetivo, montoAConvertir);
            System.out.println("Conversion de monedas " + monedaBase + " a " + monedaObjetivo +
                    " , monto "+ montoAConvertir);
            System.out.println(consultaMonedas);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        };
    }
}
