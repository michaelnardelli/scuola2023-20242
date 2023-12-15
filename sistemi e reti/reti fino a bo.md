
 ---****---![[Senza titolo 1.png]]![[Senza titolo 1.png]] Architettura x86

  

- 4004

- 8008

- 8086

- 80186

- 80283

- i386

- 486

- Pentium

  

### [[ALU]]

  

Unità aritmetica e logica

  

### Salto condizionato

  

- Si esegue il salto solo se è vero

  

### Clock

  

- Esegue un'operazione

    - VA = P / W

    - RI^2

  

DUE TIPI DI DROGA

  

- NEGATIVO

- POSITIVO

  

## BIOS

  

Basic Input-Output System

  

## NVRAM

  

RAM non volatile

  

## End device soltanto una connessione

  

## Rete a pacchetti

  

Sullo stesso canale fisico riescono ad esistere competitor della rete IP

  

X.25

  

- Ritrasmessi tutti i pacchetti

- Non tutte le reti potrebbero avere un ordine di pacchetti

  

Il ritorno non è sempre obbligatorio

  

## Sistemazione dei dati

  

Modello OSI e TCP/IP

  

![[image 1.png]]

  

## Diverse tipologie di reti

  

![[Pasted image 20231025082401 1.png]]

  

1. **Cavo di rame (Copper):** Le reti utilizzano il cavo di rame perché è economico, facile da installare e ha una bassa resistenza alla corrente elettrica. Tuttavia, il cavo di rame è limitato dalla distanza e dall'interferenza del segnale. Pertanto, tutti i supporti in rame devono seguire rigorose limitazioni di distanza specificate dagli standard di riferimento.

2. **Fibra ottica (Fiber Optics):** I cavi in fibra ottica possono percorrere distanze significativamente più lunghe rispetto ai cavi in rame grazie alla loro immunità all'interferenza del segnale. Il dispositivo mittente trasmette i bit binari come impulsi luminosi utilizzando LED o laser. Il dispositivo ricevente utilizza fotodiodi per rilevare gli impulsi luminosi e convertirli in tensioni. I cavi in fibra ottica sono ampiamente classificati come fibra monomodale (SMF) e fibra multimodale (MMF). La SMF è costituita da un nucleo molto piccolo che utilizza tecnologia laser costosa per inviare un singolo raggio di luce su lunghe distanze di centinaia di chilometri. La MMF ha un nucleo più grande e utilizza emettitori LED a costo inferiore per inviare impulsi luminosi. La MMF è popolare nelle implementazioni LAN perché può supportare 10 Gb/s su collegamenti di 550 metri.

3. **Wireless (Senza fili):** Le connessioni wireless comprendono una vasta gamma di opzioni di connessione, tra cui segnali elettromagnetici, frequenze radio e microonde e collegamenti satellitari.

  

**indirizzo IPV4=32bit**

### Ethernet

  

- Facilità di installazione

- Rete solo tra due parti

- [Carrier Sense](https://it.wikipedia.org/wiki/CSMA)

- 1500 byte

- Ripetitori (sono stati sostituiti dagli switch)

- Il clock di ricezione si sincronizza per vederlo

- Pacchetto Ethernet

    - Fatto di ottetti (otto bit)

        - Preambolo nei primi sette

            - Alternanza di 0 e 1

        - Il primo è l'indirizzo MAC

            - Sei ottetti (48 bit)

        - Pacchetto tradizionale

            - Due frame diversi

                - 1.

                    - Tipo di pacchetto dati a seguire

                - 2

                    - Sequenza

        - Payload ()

            - piu comune IPV4

            - arp

        - due dispositivi nella stesare te ahnno la stessa net

        -

  

            - Carico utile (il pacchetto inviato)

        - CSMA/CD

        -

  
  

### protocolli di ruting

  

### WIFI

- diversi canalli

- frequenze diversi

    - 2.4GHz

    - 5GHz

    - 6GHz

- prottocollo frad/zigbi

  

il comando ping si utiliza il pakketo

fa una echo recuest

# IANA (Internet Assigned Numbers Authority)
- **Definizione:**
    
    - IANA, acronimo di Internet Assigned Numbers Authority, è un'organizzazione che gestisce le risorse numeriche assegnate nell'ambito di Internet, come gli indirizzi IP e i numeri di protocollo.
- **Ruoli Principali:**
    
    - Assegna e gestisce gli spazi di indirizzi IP, sia IPv4 che IPv6, garantendo che siano utilizzati in modo coerente e efficiente.
- **CCITT (Comité Consultatif International Téléphonique et Télégraphique) --> ITU-T (International Telecommunication Union - Telecommunication Standardization Sector):**
    
    - La CCITT è stata rinominata ITU-T ed è una delle tre principali divisioni dell'ITU (International Telecommunication Union). Si occupa della standardizzazione nel campo delle telecomunicazioni. Il passaggio da CCITT a ITU-T sottolinea l'evoluzione e l'espansione delle responsabilità verso le nuove tecnologie.
- **CCIR (Comité Consultatif International pour la Radio) --> ITU-R (International Telecommunication Union - Radiocommunication Sector):**
    
    - La CCIR è stata rinominata ITU-R ed è un'altra delle divisioni dell'ITU. Si concentra sulla standardizzazione nel campo delle radiocomunicazioni. Questo cambiamento di nome riflette l'aggiornamento delle sue funzioni e il suo adattamento alle tecnologie emergenti.
- **IETF (Internet Engineering Task Force):**
    
    - L'IETF è un'organizzazione che si occupa dello sviluppo e della promozione di standard Internet, tra cui protocolli, procedure e linee guida. Contrariamente alle divisioni dell'ITU, l'IETF è un'organizzazione più informale, composta da volontari tecnici provenienti da tutto il mondo.

### DNS (Domain Name System)

- **Definizione:**
    
    - Il DNS, acronimo di Domain Name System, è un sistema gerarchico di traduzione degli indirizzi IP in nomi di dominio e viceversa, facilitando la navigazione e l'accesso alle risorse su Internet.
- **Funzionamento:**
    
    - Traduce nomi di dominio comprensibili per gli utenti in indirizzi IP utilizzati dai dispositivi di rete per identificarsi reciprocamente.
- **Struttura Hierarchica:**
    
    - Il DNS è organizzato in una struttura gerarchica con al vertice il root domain, seguito dai top-level domain (TLD) come .com, .org, .net, e poi dai domain names specifici.
- **Risolvere Nomi in Indirizzi IP:**
    
    - Quando si inserisce un nome di dominio nel browser, il sistema DNS converte il nome in un indirizzo IP, consentendo al dispositivo di connettersi al server desiderato.
- **Record DNS:**
    
    - Contiene informazioni come indirizzi IP associati a un dominio (record A), informazioni sulle mail server (record MX), e altri dettagli cruciali per la gestione del traffico Internet.
