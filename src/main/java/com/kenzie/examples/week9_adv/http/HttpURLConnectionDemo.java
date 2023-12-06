package com.kenzie.examples.week9_adv.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY

public class HttpURLConnectionDemo {

        public static void main(String[] args) throws IOException {

            // Create a neat value object to hold the URL
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");

            // Open a connection(?) on the URL(?) and cast the response(??)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

            // This line makes the request
            InputStream responseStream = connection.getInputStream();

            // Finally we have the response
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    responseStream));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

        }

    }
