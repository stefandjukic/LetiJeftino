package com.amadeus.Leti.Jeftino;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;
import com.amadeus.resources.FlightOffer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;

public class AmadeusExample {
    public static void main(String[] args) throws ResponseException {
        Amadeus amadeus = Amadeus
                .builder("KY8i6iLvTGDdJXlCab4zbn61kYpPOseX", "4f5kbaYOXPQm426M")
                .build();
        FlightOffer[] flightOffers = amadeus.shopping.flightOffers.get(Params
                .with("origin", "NYC")
                .and("destination", "MAD")
                .and("departureDate", "2019-08-06"));



        System.out.println("Prije");
        System.out.println(flightOffers[0].getResponse().getData());
        System.out.println("Poslije");
    }
}