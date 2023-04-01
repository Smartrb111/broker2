package com.weather.broker.controller;

import lombok.Value;
import org.springframework.web.client.RestTemplate;


public class OpenWetherClient {

    @Value("${loc.url}")
    private String key;

    @Value("${loc.url}")
    private String url;

    public void getUrlWithCoordinates(Double latitude, Double longitude){
        RestTemplate restTemplate = new RestTemplate();

        String coordinates = String.format(url, latitude, longitude);
        String res = restTemplate.getForObject(url, String.class);
    }
}
