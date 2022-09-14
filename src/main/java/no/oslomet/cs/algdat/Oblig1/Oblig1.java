package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.*;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        //Bubble sort for å plassere største verdi bakerst
        int maksVerdi = 0;
        if (a.length > 0) {
            var count = 0;

            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j < i; j++) {
                    if (a[j] > a[i]) {
                        maksVerdi = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = maksVerdi;
                        count++;
                    }
                }
            }

            System.out.printf("Count: %d", count);
        } else {
            throw new NoSuchElementException("Tabellen er tom!");
        }
        return maksVerdi;
    }

        //returnere verdien igjen?

    public static int ombyttinger(int[] a) {
        //Har bare skrevet kode for å finne maksverdi, eller skal man bruke fra forrige deloppgave?
        int maksVerdi = a[0];

        for( int i = 1; i < a.length; i++){
            int verdi = a[i];
            if(verdi > maksVerdi){
                maksVerdi = verdi;
            }
        }

        System.out.println(maksVerdi);

        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        //{3, 3, 4, 5, 5, 6, 7, 7, 7, 8};


        //Finnes det en lettere metode uten ArrayList osv?
        int antallForskjelligeVerdier = 0;

        ArrayList<Integer> forskjelligeVerdier = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            if(!forskjelligeVerdier.contains(a[i])){
                forskjelligeVerdier.add(a[i]); //Legger/fjerner verdier fra arrayet. Ikke bra.
            }
        }
        if(forskjelligeVerdier.size()==1){
            antallForskjelligeVerdier = 0;
        } else {
            antallForskjelligeVerdier = forskjelligeVerdier.size();
        }
        return antallForskjelligeVerdier;

        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int antallForskjelligeVerdier = 0;

        ArrayList<Integer> forskjelligeVerdier = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            if(!forskjelligeVerdier.contains(a[i])){
                forskjelligeVerdier.add(a[i]); //Legger/fjerner verdier fra arrayet. Ikke bra.
            }
        }
        if(forskjelligeVerdier.size()==1){
            antallForskjelligeVerdier = 0;
        } else {
            antallForskjelligeVerdier = forskjelligeVerdier.size();
        }
        return antallForskjelligeVerdier;

        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
