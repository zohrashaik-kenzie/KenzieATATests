package com.kenzie.examples.week9.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        var client = HttpClient.newHttpClient();

        // create a request
        var request = HttpRequest.newBuilder(
                URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY")
        ).build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.toString());
    }

}