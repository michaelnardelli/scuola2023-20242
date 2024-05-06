## Soluzioni tipo A P

Pp|dBm=31dBm; Pp = 1mW.

10(𝑃𝑝∣𝑑𝐵𝑚/10)10(Pp∣dBm/10) = 1mW.

10(31/10)10(31/10) = 1,2589W; PP =

(𝐴𝑃𝑒𝑓𝑓𝑅)2(R​APeff​​)2 = (𝐴𝑃2)2/𝑅(2​AP​)2/R = (𝐴𝑃)2/2𝑅(AP)2/2R da cui caviamo: Ap = (2𝑅𝑃𝑝)(2RPp​) = (2(40𝑊∗1,2589𝑊))(2(40W∗1,2589W)​) = 10,036V;

Ap|dBmV=20Log(Ap/1mV)=20Log(10,036V/1mV)=80,03 dBmV ; Pm|dBm=28,4703dBm da cui:

Pm = 1mW. 10(𝑃𝑚∣𝑑𝐵𝑚/10)10(Pm∣dBm/10)= 1mW.

10(28,4703/10)10(28,4703/10)=0,7031W; Am = (2𝑅𝑃𝑚)(2RPm​)​= (2∗40𝑊∗0,7031𝑊)(2∗40W∗0,7031W)​ = 7,5V; Df=75KHz ; Dw=2πDf=471,24Kr/s ; Kf =Df/Am = 75KHz /7,5V = 10KHz/V; Kw = 2πKf =

= 2𝜋∗(10𝐾𝐻𝑧/𝑉)2π∗(10KHz/V) =62,83K(r/s)/V; Dq=Df/fm = 75KHz/12,5KHz = 6; fFM(t)=fp + Kf * vm(t) =

= fp + Kf * Am * cos(wmt)=fp + Df * cos(wmt); wFM(t)=wp + Kw * Am * cos(wmt)= wp + Dw * cos(wmt);

qFM(t)=∫wFM(t)dt = wp * t + Dq * sen(wmt); Dq = mf = b = 6 = 6rad; wp = 2𝜋𝑓𝑝2πfp =2𝜋∗91𝑀𝐻𝑧2π∗91MHz = 571,77 Mr/s;

Calcoliamoci ora il periodo minimo e massimo del segnale “a fisarmonica”: fmax= fp + Df = 91MHz + 75KHz = 91,075MHz; Tmin = 1/fmax= 1/(91,075MHz) = 10,97996nsec;

fmin= fp - Df = 91MHz - 75KHz = 90,925MHz; Tmax=1/fmin= 1/(90,925MHz) = 10,9981nsec; periodo della modulante: Tm =1/fm =1/12,5KHz=80msec; Tm * wp =wp/fm =2𝜋∗𝑓𝑝/𝑓𝑚2π∗fp/fm =2𝜋∗91𝑀𝐻𝑧/12,5𝐾𝐻𝑧2π∗91MHz/12,5KHz = 45741,59rad; è ovvio che non potremo tracciare dei grafici realistici dato che le variazioni di frequenza e di fase del segnale modulato sono piccolissime. Dovremo tracciare dei diagrammi didascalici, ma con l'accortezza di mettere le scale corrette in ascissa ed in ordinata, e quotando i valori significativi. Banda del segnale FM: BFM=2 * (fm + Df) = 2 * (12,5KHz + 75KHz) = 175KHz;

Possiamo aumentarla d'un pochino fino a 180KHz di banda netta; bmax= B/(2fm) - 1 = 180𝐾/(2∗12,5𝐾)180K/(2∗12,5K)

– 1= 6,2; calcoliamo ora le armoniche significative: poiché il testo non specifica il rumore elettromagnetico ambientale, facciamo l'ipotesi di poter trascurare le armoniche aventi ampiezza inferiore al 5% della portante. Sulla tabella allegata notiamo in corrispondenza di b = 6 che la nona armonica laterale (sia superiore che inferiore) è trascurabile dato che vale il 2% della portante. La riga centrale dello spettro del segnale FM non si può chiamare portante perché la sua ampiezza non vale Ap bensì: A0 = Ap * J0(b)=10,036V * J0(0,15)=1,5V ed ovviamente ha frequenza pari ad fp= 91MHz;

mentre la prima riga laterale inferiore ha ampiezza A1L=Ap * J1(b)=10,04V * J1(-0,28)=-2,81V; la sua frequenza vale f1L=fp - fm = 91MHz – 12,5KHz = 90,9875MHz ; ovviamente l'ampiezza della prima riga laterale superiore vale