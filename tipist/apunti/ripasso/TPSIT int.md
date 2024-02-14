1. programma e una entità statica formata da un codice
processo e un'entità dinamica, un programma in esecuzione che utilizza alcune risorse del pc 
concorrenti si intente quando un processo parte prima che l'altro a ancora da finire.

2. il multi programming e quanto si eseguono più processi contemporaneamente
parallelismo e un caso particolare di concorrenza di due processi perché due processi vanno in parallelo. time slice e un intervallo di tempo in cui il per i processori di alternarsi sul processore se viene utilizzato per breve tempo e nella base del multi programming
3. struttura di memoria di un processo 
![[Pasted image 20231128083744.png]]
la meoria e divisa un due parti la parte statica e la parte dinamica 
la parte statica contiene il programma e le sue variabili
la parte dinamica e divida in più parti di nome stack(la pila di sitema)
l'heap(il mucchio) dati creati quando si esegue il processo
4. stato di processo
![[Pasted image 20231128084047.png]]
**new → ready**: i nuovi processi non vanno direttamente in
esecuzione ma vengono inseriti nella coda dei processi “ready”, in
attesa che si renda disponibile un processore. La posizione che
occupano nella coda dipende anche dalla priorità
**ready → run**: il primo processo nella coda viene mandato in q
esecuzione non appena si rende disponibile 
**run → ready**: si verifica un evento asincrono, cioè non generato
dal processo in esecuzione, ma dall’algoritmo di scheduling. Ad esempio
è scaduto il time slice e vi sono processi ready con priorità maggiore.
**run → wait**: si è verificato un evento sincrono, cioè determinato
da un’istruzione del processo stesso, ad esempio la richiesta di accesso
ad una risorsa. Generalmente la gestione di questo tipo di eventi
richiede tempi lunghi rispetto al time slice. Quindi il processo viene
inserito in una coda di attesa associata allo stato di whait e il
processore viene assegnato ad un processo in stato di ready.
**wait → ready**: quando l’evento atteso si verifica, il processo passa
allo stato ready e inserito nella relativa coda. Tornerà in esecuzione
quando si renderà libero il processore e se non vi sono processi in
attesa con priorità maggiore.
**run → end**: il processo termina con successo oppure è terminato
dal sistema operativo a causa di un errore non gestito.

	