/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestione_ordini;

import com.mycompany.gestione_ordini.DAO.GestioneOrdini;
import com.mycompany.gestione_ordini.Exception.ImportoNonValidoException;
import com.mycompany.gestione_ordini.Exception.OrdineNonTrovatoException;
import com.mycompany.gestione_ordini.Exception.errorOrder;
import com.mycompany.gestione_ordini.Exception.prezzoError;
import com.mycompany.gestione_ordini.model.Ordine;
import com.mycompany.gestione_ordini.model.OrdineInNegozio;
import com.mycompany.gestione_ordini.model.OrdineOnline;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Gestione_Ordini {

    private static final Logger LOGGER = Logger.getLogger(Gestione_Ordini.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        prezzoError error = new prezzoError();
        errorOrder errore = new errorOrder();
        GestioneOrdini gestione = new GestioneOrdini();

        while (true) {

            OrdineInNegozio ordineNegozio = new OrdineInNegozio();
            OrdineOnline ordineOnline = new OrdineOnline();

            System.out.println("===== SISTEMA GESTIONE ORDINI =====");
            System.out.println("1. Aggiungi ordine");
            System.out.println("2. Visualizza ordini");
            System.out.println("3. Aggiorna ordine");
            System.out.println("4. Elimina ordine");
            System.out.println("5. Esci");

            int scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Opzione 1");
                    System.out.print("Mttwere il tipo di ordine:");
                    String tipoOrdine = sc.nextLine();

                    if (tipoOrdine.equals("Ordine in negozio")) {
                        System.out.print("id ordine: ");
                        ordineNegozio.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Cliente: ");
                        ordineNegozio.setCliente(sc.nextLine());

                        System.out.println("Importo: ");
                        ordineNegozio.setImporto(sc.nextDouble());
                        sc.nextLine();

                        System.out.println("Stato ordine: ");
                        if (true) {
                            ordineNegozio.setConsegnato(true);
                            System.out.println("consegnato");
                        } else {
                            System.out.println("Non consegnato");
                        }

                        try {
                            error.errorPrezzo(ordineNegozio.getImporto());
                        } catch (ImportoNonValidoException e) {
                            System.err.println("Errore prezzo");
                            e.printStackTrace();
                            break;
                        }
                        gestione.createOrder(ordineNegozio);

                    } else if (tipoOrdine.equals("Ordine online")) {
                        System.out.print("id ordine: ");
                        ordineOnline.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Cliente: ");
                        ordineOnline.setCliente(sc.nextLine());

                        System.out.println("Importo: ");
                        ordineOnline.setImporto(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Stato ordine: ");
                        if (true) {
                            ordineNegozio.setConsegnato(true);
                            System.out.println("consegnato");
                        } else {
                            System.out.println("Non consegnato");
                        }

                        try {
                            error.errorPrezzo(ordineOnline.getImporto());
                        } catch (ImportoNonValidoException e) {
                            e.printStackTrace();
                        }
                        gestione.createOrder(ordineOnline);

                    }
                    break;
                case 2:
                    System.out.println("Opzione 2");
                    gestione.leggi();
                    break;
                case 3:
                    System.out.println("Opzione 3");

                    System.out.print("Aggiorna per tipo di ordine: ");
                    String aggiornaOrdine = sc.nextLine();

                    if (aggiornaOrdine.equals("Ordine in negozio")) {
                        System.out.print("id ordine: ");
                        ordineNegozio.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Cliente: ");
                        ordineNegozio.setCliente(sc.nextLine());

                        System.out.println("Importo: ");
                        ordineNegozio.setImporto(sc.nextDouble());
                        sc.nextLine();

                        System.out.println("Stato ordine: ");
                        if (true) {
                            ordineNegozio.setConsegnato(true);
                            System.out.println("consegnato");
                        } else {
                            System.out.println("Non consegnato");
                        }

                        try {
                            error.errorPrezzo(ordineNegozio.getImporto());
                        } catch (ImportoNonValidoException e) {
                            e.printStackTrace();
                        }

                        try {
                            errore.orderError(ordineNegozio.getId(), ordineNegozio);
                        } catch (OrdineNonTrovatoException e) {
                            e.printStackTrace();
                        }
                        gestione.aggiorna(ordineNegozio.getId(), ordineNegozio);

                    } else if (aggiornaOrdine.equals("Ordine online")) {
                        System.out.print("id ordine: ");
                        ordineOnline.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Cliente: ");
                        ordineOnline.setCliente(sc.nextLine());

                        System.out.println("Importo: ");
                        ordineOnline.setImporto(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Stato ordine: ");
                        if (true) {
                            ordineNegozio.setConsegnato(true);
                            System.out.println("consegnato");
                        } else {
                            System.out.println("Non consegnato");
                        }

                        try {
                            error.errorPrezzo(ordineOnline.getImporto());
                        } catch (ImportoNonValidoException e) {
                            e.printStackTrace();
                        }

                        try {
                            errore.orderError(ordineOnline.getId(), ordineOnline);
                        } catch (OrdineNonTrovatoException e) {
                            e.printStackTrace();
                        }

                        gestione.aggiorna(ordineOnline.getId(), ordineOnline);
                    }
                    break;
                case 4:
                    System.out.println("Opzione 4");

                    System.out.print("Ordine da eliminare: ");
                    String tipoOrdineEliminazione = sc.nextLine();

                    if (tipoOrdineEliminazione.equals("Ordine in negozio")) {
                        int elimaOrdine = sc.nextInt();
                        sc.nextLine();

                        gestione.elimina(elimaOrdine);

                    } else {
                        try {
                            errore.orderError(ordineNegozio.getId(), ordineNegozio);
                        } catch (OrdineNonTrovatoException e) {
                            e.printStackTrace();
                        }
                    }

                    if (tipoOrdineEliminazione.equals("Ordine online")) {
                        int elimaOrdine = sc.nextInt();
                        sc.nextLine();

                        gestione.elimina(elimaOrdine);
                    } else {
                        try {
                            errore.orderError(ordineOnline.getId(), ordineOnline);
                        } catch (OrdineNonTrovatoException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Opzione 5");
                    String uscita = sc.nextLine();

                    if (uscita.equals("esc")) {
                        LOGGER.info("Uscita in corso");
                        sc.close();
                        break;
                    }
                default:
                    throw new AssertionError();
            }

        }
    }

}
