Per fare arrivare un segnale ad un utilizzatore si possono usare diverse modalità.
La propagazione guidata dei segnali serve a far propagare il campo EM (Elettro
—Magnetico) in uno spazio ben determinato, evitando le dispersioni di energia.
Ciò richiede il contenimento dell’EMF (Electro Magnetic Field) in un mezzo
trasmissivo quale può essere, ad esempio, un cavo (una linea).
La propagazione libera dei segnali consiste nel far propagare il campo EMF
senza un mezzo trasmissivo appositamente predisposto, ma sfruttando
semplicemente lo spazio attorno al trasmettitore. Infatti l’EMF si propaga anche
nel vuoto, e nell’aria, senza bisogno di predisporre dei cavi.
Supponiamo di voler collegare un generatore VS ad un carico RL posto ad una
certa distanza, come riportato in figura.


Nel modello più generale una linea di trasmissione può essere schematizzata
come due conduttori paralleli che connettono un generatore ad un carico.
Fissiamo un sistema di riferimento dove x è la distanza di un generico punto della
linea dal generatore. Ovviamente il punto zero coincide con i morsetti (detti anche
i poli) A—B del generatore, e la tensione sinusoidale in quel punto verrà chiamata
tensione iniziale.
Volendo descriverla dal punto di vista istantaneo la chiameremo v(0,t) ; ossia la
tensione che abbiamo nell’istante t in corrispondenza del punto che dista 0 metri
dal generatore.
Oppure usiamo una rappresentazione vettoriale, che potremmo definire come:


.

Normalmente facciamo l’ipotesi che il segnale del generatore abbia fase nulla.
La tensione istantanea iniziale — nel senso di inizio della linea — v(0,t) tra i due
conduttori avrà una descrizione matematica del tipo seguente:



dove abbiamo scritto esplicitamente che la fase del segnale vale zero in
corrispondenza del generatore. Possiamo allora scrivere:

dove V0M è l’ampiezza massima della tensione sinusoidale all’inizio della linea, f è
la frequenza del segnale prodotto dal generatore ed w è la sua pulsazione (detta
anche velocità angolare).
N.B.: Bisogna fare attenzione a non confondere questa tensione a carico v(0,t)
con vS(t) che è la tensione a vuoto del generatore. Non potremo mai ottenere
quest’ultima sui morsetti A-B, a meno che la corrente di linea sia nulla.
Infatti in questo caso non avremmo alcuna caduta ai capi di RS e risulterebbe
v(0,t) = vS(t) . Ma per ottenere ciò occorre tagliare i fili in corrispondenza dei
morsetti, staccando il generatore dalla linea. Dunque NON verrebbe trasmesso
alcun segnale verso il carico.



Il carico (Load) è posto a distanza xL dal generatore, dove xL è la lunghezza della
linea. La tensione sinusoidale in quel punto verrà chiamata tensione finale, oppure
tensione sul carico.
Volendo descriverla dal punto di vista istantaneo la chiameremo v(xL , t) ;
ossia la tensione che abbiamo nell’istante t in corrispondenza del punto che dista
xL metri dal generatore.
Tutte queste grandezze possono essere considerate anche dal punto di vista
vettoriale, anziché come valori istantanei. Possiamo fare considerazioni analoghe
anche sulle correnti oltre che sulle tensioni.
In ogni istante t e in ogni posizione x, la tensione v(x,t) tra i due conduttori avrà
una descrizione matematica del tipo seguente:
v(x,t) = VXM sen(wt – j)

dove v(x,t) è la tensione istantanea (all’istante t) nel punto che dista x metri dal
generatore; VXM è la sua ampiezza massima in quel punto e j è il ritardo di fase
della tensione nel punto x rispetto alla tensione iniziale.
Vedremo che sarà sempre VXM < V0M ; ossia il segnale si attenua mano a mano
che ci allontaniamo dal generatore. Inoltre lo sfasamento j del segnale in linea è
sempre più in ritardo mano a mano che ci allontaniamo dal generatore.
La corrente i(x,t) nei due conduttori — a patto che venga misurata nello stesso
punto x — benché abbia verso opposto è comunque uguale, in modulo, sia sul filo
di andata (tratto A—C di figura 1) che su quello di ritorno (tratto D—B di figura 1).
La linea di trasmissione è il componente elettronico per trasportare segnali su
distanze anche grandi, di centinaia o migliaia di metri, ed i tempi di propagazione
non possono essere trascurati.
Affinché il campo EM (elettromagnetico) si sposti anche di un solo metro dal
generatore verso il carico, occorre un certo tempo. Il campo EM deve percorrere
tutta la lunghezza della linea prima di arrivare al carico, e questo viaggio richiede
un certo tempo detto tempo di propagazione. Quindi gli effetti dei tempi di
propagazione non possono essere trascurati.



