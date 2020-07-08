package edu.utn.phones.Service.IntegrationAPIElement;


import edu.utn.phones.Exceptions.BadGateWayException;
import edu.utn.phones.Exceptions.noContentException;
import edu.utn.phones.Model.Call;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IntegrationElement {

    private RestTemplate rest;
    private final String url = "http://localhost:8081/api/call/special";

    @PostConstruct
    private void init() {
        this.rest = new RestTemplateBuilder().build();
    }


    public ResponseEntity callFiltered() throws noContentException {
        ResponseEntity<Call[]> entity = rest.getForEntity(url, Call[].class);
        System.out.println(entity);
        if (entity.getStatusCodeValue() == 204){
             throw new noContentException();
        }
        if (entity.getStatusCodeValue() == 500 ){
            throw new BadGateWayException();
        }
        return entity;
    }
}
