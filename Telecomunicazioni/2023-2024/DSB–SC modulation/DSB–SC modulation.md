# Modulazione e Funzionamento del Modulatore

## La **modulazione**

è un processo attraverso il quale l'informazione contenuta in un segnale informativo, chiamato segnale modulante , viene impressa su un secondo segnale, chiamato portante \(v_p(t)\), che funge da supporto all'informazione. La portante non contiene informazioni in sé, ma serve unicamente a essere modellata dal segnale informativo. Quest'ultimo, non adatto alla trasmissione diretta, deve essere imprevedibile per contenere informazioni.

Le ipotesi semplificative considerate qui presuppongono che il segnale modulante sia prevedibile, ad esempio, una sinusoide. Queste semplificazioni agevolano l'analisi matematica del problema. La funzione della portante è simile a una tavoletta d'argilla pronta per essere incisa, mentre quella del segnale modulante è come uno stilo maneggiato da uno scrittore che incide sulla tavoletta. Il risultato è il segnale modulato, una tavoletta incisa contenente informazioni.

## Funzionamento del Modulatore

Il modulatore svolge il processo di modulazione e può essere hardware o software, spesso implementato attraverso DSP (Digital Signal Processor).

Supponiamo, per semplicità, che il segnale modulante sia cosinusoidale: ![[Pasted image 20231210095922.png]], applicato all'ingresso del modulatore AM.
![[Pasted image 20231210095956.png]]
![[Pasted image 20231210095415.png]]

Perché non trasmettere direttamente il segnale modulante usando lo schema nella Figura 2? La risposta è che un'antenna deve essere accordata alla lunghezza d'onda del segnale
![[Pasted image 20231210100427.png]], e per frequenze vocali umane tipiche, ciò richiederebbe antenne sproporzionatamente grandi.
![[Pasted image 20231210095436.png]]

**UN BREVE ESEMPIO**
La voce umana (di un lettore che legge un brano di testo) ha normalmente uno spettro nel quale la frequenza delle armoniche è compresa fra ![[Pasted image 20231210100808.png]] ; perciò per semplificare supponiamo che la frequenza sia pari a:![[Pasted image 20231210100838.png]] ; essendo  ![[Pasted image 20231210100925.png]] la velocità del campo EM avremo che se ![[Pasted image 20231210100838.png]] allora![[Pasted image 20231210101646.png]]perciò per accordare l’antenna ad un quarto della lunghezza d’onda essa dovrà avere una lunghezza pari a:
![[Pasted image 20231210101733.png]]
Quindi, per evitare questa limitazione, si cerca di ottenere un segnale a frequenza molto più alta![[Pasted image 20231210103545.png]], permettendo l'uso di un'antenna più corta. Questo si ottiene attraverso la modulazione. Un segnale modulante a bassa frequenza ![[Pasted image 20231210103558.png]] viene combinato con una portante ad alta frequenza KHz, producendo un segnale modulato. Un modo semplice di modulazione è il DSB-SC (Double-Side-Band Suppressed-Carrier), dove la portante è soppressa.
![[Pasted image 20231210103703.png]]

## DSB-TC

La modulazione di ampiezza (AM) è comunemente indicata come DSB-TC (Double Side Band Transmitted Carrier) per evidenziare che nella trasmissione è presente la portante. La DSB-TC è la forma classica di AM.
**Modulatore a Prodotto**
![[Pasted image 20231210104350.png]]

### Ottenere un Segnale DSB

Per ottenere un segnale DSB, è sufficiente utilizzare un componente a basso costo chiamato mixer o moltiplicatore. Il segnale in uscita dal mixer è proporzionale al prodotto dei segnali in ingresso:

![[Pasted image 20231210104509.png]]

Dove:

- ![[Pasted image 20231210103558.png]] è il segnale modulante, ipotizzato come ![[Pasted image 20231210104637.png]].
- ![[Pasted image 20231210104706.png]]è il segnale portante, ipotizzato come ![[Pasted image 20231210104736.png]]
**dove Wp** e la costante pulsazione della portante
- ![[Pasted image 20231210104939.png]]è la costante di proporzionalità detta sensibilità del modulatore.
- ![[Pasted image 20231210105002.png]]​ è l'ampiezza massima del segnale modulante.
- ​ ![[Pasted image 20231210105042.png]]è l'ampiezza massima della portante.

### Calcolo delle Armoniche

Le armoniche del segnale modulato DSB possono essere calcolate usando le formule di Werner per il prodotto di due cosinusoidi. Il segnale modulato DSB può essere espresso come:

![[Pasted image 20231210105158.png]]

Dove:
![[Pasted image 20231210105343.png]]
![[Pasted image 20231210105422.png]]
![[Pasted image 20231210105447.png]]
Il segnale modulato DSB contiene due bande laterali, una con frequenza pari alla somma delle frequenze della portante e della modulante (USB) ![[Pasted image 20231210105631.png]]e l'altra con frequenza pari alla differenza (LSB)![[Pasted image 20231210105559.png]].

### Suppressione della Portante (DSB-SC)

La DSB-SC implica la soppressione della portante, e quindi il segnale modulato non la contiene. Nel dominio del tempo, il segnale modulato è la somma di due cosinusoidi senza la componente portante:

![[Pasted image 20231210105721.png]]

#### Spettro del Segnale

![[Pasted image 20231210110017.png]]
sarà la somma delle due righe spettrali. Queste due righe sono posizionate sul diagramma spettrale in corrispondenza della frequenza LSB (differenza) e della frequenza USB (somma). Giova ricordare che la frequenza della portante è molto maggiore di quella della modulante: fp >> fm ; e dunque le due righe spettrali del segnale modulato sono molto vicine fra loro. Infatti risulta che:  fp - fm è quasi uguale ad fp + fm . Possiamo tracciare gli spettri dei tre segnali: modulante, portante, e modulato.
![[Pasted image 20231210110349.png]]

### Esempio Numerico

Ad esempio, con ![[Pasted image 20231210110658.png]], si ottiene![[Pasted image 20231210110734.png]] . Entrambe le righe spettrali possono essere trasmesse efficacemente con un'antenna di circa 75 metri di lunghezza. Se Avessimo scelto
![[Pasted image 20231210110832.png]]
 sarebbe bastata un’antenna da meno di un metro

## Dimostrazione delle Formule di Werner

Le formule di Werner dimostrano come il prodotto di due cosinusoidi possa essere sviluppato nella somma di due cosinusoidi
![[Pasted image 20231210110959.png]]
  ![[Pasted image 20231214110107.png]]
  Partendo dalle formule di addizione per il coseno:
![[Pasted image 20231210111047.png]]

Sommando le due equazioni otteniamo:

![[Pasted image 20231210111109.png]]
Per dimostrare le formule di Werner, dobbiamo dividere entrambi i membri dell'equazione per 2:

![[Pasted image 20231210111148.png]]

Quindi, abbiamo dimostrato che il prodotto di due cosinusoidi può essere rappresentato come la somma di due cosinusoidi. Questo è ciò che si chiama formule di Werner, e dimostra il modo in cui un segnale modulato può essere rappresentato come la somma di due componenti laterali,.


Vgamma=