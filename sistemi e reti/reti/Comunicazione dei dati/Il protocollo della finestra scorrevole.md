Il protocollo della finestra scorrevole è aprotocollo di controllo del flusso che permettecollegano entrambi i nodi A e B per inviare e ricevere simultaneamente dati e conferme.

- Il mittente puòinviare più frame senza dover attendere conferme.
    
- Senessun nuovo dato i frame sono pronti per la trasmissione in un tempo specificato, aframe di riconoscimento separato viene generato per evitare il timeout.
    
- Ogni frame in uscita contiene un filenumero di sequenza compreso tra 0 e 2𝑛−1 (𝑛 campo di bit), perché Ws = Wr.  
    Quindi, se la dimensione totale èn bit, abbiamo:  
    Ws + Wr = 2N  → 2W = 2N  → W = 2N/2 = 2n-1  
    Per il protocollo della finestra scorrevole stop-and-wait, 𝑛 = 1.
    

- ## [[sistemi e reti/reti/Comunicazione dei dati/finestre/Finestra mittente]]
- ## [[sistemi e reti/reti/Comunicazione dei dati/finestre/Finestra di ricezione]]
- 



    

