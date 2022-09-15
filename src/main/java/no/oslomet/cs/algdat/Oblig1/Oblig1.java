package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length <= 0){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        for(int i = 0, j = 1; j < a.length; i++, j++) {
            if (a[i] > a[j]){
                var maks = a[i];
                a[i] = a[j];
                a[j] = maks;
            }
        }

        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a.length <= 0){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        var count = 0;

        for(int i = 0, j = 1; j < a.length; i++, j++) {
            if (a[i] > a[j]){
                var maks = a[i];
                a[i] = a[j];
                a[j] = maks;
                count++;
            }
        }

        return count;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        for(int i = 1; i < a.length; i++){
            if (a[i] < a[i - 1]){
                throw new IllegalStateException("Ikke sortert!");
            }
        }

        if(a.length == 0){
            return 0;
        }

        var count = 1;
        for(int i = 1; i < a.length; i++){
            if (a[i] != a[i - 1]){
                count++;
            }
        }
        return count;

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0){
            return 0;
        }

        var count2 = 1;
        for (int i = 1; i < a.length; i++){
            var unique = true;
            for (int j = 0; j < i; j++){
                if (a[i] == a[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique){
                count2++;
            }
        }

        return count2;
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
        // kode til oppgaven er hentet fra kompendium  avsnitt 1.3.11
        char[] s1 = s.toCharArray(); // gjør om til et char-array
        char[] t1 = s.toCharArray();

        char[] c = new char[s1.length + t1.length]; // opprettet tabell av riktig størrelse
        int i = 0, j= 0, k = 0; // løkkevariabler

        while(i < s1.length && j < t1.length) {
            c[k++] = s1[i++]; // først en verdi fra s1 inn i det nye arrayet
            c[k++] = t1[j++]; // deretter en verdi fra t1
        }

        // dersom det ene arrayet er lenger enn det andre, vil kun en av disse while løkkene anvendes for å
        // fylle ut de resterende verdiene i det lengste arrayet
        while(i < s1.length) c[k++] = s1[i++];
        while (j < t1.length) c[k++] = t1[j++];

        String string = new String(c); // omdanner arrayet til streng
        return string;
    }

    /// 7b)
    public static String flett(String... s) {
        int n = 0;
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
