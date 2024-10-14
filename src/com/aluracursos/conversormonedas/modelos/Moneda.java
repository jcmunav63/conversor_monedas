package com.aluracursos.conversormonedas.modelos;

public record Moneda(String monedaBase, String monedaObjetivo, double tasaCambio,
                     double montoConvertido) {
}
