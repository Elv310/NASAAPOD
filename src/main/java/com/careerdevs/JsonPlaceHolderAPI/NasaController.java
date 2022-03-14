package com.careerdevs.JsonPlaceHolderAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


public class NasaController {
    @GetMapping("/apod")
    public NasaModel ApodInfo(RestTemplate restTemplate){
        String url = "https://api.nasa.gov/planetary/apod?api_key=aGAleMelUFqQ7OynkbuavzO28e7ElUeV4wfPGMjC";
        NasaModel apod = restTemplate.getForObject(url, NasaModel.class);
        return apod;

    }

}
