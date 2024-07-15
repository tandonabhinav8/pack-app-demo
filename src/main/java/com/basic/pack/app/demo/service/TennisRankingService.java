package com.basic.pack.app.demo.service;


import com.basic.pack.app.demo.api.response.TennisRankingServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;


@Service
@Slf4j
public class TennisRankingService {
    private static final String url = "https://ultimate-tennis1.p.rapidapi.com/rankings/atp/singles/10/current";
    private static final String xRapidApiKey = "1702779285msh702e81a696d24d2p1032c8jsnc1b9e921a320";
    private static final String xRapidApiHost = "ultimate-tennis1.p.rapidapi.com";

    @Autowired
    private RestTemplate restTemplate;

    public TennisRankingServiceResponse getTennisRankingData() {
        try {

            // Setting the header values here
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-rapidapi-key",xRapidApiKey);
            headers.set("x-rapidapi-host",xRapidApiHost);

            // Making a get call to Rapidapi to get tennis data
            ResponseEntity<TennisRankingServiceResponse> response =restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), TennisRankingServiceResponse.class);
            TennisRankingServiceResponse body = response.getBody();

            log.info("Output from RapidAPI", body);
            return body;




        } catch (Exception e) {
            log.error("Rapid API is giving an error ", e);
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,"Exception while calling RapidAPI endpoint of tennis ranking data",e);

        }

    }
}
