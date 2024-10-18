package com.aluracursos.conversormonedas.modelos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApiMonedas {
    public Moneda buscarMonedas(String base_code, String target_code, double conversion_amount) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/74285ebd87c235e505ee51d2/pair/" +
                base_code + "/" + target_code + "/" + conversion_amount + "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("¡No encontré el par de monedas solicitado!");
        }
    }
}
