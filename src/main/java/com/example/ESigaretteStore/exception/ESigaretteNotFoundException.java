package com.example.ESigaretteStore.exception;

public class ESigaretteNotFoundException extends RuntimeException{

    public ESigaretteNotFoundException(String message){
        super(message);
    }

    public ESigaretteNotFoundException(String message, Throwable cause){
        super(message,cause);
    }

}
