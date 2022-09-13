# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Jan Nicole Yao, S362049, s362049@oslomet.no
* Joachim Ivo Di Mattia Martinsen s358995, s358995@oslomet.no
* Noor

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Jenny har hatt hovedansvar for oppgave 1, 2, 3.
* Nicole har hatt hovedansvar for oppgave 4, 5, og 6.
* Joachim har hatt hovedansvar for oppgave 7, 8 og 9. 
* Vi har i fellesskap løst oppgave 10. 

# Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å ...

I oppgave 2 så brukte vi en ... til å ...

I oppgave 4 så gikk vi frem ved å først se om hele tabellen består av kun partall eller kun oddetall. Hvis det
er det så sorterer vi tabellen stigende og avslutter metoden. Hvis ikke så går vi videre og går gjennom tabellen
fra begge sider, venstre og høyre. Neste er å finne partall som ligger på venstre siden og oddetall som ligger
på høyre siden også bytter vi om. Etter alle oddetallene ligger på venstre og alle partallene ligger på høyre,
sorterer vi fra a[0] til antall oddetall som er k også sorterer vi fra k til siste verdi i tabellen.

I oppgave 5 begynte vi med å sjekke om parametertabellen er tom eller inneholder bare en verdi. Hvis den er det
gjør vi ingenting med tabellen og metoden er ferdig. Hvis ikke så går vi videre og flytter siste verdien til en
hjelpevariabel. Deretter går vi gjennom hele tabellen med en for-løkke og flytter alle verdiene til høyre.
Til slutt setter vi første verdien lik hjelpevariablen som er lik siste verdien av tabellen på starten.