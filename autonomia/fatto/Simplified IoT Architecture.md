L'architettura semplificata per l'IoT si basa sul tipo o sul livello di connessione tra gli oggetti intelligenti e offre un approccio più semplice alla progettazione dei sistemi IoT. Ogni livello di connettività espansa presenta un insieme diverso di problemi di progettazione e requisiti per la sicurezza e la privacy da considerare. Di seguito, una panoramica dei quattro livelli di connessione:

**Device-to-Device (Figura 1)**

Le soluzioni IoT spesso supportano la connessione diretta di un oggetto intelligente a un altro tramite un protocollo wireless come Bluetooth o Zigbee. Un esempio di questo livello potrebbe essere un sensore situato in un vigneto che rileva il terreno secco e invia un segnale a un attuatore che attiva il sistema di irrigazione.

**Device-to-Cloud (Figura 2)**
![[Pasted image 20231006113435.png]]

In un modello di comunicazione da dispositivo a rete a cloud, il dispositivo IoT si connette attraverso una rete locale direttamente a un servizio cloud Internet utilizzando connessioni Ethernet tradizionali o Wi-Fi. Questo modello stabilisce una connessione tra il dispositivo, la rete IP e il cloud per consentire lo scambio di dati e messaggi di controllo.

**Device-to-Gateway-to-Cloud (Figura 3)**

Molti dispositivi intelligenti, come i fitness tracker, non sono abilitati IP e non hanno la capacità nativa di connettersi direttamente alla nebbia o al cloud. Per questi dispositivi, esiste un software di applicazione che opera su un dispositivo gateway locale che funge da intermediario tra il dispositivo e il servizio cloud. Il gateway può anche fornire sicurezza e traduzione dati o protocolli. Per dispositivi come i fitness tracker, il gateway è spesso un'applicazione in esecuzione su uno smartphone.

**Device-to-Gateway-to-Cloud-to-Application (Figura 4)**

Un'altra opzione di connessione supporta la raccolta e il trasferimento dei dati da dispositivi intelligenti attraverso un gateway a una rete IP locale. I dati poi fluiscono verso la nebbia o il cloud e sono disponibili per gli utenti per l'esportazione e l'analisi. I dati vengono spesso analizzati in combinazione con dati provenienti da altre fonti o altri servizi cloud.

La conoscenza dei quattro livelli di connessione di base garantirà che venga prestata attenzione all'interoperabilità dei dispositivi e agli standard aperti, che sono considerazioni chiave nello sviluppo di un sistema IoT interconnesso.