Per capire in modo approssimativo ciò che accade in una linea, pensiamo ad un
tubo di gomma usato per irrigare un giardino. Il tubo è inizialmente vuoto. Quando
viene aperto il rubinetto l’acqua non sgorga subito nell’estremità finale, posta
vicino ai fiori. Infatti bisogna aspettare che l’acqua erogata dal rubinetto riempia
tutto il tubo.
Il segnale mentre si propaga nella linea subisce uno sfasamento a causa del fatto
che la velocità di propagazione non è infinita. Infatti quando un campo EM si
propaga in un mezzo, la sua velocità di propagazione vale:


dove e è la permittività elettrica del mezzo (detta anche costante dielettrica)
mentre m è la permeabilità magnetica del mezzo.
Se il mezzo è il vuoto (oppure l’aria) allora la sua permeabilità vale:



e la sua permittività vale:

e = e0 = 8.85 . 10-12 F/m (Farad al metro)
sicché nel vuoto il campo EM si propaga ad una velocità pari a :
vp = v0 = c = 1/√(m0e0) = 2.997925 .108 m/s (metri al secondo)

ovvero circa 3 . 108 m/s .
Se invece il campo EM si propaga in un materiale generico, allora la permeabilità
del materiale vale: m = m0

.mr dove mr è un numero puro. La costante mr viene
chiamata permeabilità magnetica relativa ed indica quanto più, in quel
particolare mezzo (ad esempio: ferro) le linee di forza del campo magnetico
saranno più dense rispetto alle stesse linee nel caso in cui il campo magnetico sia
in aria. Un esempio di valori tipici per alcuni materiali si può leggere qui.
La costante mr nel caso del ferro vale circa 2000.

Se il campo EM si propaga in un materiale generico, allora la permittività del
materiale vale:

e = e0
. er

Pag. 4 di 22

dove er è un numero puro. La costante er viene chiamata costante dielettrica
relativa ed indica quanto più, in quel particolare mezzo (ad esempio: ceramica) le
linee di forza del campo elettrico saranno più dense rispetto alle stesse linee nel
caso in cui il campo elettrico sia in aria.
La costante er nel caso della ceramica vale circa 5.
Ad esempio, supponiamo che per realizzare una linea di trasmissione usiamo due
fili di rame paralleli isolati fra loro da guaine in PVC (PoliVinilCloruro). Il campo EM
nel nostro caso non si propaga nel vuoto, ma nel materiale plastico che separa il
filo di andata da quello di ritorno. Per i materiali plastici in genere abbiamo mr = 1
mentre la loro costante dielettrica er normalmente è compresa fra 2 e 3 e dipende
dal particolare isolante usato. Questo fatto comporta come conseguenza che in
un cavo il campo EM si propaga ad una velocità inferiore a quella che
raggiungerebbe nel vuoto. La velocità di propagazione vale:

	

Per i materiali plastici in genere abbiamo mr = 1 e perciò : vp = c/√(er) .
Essendo normalmente per gli isolanti dei cavi : 2 < er < 3 risulta che la velocità di
propagazione vp è poco più della metà del valore che avrebbe nel vuoto:



La lunghezza d’onda di un campo EM è lo spazio che il suo fronte d’onda riesce a
percorrere in un ciclo del generatore:


dove T è il periodo del generatore, ovvero il tempo impiegato per compiere un
ciclo; mentre f è la frequenza del generatore, ovvero il numero di cicli emessi in un
secondo.
Per ciclo intendiamo una semionda positiva seguita da una semionda negativa.
Supponiamo, ad esempio, che un generatore emetta un segnale di frequenza
f = 1 GHz e che la velocità di propagazione valga: vp = 2 . 108 m/s ; in tal caso la
lunghezza d’onda del segnale vale:


