
## Concetti Fondamentali

### Risorse Condivise
- Risorse che possono essere utilizzate da più processi o thread contemporaneamente.

### Mutua Esclusione
- Garantire che una risorsa possa essere utilizzata da un solo processo o thread alla volta.

### Sezioni Critiche
- Parti di codice che accedono e manipolano risorse condivise.

## Gestione delle Sezioni Critiche

### Disabilitazione Interruzioni
- Un approccio hardware che impedisce l'arrivo di interruzioni durante l'esecuzione di una sezione critica.

### Semafori
- Un meccanismo di sincronizzazione che permette o blocca l'accesso a una risorsa condivisa.
- Implementazione con contatore intero e operazioni di wait e signal.

### Semafori Binari/Booleani (Spinlock)
- Semaforo con valore 0 o 1 per rappresentare l'occupazione di una risorsa.
- Soluzione più leggera e meno suscettibile a inversione di priorità rispetto a semafori generali.

### Accesso alla Risorsa: Lock
- Operazione che impedisce ad altri processi o thread di accedere a una risorsa condivisa.
- Evita l'accesso simultaneo.

### Rilascio della Risorsa: Unlock
- Operazione che permette ad altri processi o thread di accedere a una risorsa condivisa dopo averla utilizzata.

## Problemi e Soluzioni

### Problema dell'Attesa Attiva
- Situazione in cui un processo o thread continua a verificare periodicamente una condizione.
- Consumo di risorse CPU inefficace.
- Soluzione: utilizzo di meccanismi di sincronizzazione più efficienti come semafori.

### Problema dell'Indivisibilità della Funzione Lock
- Possibilità che l'operazione di lock non sia atomicamente eseguita, consentendo a più processi di acquisire il lock contemporaneamente.
- Soluzioni possibili:
  - Utilizzo di istruzioni atomiche.
  - Implementazione di spinlocks più sofisticati.
  - Sincronizzazione attraverso hardware specializzato.

