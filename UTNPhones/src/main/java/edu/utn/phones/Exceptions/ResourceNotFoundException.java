package edu.utn.phones.Exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResourceNotFoundException extends Throwable {

    public ResourceNotFoundException(String s) {
        super(s);
    }

}