Se poniamo un osservatore alla distanza di 20 cm dal generatore, come sarà fatto
il segnale osservato in quel punto? Sarà una sinusoide con un ritardo di fase pari
ad un ciclo esatto rispetto al generatore; ossia un ritardo di fase pari a 360°
ovvero 1 a.g. (angolo giro) oppure 2p rad. Questo corrisponde in termini di tempo
ad un ritardo di propagazione pari a:



Dunque nel momento in cui viene acceso il generatore, esso comincia ad erogare
la sua prima semionda positiva. Ma noi che ci siamo posti ad osservare il segnale
nel punto situato in (x = l ) ovvero a venti centimetri di distanza, non vediamo in
effetti alcun segnale all’inizio. Perché dobbiamo aspettare un intero nanosecondo
affinché il fronte d’onda del campo EM arrivi fino a noi.
Come si può notare dalla figura seguente.


Come si può notare
c’è un ritardo nel
segnale v(l,t)
rispetto a v(0,t)

Cosa accade quando ci mettiamo ad osservare il segnale in un punto x generico?
Quanto tempo dovremo aspettare per vedere arrivare il segnale? In altre parole:
quanto vale il ritardo temporale (in secondi) del segnale per arrivare in quel
punto? E di conseguenza, quanto vale il ritardo di fase (in radianti od in gradi) del
segnale per arrivare in quel punto?
Ricordiamo che la tensione di linea vale:


dove v(x,t) è la tensione istantanea nel punto che dista x metri dal generatore; VXM
è la sua ampiezza massima in quel punto e j è il ritardo di fase della tensione nel
punto x rispetto alla tensione iniziale. Lo sfasamento j del segnale in linea è
sempre più in ritardo mano a mano che ci allontaniamo dal generatore.
Se x = l allora tp = T ; e j = 360° = 2p rad = 1ag = 1 ciclo.
Se x = l/2 allora tp = T/2 ; e j = 180° = p rad = mezzo ciclo.
Un osservatore posto in x = l /2 deve aspettare mezzo nanosecondo affinché il
fronte d’onda del campo EM arrivi fino a lui.
Come si vede dalla figura.


500 750

Perciò, se x = l /2 allora l’osservatore vedrà la sua prima semionda positiva
mentre il generatore l’ha già terminata, e sta erogando quella negativa; come si
vede dalla figura alla pagina precedente (fig. 4).
In generale avremo:

v(x,t) = VXM sen(wt – j) = VXM sen(wt – bx)

dove b viene chiamato coefficiente di sfasamento. Il suo valore ci dice di quanti
radianti (o gradi) si sfasa in ritardo il segnale da noi osservato, per ogni metro di
allontanamento dal generatore. Si calcola nel seguente modo:

b = ( 2p / l ) = (360° / l) .

Siamo, così, in grado di calcolare lo sfasamento del segnale in un punto qualsiasi
della linea, prendendo come riferimento quello appena erogato dal generatore —
che si assume abbia fase uguale a zero.

ATTENUAZIONE

Come si calcola l’ampiezza VXM in un punto
qualsiasi della linea rispetto a V0M ?

Supponiamo di suddividere (virtualmente) la linea in tanti pezzettini da un
centimetro ciascuno. Ciascun pezzetto di 1 cm lo dividiamo in dieci pezzetti da 1
millimetro. Dividiamo ancora ciascun pezzetto di 1 mm in tanti pezzettini,
arbitrariamente piccoli. Ciascuno di essi ha una lunghezza che chiamiamo dx.
Mettiamo in evidenza il
circuito equivalente di
una sezione
infinitesima di linea, di
lunghezza dx; e le
quattro costanti:
R = r . dx; L = l . dx;
C = c . dx; G = g . dx.
Se consideriamo i
vettori delle tensioni e

Pag. 9 di 22
Fig. 5

delle correnti in ingresso ed in uscita da questa sezione risulta:
V2 = V1 – VR - VL = V1 - (ZR+ZL)
.
I1
dove ZR = R; e ZL= jwL

vengono chiamate impedenze longitudinali essendo disposte secondo la
lunghezza della linea. Mentre I1 è la corrente in ingresso alla nostra sezione di
linea. Ovviamente R non può essere nulla. E nemmeno L .
Quanto vale, ad esempio, la resistenza di un tratto di filo lungo un centimetro? In
questo caso consideriamo dx come 1 cm. Potremmo anche considerare un tratto
di filo lungo un millimetro, ed in questo caso sarà dx = 1 mm. In generale, dx ha
come unità di misura <<metri>> essendo una lunghezza. La resistenza di questo
minuscolo tratto di linea vale:

