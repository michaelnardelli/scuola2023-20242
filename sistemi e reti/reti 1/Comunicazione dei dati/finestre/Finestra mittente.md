La finestra del mittente è uninsieme di numeri di sequenza gestiti dal mittente corrispondenti ai numeri di sequenza dei fotogrammi dei fotogrammiinviato ma non ancora riconosciuto.

Esempio:

n=8 (23), W= 4 (23-1)

PERDUTO

|   |   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|
|11|10|9|8|7|6|5|4|3|2|1|0|
|Non inviato|   |   |   |Inviato ma non ACK|   |   |   |Inviato e ACK|   |   |   |

  

- Il mittente può trasmettere anumero massimo = W di frame prima di ricevere qualsiasi riconoscimento senza bloccare (Pipeline).
    
- Qualsiasi frame in una finestra di invio può essereperso o danneggiato e quindideve essere salvato in memoria o buffer fino a quando non vengono riconosciuti.

Finestra mittente