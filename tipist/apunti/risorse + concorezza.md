ncondivisone
	collaborazione
	compunzione
mutua esclusione
	per garantire correttezza e coerenza, efficienza
tecniche/strumenti
- sistema operativo(basso livello)
- programmatore(alto livello)

![[Pasted image 20240206094100.png]]
## accesso in muta esclusione 
### sezione critiche
1) richiesta(porta ad attese)
2) utilizzo 
3) rilascio della risorsa(porta ad risveglio di processi in attesa)
### DEF SEZIONE CRITICA 
Critica:
	codice in cui si accede a un dato in mutua esclusione
	![[Pasted image 20240206094122.png]]
## Esempio 
Dato condiviso x  intero
![[Pasted image 20240206094136.png]]
x=x+1
1)ram-->cpu(alu)[lettura in ram]
2)modifica-->x=x+1 [cpu] (alu)
3)cpu-->ram(scrittura


se le operazioni non sono svolte in muta esclusione il risultato  finale non portebbe essere coerente



x++;(java)
assembly
{
1. lettura x ram-->
2. inex(alu)
3. scrututa x inex cpu-->ram
}
 il processo lo si può interrompere 
## sezione critica
### gestione sezione critica
- interuzione
- semafori
	- spinlokc=boleani=brinari
	- interi=valori inreri
<disabilita interna>
Sc
<riabil inerna>



