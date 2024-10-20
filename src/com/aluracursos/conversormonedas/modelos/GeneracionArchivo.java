package com.aluracursos.conversormonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneracionArchivo {
    public void guardarJson(Moneda moneda, double montoAConvertir) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        LocalDateTime ldt = LocalDateTime.now();
        String strDate = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm"));
        String dir = "C:\\Users\\rcbuc\\intellij-allura\\conversor_monedas\\json_files\\";
        String nombreArchivo = moneda.base_code() + "_a_" + moneda.target_code() + "_" + strDate + ".json";

        JsonObject jsonMoneda = gson.toJsonTree(moneda).getAsJsonObject();
        jsonMoneda.addProperty("monto_a_convertir", montoAConvertir);

        try (FileWriter escritura = new FileWriter(new File(dir, nombreArchivo))) {
            escritura.write(gson.toJson(jsonMoneda));
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            throw e;
        }
    }
}
