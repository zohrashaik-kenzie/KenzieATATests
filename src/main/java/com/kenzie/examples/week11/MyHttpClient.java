package com.kenzie.examples.week11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {
    // Methods to make HTTP Requests here
    public static void main(String[] args){
        // This returns the string response from the request
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("https://api.spoonacular.com/recipes/complexSearch?query=pasta&maxFat=25&number=2");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                System.out.println(httpResponse.body());
            } else {
                System.out.println(httpResponse.body());
                System.out.println("GET request failed: status code received: "+ statusCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}