R = r . dx;

dove r (scritta in minuscolo) viene detta resistenza specifica della linea. La sua
unità di misura non è W bensì r è espressa in [W/m] . Infatti il prodotto r . dx è
espresso in [W] e bisogna ricordare che dx è espresso in [m] essendo una
lunghezza. Ricordiamo che in generale, dato un filo di materiale conduttore di
sezione S espressa in [m2

] e di lunghezza l espressa in [m] esso presenterà una

resistenza pari a: R = r .

l/S ; dove r è la resistività del materiale impiegato (ad
esempio: rame) ed ovviamente r (rho, ovvero la r minuscola in greco) è espressa
in [W.m] . Sicché la resistenza specifica vale: r = r /S ; ed r è espressa in [W/m] .
Non è possibile avere R = 0 poiché non esiste un materiale conduttore che abbia
resistività nulla: r = 0 [W.m] . Se utilizziamo il rame come conduttore allora
abbiamo r = 1.7 .

10-8 [W.m]. Un valore molto basso, ma non nullo.

Per avere R piccola deve essere r piccola ossia siamo costretti ad usare una
grande sezione del cavo. Ma ovviamente, è improponibile usare un cavo delle
dimensioni di un tronco d’albero a causa del costo e dell’ingombro, oltre che del
peso.
Di conseguenza non potremo avere VR = 0 e dovremo sopportare la caduta di
tensione resistiva. Possiamo contenerne il valore se siamo disposti a spendere
molto denaro per un cavo dalla sezione generosa. Possiamo fare considerazioni
simili sulla caduta induttiva VL .

Pag. 10 di 22

La resistenza specifica r fa parte delle quattro costanti primarie (r, l, c, g) che
determinano il comportamento della linea. Il produttore del cavo ne specifica i
valori nei dati tecnici forniti a corredo assieme al prodotto. Ovviamente il
costruttore cerca di ottimizzare i valori delle costanti primarie allo scopo di
ottenere le migliori prestazioni possibili, ma ciò comporta un aumento dei costi ed
è necessario fare un compromesso.
Per quanto riguarda la corrente in uscita dalla nostra sezione di linea della figura
5, avremo:

I2 = I1 – IG – IC = I1 – (G + YC)
.V2

dove G è la conduttanza di perdita dovuta all'isolante imperfetto mentre



è l'ammettenza capacitiva. Queste vengono chiamate impedenze (ammettenze)
trasversali essendo disposte di traverso alla linea.
Se volessimo ottenere G = 0 dovremmo utilizzare un isolante avente resistività
infinita, ovvero r = ∞ [W.m] ; ma non esiste un materiale del genere. Se usiamo il
vetro come isolante allora abbiamo r compreso fra 1010 e 1014 [W.m] a seconda
del tipo di vetro. Ma questo isolante non si può piegare. Se utilizziamo il PE
(polietilene) come isolante allora abbiamo r oltre 1015 [W.m] e questo isolante è
flessibile. Viene largamente impiegato per la costruzione dei cavi. Così avremo G
piccola ma non possiamo ottenere G = 0 .
Dunque possiamo affermare che la tensione e la corrente in uscita sono più
piccole, in modulo, rispetto a quelle in ingresso alla linea. Inoltre, poiché le
ammettenze ed impedenze reattive



provocano uno sfasamento fra le tensioni e le correnti che le interessano, di
conseguenza accadrà che la tensione in uscita V2 oltre ad essere più piccola in
modulo rispetto a V1 , sarà anche sfasata rispetto a V1 . Un ragionamento simile si
può fare per quanto riguarda le correnti. È bastato far percorrere al segnale un



