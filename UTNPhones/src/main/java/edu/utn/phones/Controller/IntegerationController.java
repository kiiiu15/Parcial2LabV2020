package edu.utn.phones.Controller;


import edu.utn.phones.Exceptions.noContentException;
import edu.utn.phones.Model.Call;
import edu.utn.phones.Service.IntegrationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/integration/call")
@Api(tags = "Filtered Calls")
public class IntegerationController {


    private final IntegrationService integrationService;

    @Autowired
    public IntegerationController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    @GetMapping("/")
    @ApiOperation(value = "The calls whichs prefix is between 50 and 700")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Call retrieved succesfully"),
            @ApiResponse(code = 204, message = "NoContentToShow")
    })
    public ResponseEntity callFiltered() throws noContentException {
        return  this.integrationService.callFiltered();
    }


}
