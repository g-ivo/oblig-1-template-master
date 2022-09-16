package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;


public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length <= 0){ //Returnerer feilmelding hvis tabeller er mindre eller lik 0
            throw new NoSuchElementException("Tabellen er tom!");
        }

        for(int i = 0, j = 1; j < a.length; i++, j++) { //Maks-metode med i og j. i blir j-1 og
            if (a[i] > a[j]){ //Sammenligner, hvis i er større enn j
                var maks = a[i]; //Definerer maks som a av i
                a[i] = a[j]; //Hvis i er større enn j og siden i er før j bytter de plass
                a[j] = maks; //j blir nye maks verdi
            }
        }

        return a[a.length - 1]; //Returnerer verdien
    }

    //bytt og randPerm er kopiert fra kompendie 1.1.8.

    public static void bytt(int[] a, int i, int j){
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm(int n){
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for(int k = n - 1; k > 0; k--){
            int i = r.nextInt(k + 1);
            bytt (a, k, i);
        }
        return a;
    }

    public static void main(String[] args){
        int n = 100;
        System.out.println(ombyttinger(randPerm(n)));
    }

    public static int ombyttinger(int[] a) {
        if (a.length <= 0){ //Returnerer feilmelding hvis tabellen er mindre eller lik 0
            throw new NoSuchElementException("Tabellen er tom!");
        }

        var count = 0; //Definerer count som starter på 0

        for(int i = 0, j = 1; j < a.length; i++, j++) {
            if (a[i] > a[j]){
                var maks = a[i];
                a[i] = a[j];
                a[j] = maks;
                count++; //+1 for hver gang i er større enn j og de bytter plass
            }
        }

        return count;

        /*
        a) Når blir det flest ombyttinger?: Det blir flest ombyttinger når en tabell er usortert og desto nærmere det
        største tallet er å stå fremst i tabellen. En usortert tabell kan ha det største tallet hvor som helst i rekken
        og er derfor alltid flere ombyttinger enn 1 eller 0.
        b) Når blir det færrest?: Det blir færrest ombyttinger når en tabell er sortert i stigende rekkefølge og si det
        siste tallet står sist eller nest sist. Det er derfor ikke nødvendig med ombyttinger og blir derfor færrest i
        en sortert tabell.
        c) Hvor mange blir det i gjennomsnitt?: Hn ≈ log(n) + 0,577 er formelen for å finne det harmoniske tallet som
        brukes for å finne gjennomsnittet Hn-1. Hvis n er lik 100.000 blir log(n) - 0,423 tilnærmet lik 11.1.
        Bruker randPerm og bytt fra kompendiet for å teste gjennomsnittet av ombyttinger med vår egen maks-metode.
        Hvis n=1000 blir gjennomsnittet vårt 998, n=100_000 blir det 99991 og av n=100 blir gjennomsnittet 96.
       */

    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        for (int i = 1; i < a.length; i++) { //Returnerer feilmelding hvis tabellen ikke er sortert
            if (a[i] < a[i - 1]) { //Sjekker om a[1] er mindre enn a[0], hvis den ikke er det viser det at den ikke er sortert i stigende rekkefølge
                throw new IllegalStateException("Ikke sortert!");
            }
        }

        if (a.length == 0) { //Returnerer 0 hvis
            return 0;
        }

        var count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                count++;
            }
        }
        return count;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0){ //Returnerer 0 hvis lengden på tabellen er lik 0
            return 0;
        }

        var count2 = 1; //Definerer variabel count2 som starter fra 1
        for (int i = 1; i < a.length; i++){ //lager to for-løkker for å lagre og sammenligne
            var unique = true;
            for (int j = 0; j < i; j++){
                if (a[i] == a[j]) { //Hvis de to tallene sammenlignet er like blir unique til false
                    unique = false;
                    break; //Breaker for å kunne gå ut av for-løkken og kjøre på nytt
                }
            }
            if (unique){
                count2++; //Teller for hver gang unique er true
            }
        }

        return count2;
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
            int n = a.length; // forkortelse
            if (n > 1) {
                if (k > 0) {
                    // Hvis k er større enn lengden av arrayet skal vi trekker
                    // fra n opptil den er mindre enn n
                    while (k > n) {
                        k = k - n;
                    }

                    // Lager en hjelpetabell av lengde k
                    char temp[] = new char[n - k];

                    // Kopierer første n-k verdier inn i hjelpetabellen
                    for (int i = 0; i < n - k; i++) {
                        temp[i] = a[i];
                    }

                    // Flytter resten av verdiene til indeksen 0 til k
                    for (int j = n - k; j < n; j++) {
                        a[j - n + k] = a[j];
                    }

                    // Kopierer hjelpetabell inn til parametertabellen
                    for (int l = 0; l < n - k; l++) {
                        a[l + k] = temp[l];
                    }
                } else {
                    k *= -1; // Gjør om k til en positiv verdi

                    while (k > n) {
                        k = k - n;
                    }

                    // Lager hjelpetabell med lengden k
                    char temp[] = new char[k];

                    // Kopierer første k element inn i hjelpetabellen
                    for (int i = 0; i < k; i++) {
                        temp[i] = a[i];
                    }

                    // Flytter resten av verdiene til indeksen 0 til n-k
                    for (int j = k; j < n; j++) {
                        a[j - k] = a[j];
                    }

                    // Kopierer hjelpetabellen inn i parametertabellen
                    for (int l = 0; l < k; l++) {
                        a[l + n - k] = temp[l];
                    }
                }
            }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    // kode til oppgaven er hentet fra kompendium  avsnitt 1.3.11
    public static String flett(String s, String t) {
        char[] s1 = s.toCharArray();        // gjør om til et char-array
        char[] t1 = t.toCharArray();

        char[] c = new char[(s1.length + t1.length)]; // opprettet tabell av riktig størrelse
        int i = 0, j = 0, k = 0; // løkkevariabler

        while (i < s1.length && j < t1.length) {
            c[k++] = s1[i++]; // først en verdi fra s1 inn i det nye arrayet
            c[k++] = t1[j++]; // deretter en verdi fra t1
        }

        // dersom det ene arrayet er lenger enn det andre, vil kun en av disse while løkkene anvendes for å
        // fylle ut de resterende verdiene i det lengste arrayet
        while (i < s1.length) c[k++] = s1[i++];
        while (j < t1.length) c[k++] = t1[j++];

        String string = new String(c); // omdanner arrayet til streng
        return string;
    }

    /// 7b)
    public static String flett(String... s) {
        int n = 0; // n initialiseres til default verdi og vil tilsvare lengden til den lengste strengen
        if (s.length == 0) { // i tilfelle tom tabell
            n = 0;
        } else{
            n = s[0].length(); // finner lengden til s og kjører løkke gjennom s, n ganger
            for (int i = 0; i < s.length; i++) {
                if (n < s[i].length()) {
                    n = s[i].length();
                }
            }
        }

        StringBuilder c = new StringBuilder(); //tom variabel som mottar char fra s
        int teller = 0; //default initialisering av teller

        //while-løkke som aktiveres for ubrukte char
        while (teller < n) {
            for (int i = 0; i < s.length; i++) { //looper gjennom ord fra tabellen s
                char[] ord = s[i].toCharArray(); //gjør om til streng fra char-array
                if (ord.length != 0) { //alle strenger som ikke er tomme
                    for (int j = teller; j < s[i].length(); j++) { //looper gjennom char i hvert ord
                        c.append(ord[j]);                          //legger til char i ord-variabelen
                        break; //kun en char fra hvert ord
                    }
                }
            }
            teller++; // øker teller med 1

        }
        return c.toString(); //gjør om alle flettede char til en string
    }

    ///// Oppgave 8 //////////////////////////////////////

    public static int[] indekssortering(int[] a) {
        int[] indeks= new int[a.length]; // oppretter tomt array for indeks-tabell
        int[] verdiSort = new int[a.length]; // oppretter tomt array for sortert verdi-tabell
        for (int i = 0; i <a.length ; i++) { // legger inn verdiene fra tabellen a til verdiSort
            verdiSort[i]=a[i];
        }
        for (int i = 0; i < a.length; i++) { // sorterer verdiene fra minst til størst gjennom dobbel bruk av
            for (int j = 0; j < a.length; j++) { // for løkker og if setninger
                if (verdiSort[i] < verdiSort[j]) {
                    int temp = verdiSort[j];
                    verdiSort[j] = verdiSort[i];
                    verdiSort[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) { // setter inn de opprinnelige indeksposisjonene til verdiene i tabell a
            for (int j = 0; j < a.length; j++) { // i den nye tabellen indeks
                if (verdiSort[i] == a[j]) { // denne gangen er indeksposisjonene verdiene til tabellen indeks
                    indeks[i] = j; // verdiene er sortert på bakgrunn av minste til største verdi fra tabell a
                }
            }
        }
        return indeks; // returnerer array med sorterte indeksposisjoner etter stigende verdistørrelse fra opprinnelig
        // array a
    }

    ///// Oppgave 9 //////////////////////////////////////
    // brukt programkode fra 1.2.5 oppgave 4 i kompendiet
    public static int[] tredjeMin(int[] a) {

        int n = a.length; // tabellens lengde
        if (n<3){ // må ha minst tre verdier
            throw new NoSuchElementException("a.length(" + n +")< 3");
        }

        int m = 0; //posisjonen til den minste verdien
        int nm = 1; //...den nest minste verdien
        int tm = 2; //...den tredje minste verdien

        // bytter om rekkefølger på verdiene, slik at vi får riktig rekkefølge henhold til minste verdi.
        if (a[nm] < a[m]) {
            m = 1;
            nm = 0;
        }

        if (a[tm] < a[m]) {
            int temp = tm;
            tm = m;
            m = temp;
        }

        if (a[tm] < a[nm]) {
            int temp = tm;
            tm = nm;
            nm = temp;
        }

        int minVerdi = a[m]; // minste verdi
        int nestMinVerdi = a[nm]; // nest minste verdi
        int tredjeMInVerdi = a[tm]; // tredje minste verdi

        for (int i = 3; i < n; i++) {
            int verdi = a[i];

            if (verdi < tredjeMInVerdi) {
                if (verdi < nestMinVerdi) {
                    if (verdi < minVerdi) {
                        tm = nm;
                        tredjeMInVerdi = nestMinVerdi;

                        nm = m;
                        nestMinVerdi = minVerdi;

                        m = i;
                        minVerdi = verdi;
                    }
                    else {
                        tm = nm;
                        tredjeMInVerdi = nestMinVerdi;

                        nm = i;
                        nestMinVerdi = verdi;
                    }
                } else {
                    tm = i;
                    tredjeMInVerdi = verdi;
                }
            }
        }
        int [] indekser = {m, nm, tm}; // lager et array med de tre minste verdiene
        indekssortering(indekser); // array kjøres gjennom for indekssortering

        return indekser;


    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        //Ikke nødvendig? Oppgave 10 består tester.
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        var characterCountA = new int[256];
        for (int i = 0; i < a.length(); i++){
            var bokstav = a.charAt(i);
            characterCountA[bokstav]++;
        }

        var characterCountB = new int[256];
        for (int i = 0; i < b.length(); i++){
            var bokstav = b.charAt(i);
            characterCountB[bokstav]++;
        }

        for(int i = 0; i < characterCountA.length; i++){
            if(characterCountB[i] < characterCountA[i]){
                return false;
            }
        }
        return true;
    }

}  // Oblig1
