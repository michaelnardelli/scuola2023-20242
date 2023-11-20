# [ANGULAR](https://angular.io/)

Angular è un framework basato su [Node.js](https://v8.dev/), che funge da strato intermedio tra un sistema operativo e il software che lo utilizza.

Un linguaggio compilato deve essere trasformato in linguaggio macchina prima di essere eseguito, mentre un linguaggio interpretato viene eseguito senza ulteriori trasformazioni su qualsiasi computer.

## COME INSTALLARE ANGULAR

1. Scaricare ed installare Node.js sul proprio PC. **Nota**: per lo sviluppo, useranno CodeSpaces, quindi non è necessario installare nulla.
2. Installare Angular con il seguente comando:

npm install -g @angular/cli

- Per aggiornare npm, eseguire il comando:
npm install -g npm@10.1.0

## Siti Utili

- [Angular Material](https://material.angular.io/)
- [Bootstrap](https://getbootstrap.com/)
- [JSON](http://www.json.org/json-it.html)

## Nomi degli Oggetti Angular Trattati per la Divisione

## File Importanti

- `angular.json`: consente di modificare il nome dell'icona principale.
- `package.json`

## Cartella `src`

### index.html

- Template esterno (front-end)

### Component

- Decoratore (definisce le classi)
- Equivalente a modularizzare la pagina
- Facilita il debug
- Facilita il riutilizzo del codice per la creazione di altre applicazioni
- Ha un file `.ts` (TypeScript)

### style.css

- Il CSS opera in cascata (l'ultima parte del codice ha la priorità)
- Gestisce lo stile della pagina, inclusi immagini e font.

### favicon.ico

- Si crea durante l'inizializzazione di Angular e può essere personalizzato.

### Cartella `assets`

- Contiene file multimediali ed è l'unica cartella che rimane una volta che l'applicazione è terminata.

### Cartella `app`

- Contiene vari oggetti (component) offerti da Angular.
- Tutti i nomi dei file iniziano con `app.component`.

#### app.component.ts

- Consente di dichiarare una variabile che può essere utilizzata in altri file.
- Contiene un file HTML.
- Contiene un file CSS.
- Contiene un file spec.ts (test automatici).
- Il template è una stringa.

## TypeScript

- Assegnazione delle variabili simile a Java.
- Gestisce la logica di business.

## Comandi `ng`

- `ng new`: Crea un nuovo progetto Angular.
- `ng generate` (o semplicemente `ng g`): Genera componenti.
- `ng serve`: Avvia il server di sviluppo locale per il tuo progetto Angular.
- `ng build`: Compila il tuo progetto Angular per la distribuzione.
- `ng test`: Esegue i test unitari definiti nel tuo progetto.
- `ng lint`: Esegue un linter per il codice TypeScript, controllando il tuo codice per errori.
- `ng update`: Aggiorna le dipendenze del tuo progetto Angular.
- `ng add`: Aggiunge librerie e funzionalità esterne al tuo progetto Angular.
- `ng config`: Consente di configurare le impostazioni globali per il tuo progetto Angular.
- `ng doc`: Apre la documentazione ufficiale di Angular nel tuo browser.
- `ng eject`: Estrae la configurazione di Webpack utilizzata da Angular CLI, consentendo una personalizzazione avanzata a spese della facilità d'uso.
- `ng help` (o semplicemente `ng h`): Fornisce informazioni dettagliate sui comandi Angular CLI e le loro opzioni.

## Data and Event Binding

### Data Binding

Il data binding mette in comunicazione TypeScript e HTML.

- One-way (da TypeScript ad HTML): String interpolation, property interpolation.
- Two-way (da TypeScript ad HTML e da HTML ad HTML).

### Event Binding

- Utilizzo di "any" per variabili non tipizzate.

## ngOnInit

La funzione `ngOnInit` è un metodo fondamentale nel ciclo di vita delle applicazioni Angular. Viene utilizzata per inizializzare i componenti dopo la loro creazione ma prima che vengano visualizzati nell'interfaccia utente.

## ngFor

`ngFor` è una direttiva strutturale Angular che ripete una parte del modello HTML tante volte quante sono gli elementi di un elenco iterabile (Collection). È simile a `ngRepeat` in AngularJS.

## ngIf

`ngIf` permette di aggiungere o rimuovere elementi dal DOM. La direttiva `ngClass` è utilizzata per aggiungere o rimuovere classi CSS dagli elementi HTML.

## Parent and Child

### Child

Un componente diventa un "child" quando il suo selettore viene inserito nel componente "parent".

### Parent

Il componente "parent" è l'unico che può cambiare i valori.

## Service

    ogetti che creano dei servizi(scambiano dati)
    non serve il parent senza teeampletate

## injectable

    decoratore che sigifica servizio

se un oggeto implemnta un a interfcia o odogggeto faremo in modo dche sia prensnete sulla classe

## ngf oniy

componete molto importante

## observable

Gli observable sono un concetto chiave nella programmazione reattiva e vengono utilizzati ampiamente in Angular per gestire compiti asincroni,possono sottoscriversi a questi observable per ricevere e gestire i valori emessi.
possono sottoscriversi a questi observable per ricevere e gestire i valori emessi.

- **Observable**: Un oggetto che rappresenta uno stream di dati o eventi che può essere osservato nel tempo.

- **Subscription**: Il meccanismo con cui un osservatore si iscrive a un observable per ricevere notifiche.

- **Observer**: Un oggetto con metodi che definiscono cosa fare quando vengono emessi valori dall'observable. Tipicamente include funzioni come next (per gestire ciascun valore emesso), error (per gestire gli errori) e complete (per gestire il completamento dell'observable).

- **Operatori**: Metodi che possono essere utilizzati per manipolare i dati emessi dagli observable. Consentono di trasformare, filtrare o combinare i dati in vari modi.

## dependecy incetion

  esmpio di codice
  constructor(private LogService:LogService){}

## funzioni localStorage

 ### Importazione del modulo
import { LocalStorageModule, LocalStorageService } from 'angular-2-local-storage';
 ### Configurazione del modulo nel tuo modulo

@NgModule({
  imports: [
    // ...
    LocalStorageModule.forRoot({
      storageType: 'localStorage'
    })
  ],
  // ...
})
export class AppModule { }

### Utilizzo del servizio LocalStorageService
 1. Salvataggio di dati:

Salva un valore nel localStorage
localStorageService.set('key', 'value');
2. Recupero di dati:
Ottieni il valore dal localStorage
const value = localStorageService.get('key');
3. Rimozione di dati:

Rimuovi un valore dal localStorage
localStorageService.remove('key');
4. Verifica dell'esistenza di una chiave:
 Verifica se una chiave esiste nel localStorage
const exists = localStorageService.keys().includes('key');
5. Rimozione di tutti i dati:
Rimuovi tutti i dati dal localStorage
localStorageService.clearAll();
6. Recupero di tutte le chiavi:
 Ottieni tutte le chiavi nel localStorage
const keys = localStorageService.keys();