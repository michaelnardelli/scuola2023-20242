# [ANGULAR](https://angular.io/)

E un framework( In informatica, piattaforma che funge da strato intermedio tra un sistema operativo e il software che lo utilizza.)
é basato su [node.js](https://v8.dev/)

Un linguaggio compilato deve prima essere trasformato in linguaggio macchina prima di essere eseguito.

Un linguaggio interperetato viene eseguto senza modifica reasformazione su qualsiasi pc

## COME INSTALLARE ANGULAR

1. scaricare ed installare Nodejs sul proprio PC **NB: per lo sviluppo i useranno codespaces, quindi non è necessario installare nulla.**
2. Insallare angular
'''
npm install -g @angular/cli
'''
    - per aggiornagre npm
        '''
        npm install -g npm@10.1.0
        '''

## siti utili

- [ANGULAR MATERIAL](https://material.angular.io/)
- [Bootstrap](https://getbootstrap.com/)
- [JSON](http://www.json.org/json-it.html)

## Nomi oggeti angular tratiti per dividere

## FILE IMPORTANTI

- angular.json
  - puoi camibare il nome della icona principale
- package.json

## CARTELLA SCR

### INDEX.HTML

- teamplate eseterno(front-end)

### COMPONET

- decoratore(defisce le classi)
- uguale ad modulare la paginina
- rende più facile il debug
- più facile per riutilizare il codice in una eventuale creazione di una altra aplicazione
- ha un file ts(typescript)

### STYLE.CSS

- CSS lavora in cascating(cioè la ultima parte del codice a ragione )
- style della pagina
  - img
    -fonnt

### FAVICON.ICO

- si crea con inzialiazione di angulatr
- si puo camiare

### CARTELLA DI ASSSETS

- una volta finita l'applicazione e l'unica cartella che rimane
- file multimediali

### CARTELLA APP

- vari oggeti(componet) che offre angular
- tutti inizano con app.componet

#### APP.COMPONENT.TS

- diciari una varibile e la puoi utilizare su un altro file
- ha un file html
- ha un file css
- ha un file spec.ts
    -test automatici
- template=stringa

## typescrit

- assegazione delle varibili tipo java
- bussies logic

## ng

### comandi

- **ng new**: Crea un nuovo progetto Angular.
- **ng generate (o semplicemente ng g)**: Genera componenti.
- **ng serve**: Avvia il server di sviluppo locale per il tuo progetto Angular.
- **ng build**: Compila il tuo progetto Angular per la distribuzione. ì
- **ng test**: Esegue i test unitari definiti nel tuo progetto u
- **ng lint**: Esegue linter per il codice TypeScript, controllando il tuo codice per errori
- **ng update**: Aggiorna le dipendenze del tuo progetto Angular,
- **ng add**: Aggiunge librerie e funzionalità esterne al tuo progetto Angular.
- **ng config**: Consente di configurare le impostazioni globali per il tuo progetto Angular
- **ng doc**: Apre la documentazione ufficiale di Angular nel tuo browser.
- **ng eject**: Estrae la configurazione di Webpack utilizzata da Angular CLI, consentendo una personalizzazione avanzata, ma a spese della facilità d'uso.
- **ng help** (o semplicemente `ng h`): Fornisce informazioni dettagliate sui comandi Angular CLI e le loro opzioni.

## DATA AND EVENT BINDIGN

### DATA binding

- mette in comunicazione ts e html
  - one way(da ts ad html).
    -string interoplation
    -propiety interoplation
  - two way(da ts ad html, da html ad html ).

 ![one way vs two](https://www.bing.com/images/search?view=detailV2&ccid=VTafYN3n&id=0E605EF03F9BEE20193F7FDA5B70A563DC198007&thid=OIP.VTafYN3nqpJa_wGRuV7mKgHaEV&mediaurl=https%3a%2f%2fsandroroth.com%2fassets%2fblog%2freact-two-way-data-binding%2fdata-binding.png&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.55369f60dde7aa925aff0191b95ee62a%3frik%3dB4AZ3GOlcFvafw%26pid%3dImgRaw%26r%3d0&exph=853&expw=1456&q=one+way+data+binding+vs+two+way&simid=608006106544758864&FORM=IRPRST&ck=51251971E3E6F7E0CFA1AB940098D88E&selectedIndex=1)

### EVENT BINDIGN

- any=varibile di quelace tipo non tipizata

## ngOnInit

La funzione ngOnInit è un metodo di lifecycle (ciclo di vita) fondamentale nelle applicazioni Angular. È utilizzata per inizializzare componenti dopo che sono stati creati ma prima che vengano visualizzati nell'interfaccia utente.
