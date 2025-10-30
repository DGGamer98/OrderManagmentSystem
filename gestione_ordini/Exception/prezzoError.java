/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.Exception;

import com.mycompany.gestione_ordini.model.Ordine;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class prezzoError {
    
    private Ordine ordine;
        private static final Logger LOGGER = Logger.getLogger(prezzoError.class.getName());

    
    public void errorPrezzo(double prezzo) throws ImportoNonValidoException {
        if((prezzo < 0) || (prezzo == 0)) {
            LOGGER.warning("ERRORE");
            throw new ImportoNonValidoException(prezzo);
        }
    }
}
