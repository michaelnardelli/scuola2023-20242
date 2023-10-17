1. **Machine-to-Machine (M2M):** In questa modalità, le macchine o i dispositivi comunicano direttamente tra loro senza l'intervento umano. Ad esempio, una macchina di monitoraggio ambientale potrebbe inviare dati a un'altra macchina di elaborazione dati.
    
2. **Machine-to-Gateway (M2G):** Qui, le macchine comunicano con un gateway o un dispositivo intermedio che agisce come punto di accesso alla rete. Il gateway può quindi trasmettere i dati al cloud o ad altri dispositivi. Questo è utile quando i dispositivi IoT non hanno connettività diretta a Internet.
    
3. **Machine-to-Cloud (M2C):** Questa modalità coinvolge la comunicazione diretta delle macchine con servizi o risorse basate su cloud. Ad esempio, un sensore IoT può inviare dati direttamente a un server cloud per l'archiviazione e l'analisi.
    

Per stabilire connessioni IoT, i dispositivi devono utilizzare gli stessi protocolli a livello di applicazione. L'applicazione da utilizzare può variare in base ai dispositivi e al tipo di connessione coinvolta.

Nella Figura 1, è rappresentato un esempio noto di un client che utilizzerà il protocollo HTTP per comunicare con il server Web. Il server Web è configurato e gestito per consentire alle persone di interagire con una pagina Web.

Sono emersi nuovi protocolli a livello di applicazione, come MQTT e REST, per supportare i dispositivi IoT che si connettono in una miriade di diverse configurazioni remote.

- **Message Queuing Telemetry Transport (MQTT):** Si tratta di un protocollo di messaggistica leggero con un minimo overhead che fornisce un'alta integrità dei dati e sicurezza per ambienti remoti.
    
- **Representational State Transfer (REST):** O RESTful web services, è un tipo di API progettata per semplificare l'interazione tra programmi su Internet. REST consente l'uso del protocollo HTTP e degli URL per richiedere servizi Web