solo centimetro di linea per ritrovarsi con una tensione (V2) ed una corrente (I2)
attenuate (in modulo) e ritardate (in fase) rispetto a V1 ed I1 .
Volendo dare un’altra spiegazione al fatto che V2 risulta sfasata rispetto a V1
possiamo notare che la velocità di propagazione del segnale, pur essendo alta, è
comunque limitata e dunque l'osservatore nel punto x vedrà il segnale in tale
punto con un certo ritardo temporale tp rispetto al segnale emesso dal
generatore; questo ritardo temporale si traduce in un ritardo di fase.
Ad esempio, se fosse x = l/2 allora l'osservatore nel punto x vedrebbe il segnale
con un ritardo temporale pari a T/2 ovvero mezzo ciclo; e questo ritardo temporale
si traduce in un ritardo di fase pari a mezzo angolo giro, oppure p radianti ovvero
180°. Ancora, possiamo dire che detto tp il valore del tempo di propagazione del
segnale fino al punto x, questo ritardo temporale (in secondi) corrisponde ad un
ritardo di fase (in radianti) pari a:

dove w è la pulsazione del segnale prodotto dal generatore: w = 2pf .
I due fenomeni (sfamento ed attenuazione) avvengono contemporaneamente.
Abbiamo allora che l’ampiezza (il modulo) della tensione diminuisce:



a causa delle due cadute di tensione VR e VL della figura 5. Ed inoltre abbiamo
che anche il modulo della corrente diminuisce:

a causa delle due perdite di corrente IG ed IC .
Se questa sezione di linea fosse seguita da un’altra uguale (un altro centimetro di
linea) con ingresso V2 ed uscita V3 allora di conseguenza sarebbe:


per le ragioni già viste. Dunque mano a mano che aumenta il numero di centimetri
frapposti fra l’osservatore (nel punto x) ed il generatore, la tensione e la corrente
(in modulo) diminuiscono sempre più mentre le loro fasi saranno sempre più in
ritardo.

Pag. 12 di 22

Relazione fra distanza x ed ampiezza VXM del segnale
Fino ad ora abbiamo trovato una relazione quantitativa fra la distanza x e lo
sfasamento del segnale in quel punto, ovvero il ritardo di fase. In un punto
qualsiasi posto ad x metri dal generatore, la tensione in un istante t qualsiasi vale:

v(x,t) = VXM .

sen(wt – j) = VXM .

sen(wt – bx)

dove il ritardo di fase vale:


ed evidentemente risulta: b = w/vp .
Vogliamo ora trovare una relazione quantitativa fra la distanza x e l’ampiezza VXM
del segnale in quel punto, ovvero l’attenuazione di ampiezza.
Qual è l’espressione matematica dell’ampiezza VXM ? Ossia: quanto vale il modulo
della tensione VXM in un punto x generico? Risulta la seguente relazione:


ovvero una relazione di tipo esponenziale.
L’andamento della funzione esponenziale y = e-ax dipende da a (costante di
attenuazione).
Se a è grande allora y = e

-ax decresce velocemente all’aumentare della distanza x

dal generatore (cavo di scarsa qualità);



se invece a è piccola allora y = e-ax decresce lentamente all’aumentare della
distanza x dal generatore; se fosse a = 0 allora y = e-ax sarebbe costante e
varrebbe 1 ; ovvero in questo caso (impossibile) il segnale non si attenua mai,
nemmeno allontanandosi di migliaia di chilometri dal generatore.
Come si può notare nella figura alla pagina precedente.
Purtroppo non esistono sul mercato cavi con attenuazione uguale a zero.
Generalmente i costruttori cercano di ottenere valori di a piccoli il più possibile,
ma questo obiettivo comporta un aumento del costo di ogni metro di linea.
Quando il modulo della tensione si è attenuato di un fattore pari ad e = 2.718
allora si dice che la tensione si è attenuata di un Neper (1 Np) rispetto al valore
precedente.
Supponiamo che alla distanza x accada che:
;

in tal caso diremo che il modulo VXM è stato attenuato di 1 Np rispetto a V0M ossia
rispetto alla tensione sul generatore. Se indichiamo con Vx il vettore della tensione
nel punto x allora avremo che:

Vx = V0 .
e-ax
.
e-jbx

dove il primo esponenziale indica l’attenuazione della tensione nel punto x rispetto
al punto zero, ed il secondo esponenziale indica lo sfasamento della tensione nel
punto x rispetto al punto zero. Infatti il coefficiente a viene chiamato anche
coefficiente di attenuazione o costante di attenuazione e si esprime in
Neper/metro mentre il coefficiente b viene chiamato anche coefficiente di
sfasamento o costante di fase e si esprime in radianti/metro.
Possiamo sintetizzare quanto sopra scrivendo:

		   
dove l’esponenziale è un numero complesso caratterizzato dal suo modulo e dalla
sua fase: ossia indica tanto l’attenuazione che lo sfasamento della tensione nel
punto x rispetto al punto zero.



