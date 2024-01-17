# Risorse di Sistema e Gestione da Parte del Sistema Operativo

Le risorse di sistema sono elementi fondamentali per il corretto funzionamento di un sistema informatico. Il sistema operativo è responsabile della gestione efficiente di queste risorse al fine di garantire un ambiente di esecuzione stabile e performante. Di seguito, analizzeremo diverse tipologie di risorse e come vengono gestite dal sistema operativo.

## 1. Memoria RAM

La RAM (Random Access Memory) è una risorsa cruciale per l'esecuzione dei processi. Il sistema operativo assegna porzioni di memoria RAM ai singoli processi per consentire loro di eseguire le istruzioni in modo veloce ed efficiente.

### 1.1. Codice e Variabili Condivise

Il codice di un programma e le variabili condivise sono memorizzati nella RAM. Il sistema operativo si occupa di gestire la concorrenza e l'accesso a queste variabili per evitare conflitti tra i processi.

## 2. Periferiche

Le periferiche rappresentano qualsiasi dispositivo collegato al sistema tramite cavi. Il sistema operativo gestisce le comunicazioni con le periferiche, fornendo un'interfaccia standard per facilitare l'interazione con esse.

### 2.1. File

I file sono gestiti dal sistema operativo che fornisce le funzionalità di lettura, scrittura e organizzazione dei dati in modo che i processi possano accedere e manipolare le informazioni in modo ordinato.

## 3. Processi e Processori

I processi rappresentano l'esecuzione di programmi. Il sistema operativo si occupa di schedulare i processi in modo da garantire un utilizzo efficiente della CPU (Central Processing Unit) o processore.

## 4. Risorse del Sistema Operativo

Il sistema operativo controlla e gestisce diverse risorse:

- **Spazio di Memoria:** Assegna spazi di memoria ai processi in esecuzione.
- **Spazio di Memoria di Massa:** Gestisce l'accesso e l'organizzazione dello spazio su dispositivi di memoria di massa come hard disk o SSD.
- **Periferiche:** Coordinazione delle operazioni di input/output verso le periferiche.
- **File:** Gestisce l'accesso, la creazione e la modifica dei file presenti nel sistema.
- **Spazio di Memoria Condivisa:** Coordina l'accesso a regioni di memoria condivise tra diversi processi.

Ogni tipologia di risorsa è gestita da un modulo specifico del sistema operativo, il quale si occupa di garantire l'accesso sicuro e la corretta sincronizzazione tra i processi.

## Problematiche

Una delle sfide principali per il sistema operativo è assicurare che ogni processo acceda alle risorse nel minor tempo possibile, evitando conflitti e garantendo un'esperienza utente fluida. La corretta gestione delle risorse è essenziale per garantire la stabilità e le prestazioni del sistema.


# grafo di holt

 - descrive l'assegazione delle risorse ai processi 
 - assegazionr/riciesta risorsa




![[grafo di holt.jpeg]]

## riduzione del garfo
R1 puo essere asegnata ad p3 
P1 a sottificado le richieste e puo passare dopo 

# asegnaizone delle risose 
1) statica--> alla creazione del processo(aree di memorizzazione /descrittori )
2) dinamica -->