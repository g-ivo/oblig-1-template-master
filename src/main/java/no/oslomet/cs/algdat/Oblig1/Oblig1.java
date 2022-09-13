package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        // Sjekker hvis arrayet inneholder bare partall eller oddetall
        int odde = 0, par = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odde++;
            } else {
                par++;
            }
        }

        if (odde == a.length || par == a.length) {
            Arrays.sort(a,0,a.length);
        } else {
            // Lager indeks fra venstre og høyre
            int venstre = 0, hoyre = a.length -1;

            // Antall oddetall
            int k = 0;

            while (venstre < hoyre) {
                // Finner første partall som står på venstre siden
                while (a[venstre] % 2 != 0) {
                    venstre++;
                    k++;
                }

                // Finner første oddetall som står på høyre siden
                while (a[hoyre] % 2 == 0 && venstre < hoyre) {
                    hoyre--;
                }

                // Bytter partall som finnes til hæyre og oddetall til venstre
                if (venstre < hoyre) {
                    if (hoyre == a.length-1 && a[hoyre] % 2 != 0 && a[venstre] % 2 != 0) {
                        k++;
                        venstre = hoyre;
                    } else {
                        int temp = a[venstre];
                        a[venstre] = a[hoyre];
                        a[hoyre] = temp;
                    }
                }
            }

            // Sorter oddetallene
            Arrays.sort(a, 0, k);

            // Sorter partallene
            Arrays.sort(a, k,a.length);
        }
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length > 1) {
            char temp = a[a.length-1]; // flytter siste verdi til en hjelpevaribel

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i-1]; // flytter alle verdiene til høyre bortsett fra første verdien
            }
            a[0] = temp;
        }
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
