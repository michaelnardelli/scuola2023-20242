
|   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|
|Subnet della rete 172.16.10.0/24|   |   |   |   |   |   |   |   |
|Area|Rete|Mask|Gateway|max host|Primo indirizzo|Ultimo indirizzo|Indirizzo di Broadcast|Gateway|
|Segreteria|172.16.10.0/27|255.255.255.224|172.16.10.1|30|172.16.10.1|172.16.10.30|172.16.10.31||
|Didattica|172.16.10.32/25|255.255.255.128|172.16.10.33|126|172.16.10.33|172.16.10.158|172.16.10.159||
|Servizi|172.16.10.160/29|255.255.255.248|172.16.10.161|6|172.16.10.161|172.16.10.166|172.16.10.167||
|Palazzina|172.16.10.168/26|255.255.255.192|172.16.10.169|62|172.16.10.169|172.16.10.230|172.16.10.231||
|...|||||||||

1. **Calcolo delle subnet:**
    
    - La rete fornita è 172.16.x.0/24, quindi abbiamo 8 bit disponibili per gli host (32 - 24).
    - Dobbiamo soddisfare le richieste per Segreteria (max 25), Didattica (max 100), Servizi (max 6), e Palazzina (max 60).
    - Per ogni richiesta, scegliamo la maschera di sottorete più adatta (il numero di bit necessari per soddisfare il numero massimo di host).
2. **Segreteria:**
    
    - La richiesta massima è di 25 host, quindi ci servono almeno 5 bit per gli host (2^5 = 32).
    - Scegliamo una maschera di sottorete /27 (32 - 5 = 27).
    - La rete sarà 172.16.10.0/27, con un massimo di 30 host.
3. **Didattica:**
    
    - La richiesta massima è di 100 host, quindi ci servono almeno 7 bit per gli host (2^7 = 128).
    - Scegliamo una maschera di sottorete /25 (32 - 7 = 25).
    - La rete sarà 172.16.10.32/25, con un massimo di 126 host.
4. **Servizi:**
    
    - La richiesta massima è di 6 host, quindi ci servono almeno 3 bit per gli host (2^3 = 8).
    - Scegliamo una maschera di sottorete /29 (32 - 3 = 29).
    - La rete sarà 172.16.10.160/29, con un massimo di 6 host.
5. **Palazzina:**
    
    - La richiesta massima è di 60 host, quindi ci servono almeno 6 bit per gli host (2^6 = 64).
    - Scegliamo una maschera di sottorete /26 (32 - 6 = 26).
    - La rete sarà 172.16.10.168/26, con un massimo di 62 host.
6. **Assegnazione degli indirizzi:**
    
    - Assegna il primo indirizzo IP come gateway per ogni subnet.
    - Calcola il primo e l'ultimo indirizzo host nella subnet.
    - Calcola l'indirizzo di broadcast della subnet.
7. **Controllo della validità:**
    
    - Assicurati che gli indirizzi IP assegnati non siano già in uso nella tua rete.
    - Assicurati che gli indirizzi IP siano assegnati correttamente secondo le specifiche.
