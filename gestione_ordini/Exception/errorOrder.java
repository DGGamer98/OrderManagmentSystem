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
public class errorOrder {
    
    private Ordine ordine;
    
    private static final Logger LOGGER = Logger.getLogger(errorOrder.class.getName());
    
    public void orderError(int id, Ordine order) throws OrdineNonTrovatoException {
        if (id != order.getId()) {
            LOGGER.info("Ordine non trovato");
            throw new OrdineNonTrovatoException(id);
        }
    }
}
