package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProduitSansPrixVente extends RuntimeException {

    public ProduitSansPrixVente(String s) {
        super(s);
    }
}
