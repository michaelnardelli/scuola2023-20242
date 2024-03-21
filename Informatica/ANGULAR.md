`# [ANGULAR](https://angular.io/)  Angular è un framework basato su [Node.js](https://v8.dev/), che funge da strato intermedio tra un sistema operativo e il software che lo utilizza.  Un linguaggio compilato deve essere trasformato in linguaggio macchina prima di essere eseguito, mentre un linguaggio interpretato viene eseguito senza ulteriori trasformazioni su qualsiasi computer.  ## COME INSTALLARE ANGULAR  1. Scaricare ed installare Node.js sul proprio PC. **Nota**: per lo sviluppo, useranno CodeSpaces, quindi non è necessario installare nulla. 2. Installare Angular con il seguente comando:    ```bash    npm install -g @angular/cli`

-   Per aggiornare npm, eseguire il comando:

bashCopy code

`npm install -g npm@10.1.0`

## Siti Utili

-   [Angular Material](https://material.angular.io/)
-   [Bootstrap](https://getbootstrap.com/)
-   [JSON](http://www.json.org/json-it.html)

## Nomi degli Oggetti Angular Trattati per la Divisione

## File Importanti

-   `angular.json`: consente di modificare il nome dell'icona principale.
-   `package.json`

## Cartella `src`

### index.html

-   Template esterno (front-end)

### Component

-   Decoratore (definisce le classi)
-   Equivalente a modularizzare la pagina
-   Facilita il debug
-   Facilita il riutilizzo del codice per la creazione di altre applicazioni
-   Ha un file `.ts` (TypeScript)

### style.css

-   Il CSS opera in cascata (l'ultima parte del codice ha la priorità)
-   Gestisce lo stile della pagina, inclusi immagini e font.

### favicon.ico

-   Si crea durante l'inizializzazione di Angular e può essere personalizzato.

### Cartella `assets`

-   Contiene file multimediali ed è l'unica cartella che rimane una volta che l'applicazione è terminata.

### Cartella `app`

-   Contiene vari oggetti (component) offerti da Angular.
-   Tutti i nomi dei file iniziano con `app.component`.

#### app.component.ts

-   Consente di dichiarare una variabile che può essere utilizzata in altri file.
-   Contiene un file HTML.
-   Contiene un file CSS.
-   Contiene un file spec.ts (test automatici).
-   Il template è una stringa.

## TypeScript

-   Assegnazione delle variabili simile a Java.
-   Gestisce la logica di business.

## Comandi `ng`

-   `ng new`: Crea un nuovo progetto Angular.
-   `ng generate` (o semplicemente `ng g`): Genera componenti.
-   `ng serve`: Avvia il server di sviluppo locale per il tuo progetto Angular.
-   `ng build`: Compila il tuo progetto Angular per la distribuzione.
-   `ng test`: Esegue i test unitari definiti nel tuo progetto.
-   `ng lint`: Esegue un linter per il codice TypeScript, controllando il tuo codice per errori.
-   `ng update`: Aggiorna le dipendenze del tuo progetto Angular.
-   `ng add`: Aggiunge librerie e funzionalità esterne al tuo progetto Angular.
-   `ng config`: Consente di configurare le impostazioni globali per il tuo progetto Angular.
-   `ng doc`: Apre la documentazione ufficiale di Angular nel tuo browser.
-   `ng eject`: Estrae la configurazione di Webpack utilizzata da Angular CLI, consentendo una personalizzazione avanzata a spese della facilità d'uso.
-   `ng help` (o semplicemente `ng h`): Fornisce informazioni dettagliate sui comandi Angular CLI e le loro opzioni.

## Data and Event Binding

### Data Binding

Il data binding mette in comunicazione TypeScript e HTML.

-   One-way (da TypeScript ad HTML): String interpolation, property interpolation.
-   Two-way (da TypeScript ad HTML e da HTML ad HTML).

### Event Binding

-   Utilizzo di "any" per variabili non tipizzate.

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
