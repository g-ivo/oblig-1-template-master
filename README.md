# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Jan Nicole Yao, S362049, s362049@oslomet.no
* Joachim Ivo Di Mattia Martinsen s358995, s358995@oslomet.no
* Jenny Hovland, s364545, s364545@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Jenny har hatt hovedansvar for oppgave 1, 2, 3.
* Nicole har hatt hovedansvar for oppgave 4, 5, og 6.
* Joachim har hatt hovedansvar for oppgave 7, 8 og 9. 
* Vi har i fellesskap løst oppgave 10. 

# Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å først lage en simpel NoSuchElementException som oppgaven etterspurte.
Deretter gikk lagde vi en for løkke for å lage en sammenligning av to og to tall. Vi opplevde at det ikke fungerte først 
og måtte revurdere for-løkken. Det gikk ikke å lage to for-løkker og kom også fram til at det blir en veldig lang og 
lite effektiv kode.For å sjekke ombytting lagde vi først en vanlig maks-verdi kode, men rettet på å bruke den samme 
for-løkken som fra første del av oppg1. Endret på oppgaven ved å lage en mye mer effektiv for-løkke som brukte mange 
færre ombyttinger. Svarer også på de teoretiske spørsmålene her og i kildekoden:

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

I oppgave 2 så brukte vi en if statement for å sjekke om tallene har samme verdi. Vi la merke til at koden endrer på 
arrayet og måtte derfor prøve en ny teknikk. Lagde også en return statement som returnerer 0 om lengden på tabellen 
også er 0. Lagde en for-løkke som sjekker om det "andre" tallet er ulikt fra tallet før den selv. Hvis tallene er ulike 
legger vi til 1 i count og går gjennom løkken til hele tabellen er gått gjennom. Så returnerer man count.

I oppgave 3 gikk vi fram ved å først bruke samme metode som i oppgave 2, men brukte litt tid på å skjønne hva man 
skal endres siden oppgave 3 baserer seg på en usortert tabell. Lagde en lik if statement som i oppgave 2 hvor vi 
returnerer 0 hvis tabellen har en størrelse på 0. Lager i denne oppgaven to for-løkker for å sammenligne og lagre 
tallene. Definerer også en "unique" variabel som true. Med en if-statement finner vi om det "andre"[1] tallet er likt 
som det forrige tallet[0]. Hvis tallene er like blir "unique" like false og vi breaker for å gå ut av den andre 
for-løkken for å gå gjennom den første på nytt og sammenligne nye tall. Vi teller kun hvis tallene returnerer 
unique=true.

I oppgave 4 så gikk vi frem ved å først se om hele tabellen består av kun partall eller kun oddetall. Hvis det
er det så sorterer vi tabellen stigende og avslutter metoden. Hvis ikke så går vi videre og går gjennom tabellen
fra begge sider, venstre og høyre. Neste er å finne partall som ligger på venstre siden og oddetall som ligger
på høyre siden også bytter vi om. Etter alle oddetallene ligger på venstre og alle partallene ligger på høyre,
sorterer vi fra a[0] til antall oddetall som er k også sorterer vi fra k til siste verdi i tabellen.

I oppgave 5 begynte vi med å sjekke om parametertabellen er tom eller inneholder bare en verdi. Hvis den er det
gjør vi ingenting med tabellen og metoden er ferdig. Hvis ikke så går vi videre og flytter siste verdien til en
hjelpevariabel. Deretter går vi gjennom hele tabellen med en for-løkke og flytter alle verdiene til høyre.
Til slutt setter vi første verdien lik hjelpevariablen som er lik siste verdien av tabellen på starten.

I oppgave 6 så gikk vi frem med å sjekke om tabellen har mer enn en verdi slik at vi får ingen feilsituasjon hvis
det er det. Hvis det er ikke det så gikk vi frem og sjekke om k er positiv eller negativ. Hvis den er positiv 
kopierer vi de k verdiene på slutten inn i en hjelpetabellen, så flytter vi resten av verdiene til høyre. Etterpå
setter vi inn hjelpetabellen inn i forsiden av parametertabellen. Hvis k er negativ ganger vi det med -1 slik at
k blir positiv også gjør nesten det samme som med positiv k, men isteden for å kopiere siste k verdier kopierer vi
de første k verdier og flytter resten av elementene til venstre. Til slutt setter vi hjelpetabellen inn i slutten
av parametertabellen.

I oppgave 7a så gikk vi frem med å gjøre om strengene s og t til et char array. Deretter opprettet vi en ny tabell med 
riktig lengde/størrelse. Vi foret deretter den nye tabellen med char gjennom å gi den en annenhver verdi fra s og t via
en while løkke som aktiveres når de to tellerne til tabellen s og t er mindre enn lengden på de respektive arrayene. 
Hvis arrayene s og t hadde forskjellig lengde, kjørte vi to nye while løkker separat som hentet ut resterende char fra 
arrayene. 

I oppgave 7b så initialiserer vi først variabelen n til en default verdi som senere via en if else kondisjon og 
for-løkke vil finne lengden til tabellen s. Deretter lager vi en tom variabel via metoden stringbuilder som kan motta
enkelttegn eller char fra s. gjennom en while løkke som utløses når default variabelen teller er mindre enn lengden til 
tabellen s, så looper vi gjennom ord fra tabellen, og henter ut kun et tegn fra hvert ord om gangen, som vi så sender
tilbake til den tomme variabelen c (tidligere laget med stringbuilder), som vi returnerer som en string via metoden 
toString.

I oppgave 8 så skal vi returnere indeksposisjone til tabellen array, dog sortert etter stigende verdistørrelse. Vi
startet først med å opprette en tom tabell med lengden til array a som skal inneholde indeksposisjonene til det 
endelige arrayet. Deretter opprettet vi nok en tabell som først skulle sortere verdiene til array a i stigende
rekkefølge. Sorteringen gjøres gjennom for løkker of if setninger. Når vi hadde sortert ferdig, så ønsket vi å 
finne indeksposisjonene til de sorterte verdiene i tabellen a. Dette klarte vi ved bruk av doble for løkker med en 
if setning som gjorde  utslag når verdiSort[i] == a[j]. Når vi hadde funnet ineksposisjonene til de minste verdiene i 
arrayet a via variabelen j, så la vi verdiene til variablen j inn i det nyopprettede arrayet indeks. Deretter
returnerte vi arrayet indeks. 

I oppgave 9 så finner vi indeksposisjonene til de tre minste verdiene i array: a. Vi starter med å initialisere
variablene n til tabellen a sin lengde, og vi får feilmelding dersom tabellen inneholder mindre enn 3 tall. Deretter
bytter vi rekkefølge på verdier, via if setninger og kjører dem gjennom for løkker for å få ut verdiene i riktig
rekkefølge henhold til minste verdi. Etter at sorteringen av verdier er ferdig, så oppretter vi array med de tre minste
verdiene, og deretter kjører den gjennom metoden indekssortering fra oppgave 8, for så å returnere arrayet.

I oppgave 10 startet vi med å definere hver bokstav telling for både streng A og B. I dette utgangspunktet teller man 
opp bokstavene etter hvor mange ganger de befinner seg i ordet. Dette fant vi ved å lage en for-løkke med en if 
statement som sammenligner ordene. Ved hjelp av booleansk verdi returneres enten True eller False om man finner like 
mange bokstaver av A og B i begge ordene. Vi opplevde at koden skrevet under "inneholdt" passerer alle testene og
finner ikke bruk for bokstavNr. Har også testet på egenhånd og fått riktig True/False statements uten definering
av bokstavNr/bokstav. 