Il coefficiente g (costante di propagazione) contiene in sè entrambe le
informazioni, essendo:


un numero complesso. La sua parte reale a ci informa sulle caratteristiche di
attenuazione della linea mentre la sua parte immaginaria b ci informa sulle
caratteristiche di sfasamento del segnale lungo la linea.
Le quattro costanti primarie (r, l, c, g) determinano il comportamento della linea e
da esse derivano i valori di a , b e g che sono dette costanti secondarie. In
particolare, si può dimostrare che:

Esiste una particolare condizione di bilanciamento delle costanti primarie detta di
Heavyside nella quale accade che r. c = l . g ed in questo caso abbiamo che:

e perciò il coefficiente di attenuazione a = √( r. g ) è costante mentre il
coefficiente di sfasamento b = w.√(l . c ) aumenta in modo lineare all’aumentare
della frequenza.
In ogni punto x della linea, detto Vx il vettore della tensione ed Ix il vettore della
corrente, si può dimostrare che il loro rapporto vale:

e viene chiamato impedenza caratteristica della linea. Per valori elevati della
frequenza si può approssimare con:

Se vogliamo indicare l’attenuazione di tensione dell’intera linea intesa come
numero puro possiamo scrivere:



dove VLM è l’ampiezza massima della tensione sul carico (Load) e V0M è
l’ampiezza massima della tensione sul generatore (nel punto zero). In tal caso
avremo un numero più piccolo di 1 (anche di molto). Oppure potremo scegliere di
scrivere (specificandolo):


ed in tal caso avremo un numero più grande di 1 (anche di molto). Ovviamente
non potrà mai accadere che l’uscita di una linea abbia ampiezza maggiore rispetto
all’ingresso.
Non accade quasi mai che un costruttore di cavi specifichi l’attenuazione di una
pezzatura (normalmente 50m oppure 100m) con un numero puro. Di solito essa
viene espressa in unità logaritmiche, ad esempio in Neper :



dove l’operatore di logaritmo naturale deve intendersi come logaritmo in base “e”
ovvero in base al cosiddetto numero di Neper, che è irrazionale e vale circa:

.

Molto più spesso l’attenuazione di tensione di una pezzatura viene espressa in
deciBel:


dove l’operatore di logaritmo decimale — in base 10 — è specificato dal fatto che
l’iniziale è maiuscola: “Log” e non “log”.
Si può indicare anche l’attenuazione di potenza di una pezzatura in deciBel:



sicché una volta che l’attenuazione venga specificata in deciBel, il valore
numerico ottenuto sarà lo stesso sia che si tratti dell’attenuazione di potenza in
deciBel AP|dB sia che si tratti dell’attenuazione di tensione AV|dB .
Infatti la potenza del segnale aumenta o diminuisce con il quadrato della tensione:



Riguardiamo la figura 5 qui di seguito: vediamo che le cadute di tensione
longitudinali valgono:




e dunque la caduta resistiva non dipende dalla frequenza del segnale che
viaggia lungo la linea. Ma conta molto di più il secondo addendo:



dunque la caduta induttiva peggiora mano a mano che la frequenza del segnale
aumenta.
Sempre dalla figura 5 vediamo che le perdite di corrente sulle ammettenze
trasversali risentono in particolar modo della corrente parassita capacitiva IC , la
quale peggiora mano a mano che la frequenza del segnale aumenta. Infatti,
ricordando che l'ammettenza capacitiva vale:

abbiamo che la perdita di corrente capacitiva risulta:



e dunque la perdita di corrente capacitiva aumenta per segnali di frequenza
elevata e le sue conseguenze sono particolarmente negative quando si tratta di
trasmettere segnali in una rete di computer ad alta velocità, volendo trasferire
grandi quantità di dati in un tempo ridotto.


