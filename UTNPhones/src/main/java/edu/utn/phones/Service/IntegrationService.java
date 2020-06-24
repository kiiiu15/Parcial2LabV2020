package edu.utn.phones.Service;

import edu.utn.phones.Exceptions.noContentException;
import edu.utn.phones.Service.IntegrationAPIElement.IntegrationElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    private  final IntegrationElement integrationElement;

    @Autowired
    public IntegrationService(IntegrationElement integrationElement) {
        this.integrationElement = integrationElement;
    }


    public ResponseEntity callFiltered() throws  noContentException {
        return  this.integrationElement.callFiltered();
    }
}
