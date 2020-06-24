package edu.utn.phones.Controller;



import edu.utn.phones.Exceptions.BadGateWayException;
import edu.utn.phones.Exceptions.noContentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(noContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity handleNoContentException(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @ExceptionHandler(BadGateWayException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ResponseEntity handBadGateWayException(){
        return new ResponseEntity(HttpStatus.BAD_GATEWAY);
    }
}
