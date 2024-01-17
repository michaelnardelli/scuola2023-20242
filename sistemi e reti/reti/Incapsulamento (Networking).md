


L'incapsulamento è il processo nei computer networking che consiste nel concatenare gli header o i trailer specifici di ogni livello con un'unità di dati di servizio (payload) per la trasmissione delle informazioni attraverso le reti informatiche. La deincapsulazione è il processo inverso, che rimuove un header o un trailer precedentemente concatenato da un'unità di dati di protocollo (PDU) trasmessa da uno strato di comunicazione sottostante.

L'incapsulamento e la deincapsulazione consentono la progettazione di protocolli di comunicazione modulari per separare logicamente la funzione di ogni livello di comunicazione e astrarre la struttura delle informazioni comunicate su altri livelli di comunicazione. Questi due processi sono caratteristiche comuni nei modelli di networking e nelle suite di protocolli, come nel modello OSI e nella suite di protocolli Internet.

Tuttavia, i processi di incapsulamento/deincapsulamento possono anche essere utilizzati in modo dannoso, come nei protocolli di tunneling.

Il livello fisico si occupa della trasmissione fisica dei dati, l'incapsulamento del collegamento consente la rete locale, IP fornisce l'indirizzamento globale dei singoli computer, e TCP seleziona il processo o l'applicazione (porta TCP o UDP) che specifica il servizio, come un server Web o TFTP.

Ad esempio, nella suite IP, i contenuti di una pagina web sono incapsulati con un'intestazione HTTP, quindi con un'intestazione TCP, un'intestazione IP e, infine, con un'intestazione e un trailer di frame. Il frame viene inoltrato al nodo di destinazione come un flusso di bit, dove viene deincapsulato nelle rispettive PDU e interpretato a ogni livello dal nodo ricevente.

Il risultato dell'incapsulamento è che ogni livello inferiore fornisce un servizio al livello o ai livelli superiori, mentre allo stesso tempo ogni livello comunica con il suo livello corrispondente sul nodo ricevente. Questi sono noti come interazioni tra livelli adiacenti e interazioni tra gli stessi livelli, rispettivamente.

Nei dibattiti sull'incapsulamento, il livello più astratto è spesso chiamato protocollo di livello superiore, mentre il livello più specifico è chiamato protocollo di livello inferiore. A volte, tuttavia, i termini protocolli di livello superiore e protocolli di livello inferiore vengono utilizzati per descrivere i livelli sopra e sotto IP.