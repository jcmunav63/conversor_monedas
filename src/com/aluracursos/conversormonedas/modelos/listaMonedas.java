package com.aluracursos.conversormonedas.modelos;

import java.util.HashMap;
import java.util.Map;

public class listaMonedas {
    private static final Map<String, String> mapDeMonedas = new HashMap<>();

    static {
        mapDeMonedas.put("USD", "United States Dollar");
        mapDeMonedas.put("GBP", "UK Pound Sterling");
        mapDeMonedas.put("CAD", "Canadian Dollar");
        mapDeMonedas.put("AUD", "Australian Dollar");
        mapDeMonedas.put("EUR", "European Union Euro");
        mapDeMonedas.put("JPY", "Japanese Yen");
        mapDeMonedas.put("BRL", "Brazilian Real");
        mapDeMonedas.put("COP", "Colombian Peso");
        mapDeMonedas.put("MXN", "Mexican Peso");
        mapDeMonedas.put("ARS", "Argentine Peso");
        mapDeMonedas.put("PEN", "Peruvian Sol");
        mapDeMonedas.put("VES", "Venezuelan Bolivar Soberano");
        mapDeMonedas.put("CRC", "Costa Rican Colon");
        mapDeMonedas.put("CLP", "Chilean Peso");
    }

    public static Map<String, String> obtenerLista() {
        return mapDeMonedas;
    }
}
