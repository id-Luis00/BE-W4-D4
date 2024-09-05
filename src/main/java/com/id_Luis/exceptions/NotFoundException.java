package com.id_Luis.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(Long id){
        super("l'id non è stato trovato " + id);
    }
}