Per quanto sopra, normalmente le aziende produttrici specificano le attenuazioni
dei loro cavi per diversi valori della frequenza applicata, dato che le perdite
dipendono da essa.
Come si può vedere dalla figura 7 , una pezzatura di 50 metri di un cavo a medie
prestazioni come l’RG213 alla frequenza di 50MHz attenua il segnale d’uscita di 2
deciBel rispetto all’ingresso, mentre se la frequenza applicata vale 1.3 GHz allora
l’attenuazione del segnale sul carico è di ben 14 deciBel rispetto al segnale ai
morsetti del generatore. Una differenza enorme. Nella parte in basso della figura 7
viene anche rappresentato l’andamento dell’attenuazione di un cavo economico
ed a basse prestazioni come l’RG58 . Ma data la sua forte attenuazione, il grafico
riguarda una pezzatura di soli 30 metri.



Pur su di una lunghezza così limitata abbiamo, per l’economico RG58 alla
frequenza di 50MHz, una attenuazione dell’ampiezza d’uscita di oltre 3 deciBel
rispetto all’ingresso. Mentre se la frequenza applicata vale 1.3 GHz allora
l’attenuazione del segnale sul carico è di circa 20 deciBel rispetto al segnale del
generatore. Una differenza ancora più grande.



In senso assoluto se consideriamo la potenza erogata dal generatore e quella in
arrivo sul carico, ciò significa che di 100W erogati solo 1W arriva sul carico. Dove
sono andati a finire gli altri 99W? Sono andati a riscaldare i 30 metri di cavo RG58
che infatti non è freddo ma tiepido. Specie in prossimità del generatore.
Su molte cime montuose del nostro territorio sono presenti dei trasmettitori per
servizi di telecomunicazioni, fra cui quelli televisivi. Accanto ad un traliccio in
acciaio che sostiene le antenne viene posto un bunker di cemento che contiene i
trasmettitori. Da quest’ultimo fuoriescono i cavi che vanno alle antenne e spesso
tali cavi sono posati per qualche metro sul terreno prima di arrivare al traliccio ed
assumere la posizione verticale. Durante le nevicate invernali si nota che dove
passano i cavi la neve si scioglie. La causa sta nelle perdite di potenza dei cavi.
Il comportamento appena descritto riguarda cavi con struttura coassiale,
completamente diversa da quella della linea di figura 1 che viene chiamata
“piattina”. Anche nei casi in cui viene impiegata la struttura a due fili — ovvero il
cosiddetto “doppino” — essi non vengono lasciati paralleli ma vengono
attorcigliati, per motivi che vedremo più avanti.
Quando si tratta di trasmettere segnali di frequenza elevata la scelta del cavo
coassiale è in grado di ottenere alte prestazioni ma purtroppo ad un costo ingente.
La struttura coassiale è riportata nella figura 8.



Il conduttore centrale viene chiamato anche “polo caldo” e corrisponde al
segnale vero e proprio. Esso è ricoperto da uno strato di isolante, che viene
ricoperto a sua volta da uno strato conduttore. Quest’ultimo è sovente costituito
da una calza di sottili fili di rame intrecciati. Questo è il conduttore che svolge la
funzione di filo di ritorno.
Per proteggerlo ed isolarlo dall’ambiente esterno vengono impiegati uno o più
strati di guaina isolante, spesso realizzata in materiali plastici oppure in gomma.
La figura 9 è la fotografia di un
cavo RG213. Il conduttore
centrale non è un cilindro di rame
pieno (sarebbe rigido) ma è
costituito da una trecciola di molti
fili sottili per aumentare la
flessibilità.
La terminazione di un cavo
coassiale deve essere realizzata
con un connettore anch’esso
coassiale come ad esempio il
BNC (Bayonet Neill Concelman)
dai nomi dei suoi inventori,
riportato in figura.
Purtroppo anche il connettore è costoso, ed il problema dei costi ha spinto le ditte
del settore a sviluppare cavi alternativi. Una delle
aziende più innovative è stata la Belden che ha
sviluppato negli anni i cavi di rete basati su doppini
attorcigliati.
Tanto che attualmente il cavo di rete per le LAN viene
spesso chiamato cavo Belden anche se ormai il
brevetto è scaduto ed una miriade di altri fabbricanti
produce i cavi da impiegare con standard Ethernet.


Il cavo coassiale, a causa dei costi ormai non viene più impiegato nelle LAN ma
solo in applicazioni dove non è rimpiazzabile, come le alte potenze ed altissime
frequenze.