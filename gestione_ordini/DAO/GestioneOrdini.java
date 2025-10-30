/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.DAO;

import com.mycompany.gestione_ordini.Exception.prezzoError;
import com.mycompany.gestione_ordini.Interface.Gestibile;
import com.mycompany.gestione_ordini.model.Ordine;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class GestioneOrdini implements Gestibile<Ordine> {

    List<Ordine> listaOrdini = new ArrayList<>();

    prezzoError error = new prezzoError();

    private static final Logger LOGGER = Logger.getLogger(GestioneOrdini.class.getName());

    //Metodo per aggiungere un ordine
    @Override
    public void createOrder(Ordine o) {
        for (Ordine ordine : listaOrdini) {
            if (o.getId() == ordine.getId()) {
                LOGGER.info("L'ordine è già presente nel sistema");
            }
        }
        listaOrdini.add(o);
        LOGGER.info("Ordine aggiunto");
    }

    //Visualizazzione storico ordini
    @Override
    public void leggi() {
        for (Ordine ordine : listaOrdini) {
            System.out.println(ordine);
        }
    }

    @Override
    public void aggiorna(int id, Ordine o) {
        for (Ordine ordine : listaOrdini) {
            if (id == o.getId()) {
                o.setId(o.getId());
                o.setCliente(o.getCliente());
                o.setImporto(o.getImporto());
                o.setConsegnato(true);
                LOGGER.info("Utente aggiornato");
            } else {
                LOGGER.warning("Utente non aggiornato");
            }
        }
    }

    @Override
    public void elimina(int id) {
        for (int i = 0; i < listaOrdini.size(); i++) {
            if (listaOrdini.get(i).getId() == id) {
                listaOrdini.remove(i);
                LOGGER.info("Ordine eliminato");
            }
        }
    }

}
