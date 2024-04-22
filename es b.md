  
Ecco una versione rivisitata delle soluzioni tipo B, riformattata per renderla più chiara:

---

## Soluzioni tipo B P

Dati iniziali:

- Potenza della portante (Pp): 33 dBm
- Potenza della portante (Pp): 1 mW

Calcolo della potenza della portante:

10𝑃𝑝dBm/10=𝑃𝑝=1033/10=1,99526 W10PpdBm​/10=Pp=1033/10=1,99526W

Calcolo dell'ampiezza della portante (Ap):

𝐴𝑝=2𝑅𝑃2=2×50 W×1,99526 W2=14,1254 VAp=22RP​​=22×50W×1,99526W​​=14,1254V

Conversione dell'ampiezza della portante in dBmV:

𝐴𝑝dBmV=20log⁡10(𝐴𝑝1 mV)=20log⁡10(14,1254 V1 mV)=83 dBmVApdBmV​=20log10​(1mVAp​)=20log10​(1mV14,1254V​)=83dBmV

Calcolo del fattore di modulazione di frequenza (Kf):

𝐾𝑓=𝐾𝑤2𝜋=47124,8622𝜋=9,375 KHz/VKf=2πKw​=2π47124,862​=9,375KHz/V

Calcolo dell'ampiezza di modulazione (Am):

𝐴𝑚=𝐷𝑓𝐾𝑓=75 KHz9,375 KHz/V=8 VAm=KfDf​=9,375KHz/V75KHz​=8V

Conversione dell'ampiezza di modulazione in dBmV:

𝐴𝑚dBmV=20log⁡10(𝐴𝑚1 mV)=20log⁡10(8 V1 mV)=78,062 dBmVAmdBmV​=20log10​(1mVAm​)=20log10​(1mV8V​)=78,062dBmV

Calcolo della potenza di modulazione (Pm):

𝑃𝑚=𝐴𝑚22𝑅=822×50=0,64 WPm=2RAm2​=2×5082​=0,64W

Conversione della potenza di modulazione in dBm:

𝑃𝑚dBm=10log⁡10(𝑃𝑚1 mW)=10log⁡10(0,64 W1 mW)=28,062 dBmPmdBm​=10log10​(1mWPm​)=10log10​(1mW0,64W​)=28,062dBm

Calcolo della differenza di frequenza (Df):

𝐷𝑤=2𝜋𝐷𝑓=2𝜋×75 KHz=471,24 Kr/sDw=2πDf=2π×75KHz=471,24Kr/s

Calcolo del rapporto tra la differenza di frequenza e la frequenza della modulante (DqFM):

𝐷𝑞𝐹𝑀=𝐷𝑓𝑓𝑚=75 KHz10 KHz=7,5DqFM=fmDf​=10KHz75KHz​=7,5

Le formule per calcolare la frequenza e la pulsazione modulate sono le seguenti:

𝑓𝐹𝑀(𝑡)=𝑓𝑝+𝐾𝑓⋅𝑣𝑚(𝑡)=𝑓𝑝+𝐾𝑓⋅𝐴𝑚⋅cos⁡(𝑤𝑚⋅𝑡)=𝑓𝑝+𝐷𝑓⋅cos⁡(𝑤𝑚⋅𝑡)fFM(t)=fp+Kf⋅vm(t)=fp+Kf⋅Am⋅cos(wm⋅t)=fp+Df⋅cos(wm⋅t) 𝑤𝐹𝑀(𝑡)=𝑤𝑝+𝐾𝑤⋅𝐴𝑚⋅cos⁡(𝑤𝑚⋅𝑡)=𝑤𝑝+𝐷𝑤⋅cos⁡(𝑤𝑚⋅𝑡)wFM(t)=wp+Kw⋅Am⋅cos(wm⋅t)=wp+Dw⋅cos(wm⋅t) 𝑞𝐹𝑀(𝑡)=∫𝑤𝐹𝑀(𝑡) 𝑑𝑡=𝑤𝑝⋅𝑡+𝐷𝑞⋅sin⁡(𝑤𝑚⋅𝑡)qFM(t)=∫wFM(t)dt=wp⋅t+Dq⋅sin(wm⋅t)

Dove:

- 𝐷𝑞=𝑚𝑓=𝑏=7,5Dq=mf=b=7,5 rad
- 𝑤𝑝=2𝜋𝑓𝑝=2𝜋×105 MHz=659,73 Mr/swp=2πfp=2π×105MHz=659,73Mr/s

Calcolo del periodo minimo e massimo del segnale a fisarmonica:

𝑓max=𝑓𝑝+𝐷𝑓=105 MHz+75 KHz=105,075 MHzfmax​=fp+Df=105MHz+75KHz=105,075MHz 𝑇min=1𝑓max=1105,075 MHz=9,517 nsecTmin​=fmax​1​=105,075MHz1​=9,517nsec

𝑓min=𝑓𝑝−𝐷𝑓=105 MHz−75 KHz=104,925 MHzfmin​=fp−Df=105MHz−75KHz=104,925MHz 𝑇max=1𝑓min=1104,925 MHz=9,5306 nsecTmax​=fmin​1​=104,925MHz1​=9,5306nsec

Banda del segnale FM:

𝐵𝐹𝑀=2×(𝑓𝑚+𝐷𝑓)=2×(10 KHz+75 KHz)=170 KHzBFM=2×(fm+Df)=2×(10KHz+75KHz)=170KHz

Possiamo aumentare la banda fino a 180 KHz come previsto dalle norme. Calcoliamo ora le armoniche significative. Poiché il testo non specifica il rumore elettromagnetico ambientale, assumiamo di poter trascurare le armoniche con un'ampiezza inferiore al 5% della portante. Nella tabella allegata, notiamo che per 𝑏=7,5b=7,5, la decima armonica laterale (sia superiore che inferiore) è trascurabile, essendo pari al 4% della portante.

La riga centrale dello spettro del segnale FM non può essere chiamata portante, poiché la sua ampiezza non è pari ad Ap, ma:

𝐴0=𝐴𝑝×𝐽0(𝑏)=14,125𝑉×𝐽0(0,27)=3,81𝑉A0=Ap×J0(b)=14,125V×J0(0,27)=3,81V

𝑓0=𝑓𝑝=105 MHzf0=fp=105MHz

La prima riga laterale inferiore ha un'ampiezza di:

𝐴1𝐿=𝐴𝑝×𝐽1(𝑏)=14,125𝑉×𝐽1(0,14)=1,98𝑉A1L=Ap×J1(b)=14,125V×J1(0,14)=1,98V

𝑓1𝐿=𝑓𝑝−𝑓𝑚=105 MHz−10 KHz=104,9 MHzf1L=fp−fm=105MHz−10KHz=104,9MHz

L'ampiezza della prima riga laterale superiore è uguale a quella inferiore, mentre la sua frequenza è:

𝑓1𝑈=𝑓𝑝+𝑓𝑚=105 MHz+10 KHz=105,1 MHzf1U=fp+fm=105MHz+10KHz=105,1MHz

E così via, per tutte le altre armoniche laterali.