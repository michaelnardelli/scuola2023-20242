Le VLAN (Virtual LAN) consentono di suddividere una rete fisica in più segmenti logici, migliorando la gestione e l'efficienza complessiva della rete. Ecco alcune nozioni di base:

## 1. Definizione di VLAN

Una VLAN è una rete logica creata all'interno di una rete fisica, consentendo la comunicazione tra dispositivi come se fossero sulla stessa rete, anche se fisicamente separati.

## 2. Vantaggi delle VLAN

- **Sicurezza:** Isolamento logico tra gruppi di dispositivi.
- **Efficienza:** Suddivisione della rete in base alle esigenze.
- **Flessibilità:** Possibilità di modificare la topologia della rete facilmente.


## 3. come si struttura la connessione 
## 4. numero
-=4092

# esempio di tabella 
+--------+--------------+----------------------+------------------+
| Numero | Nome VLAN    | Descrizione         | Indirizzo IP     |
+--------+--------------+----------------------+------------------+
| 10     | Sales        | Reparto Vendite      | 192.168.10.1     |
| 20     | Marketing    | Reparto Marketing    | 192.168.20.1     |
| 30     | IT           | Reparto IT           | 192.168.30.1     |
| 40     | Guest        | Ospiti               | 192.168.40.1     |
+--------+--------------+----------------------+------------------+



# comando per farli
Router>enable
Router#vlan database
% Warning: It is recommended to configure VLAN from config mode,
as VLAN database mode is being deprecated. Please consult user
documentation for configuring VTP/VLAN in config mode.
Router(vlan)#vlan 10 name palazina
VLAN 10 modified:
Name: palazina
N