/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_ordini.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class salvataggioFile extends OrdineInNegozio {

    private static final Logger LOGGER = Logger.getLogger(salvataggioFile.class.getName());

    public void aggiungi(OrdineInNegozio ordine) {
        FileWriter w;

        try {
            w = new FileWriter("C:/Users/david/OneDrive/Desktop/esercizio.txt");

            BufferedWriter b;
            b = new BufferedWriter(w);

            b.write("INFO: " + ordine.getId() + " | "
                    + ordine.mostraDettagli() + " | "
            );

            b.newLine();

            b.flush();
            b.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void leggereFile() {
        String path = ("C:/Users/david/OneDrive/Desktop/esercizio.txt");

        BufferedReader reader;

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);

            reader = new BufferedReader(fr);

            String line = reader.readLine();

            while (line != null) {
                LOGGER.info(line);
                line = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
