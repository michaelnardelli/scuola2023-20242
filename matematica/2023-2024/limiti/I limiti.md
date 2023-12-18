# Introduzione ai Limiti

I limiti sono concetti fondamentali in analisi matematica che descrivono il comportamento di una funzione quando la variabile indipendente si avvicina a un certo valore. Essi forniscono una base per comprendere il concetto di continuità e la derivazione delle funzioni.

## Esercitazione sui Limiti senza Forme di Indecisione

Quando si studiano limiti che non presentano forme di indecisione, si analizzano situazioni in cui la funzione si avvicina in modo definitivo a un valore specifico mentre la variabile indipendente si avvicina a un certo punto.

## Limite di una Funzione Frazione di Polinomi, Forma Indeterminata ∞/∞

Consideriamo la funzione:

\[ f(x) = \frac{3x^2 + 2x - 1}{2x^2 - 5x + 1} \]

Calcoliamo il limite quando \( x \) si avvicina a \( 2 \):

\[ \lim_{{x \to 2}} \frac{3x^2 + 2x - 1}{2x^2 - 5x + 1} \]

Applicando la regola di L'Hôpital:

\[ \lim_{{x \to 2}} \frac{6x + 2}{4x - 5} \]

Sostituendo \( x = 2 \):

\[ \frac{6 \times 2 + 2}{4 \times 2 - 5} = \frac{14}{3} \]

Quindi, il limite è \( \frac{14}{3} \).

## Asintoti Orizzontali e Asintoti Verticali

Consideriamo la funzione:

\[ g(x) = \frac{x^2 + 3x + 2}{x - 1} \]

Questa funzione ha un asintoto verticale in \( x = 1 \) (dovuto al denominatore) e non ha asintoti orizzontali.

## Limite di una Funzione Razionale, Forma Indeterminata 0/0

Consideriamo la funzione:

\[ h(x) = \frac{x^3 - 8}{x^2 - 4} \]

Calcoliamo il limite quando \( x \) si avvicina a \( 2 \):

\[ \lim_{{x \to 2}} \frac{x^3 - 8}{x^2 - 4} \]

Applicando la fattorizzazione:

\[ \lim_{{x \to 2}} \frac{(x - 2)(x^2 + 2x + 4)}{(x - 2)(x + 2)} \]

Semplificando:

\[ \lim_{{x \to 2}} \frac{x^2 + 2x + 4}{x + 2} \]

Sostituendo \( x = 2 \):

\[ \frac{2^2 + 2 \times 2 + 4}{2 + 2} = \frac{12}{4} = 3 \]

Quindi, il limite è \( 3 \).

## Limite di una Funzione Irrazionale, Caso 0/0

Consideriamo la funzione:

\[ k(x) = \frac{\sqrt{x^2 + 1} - 3}{x - 2} \]

Calcoliamo il limite quando \( x \) si avvicina a \( 2 \):

\[ \lim_{{x \to 2}} \frac{\sqrt{x^2 + 1} - 3}{x - 2} \]

Applicando la razionalizzazione del numeratore:

\[ \lim_{{x \to 2}} \frac{(\sqrt{x^2 + 1} - 3)(\sqrt{x^2 + 1} + 3)}{(x - 2)(\sqrt{x^2 + 1} + 3)} \]

Semplificando:

\[ \lim_{{x \to 2}} \frac{x^2 + 1 - 9}{(x - 2)(\sqrt{x^2 + 1} + 3)} \]

Sostituendo \( x = 2 \):

\[ \frac{2^2 + 1 - 9}{(2 - 2)(\sqrt{2^2 + 1} + 3)} = \frac{-6}{0} \]

In questo caso, abbiamo ottenuto una forma indeterminata \( \frac{-6}{0} \), e potrebbe essere necessario applicare ulteriori tecniche o analisi per determinare il limite.

# Appunti sui Limiti Notevoli

I limiti notevoli sono concetti fondamentali nell'ambito del calcolo infinitesimale e della teoria dei limiti. Essi forniscono

metodi standardizzati per determinare il comportamento di una funzione quando la variabile indipendente si avvicina a determinati valori. Di seguito sono riportati alcuni limiti notevoli comuni:

## 1. Limite Fondamentale

lim⁡�→0sin⁡��=1x→0lim​xsinx​=1

Questo limite è di fondamentale importanza e trova ampio utilizzo nelle dimostrazioni e nelle derivate di funzioni trigonometriche.

## 2. Limite dell'Esponenziale

lim⁡�→0(1+�)1�=�x→0lim​(1+x)x1​=e

Dove �e è la costante di Nepero. Questo limite è alla base della definizione di �e e della funzione esponenziale.

## 3. Limite della Funzione Logaritmica

lim⁡�→0log⁡(1+�)�=1x→0lim​xlog(1+x)​=1

Questo limite è correlato al limite dell'esponenziale e gioca un ruolo chiave nella derivazione della funzione logaritmica.

## 4. Limite della Tangente Iperbolica

lim⁡�→0tanh⁡��=1x→0lim​xtanhx​=1

Questo limite è utile nelle analisi che coinvolgono funzioni iperboliche.

## 5. Limite del Seno Iperbolico

lim⁡�→0sinh⁡��=1x→0lim​xsinhx​=1

Analogamente al limite del seno trigonometrico, questo è specifico per la funzione seno iperbolico.

## 6. Limite del Prodotto

Se lim⁡�→��(�)=�limx→a​f(x)=L e lim⁡�→��(�)=�limx→a​g(x)=M, allora:

lim⁡�→�(�(�)⋅�(�))=�⋅�x→alim​(f(x)⋅g(x))=L⋅M

Questo principio si estende anche al quoziente di funzioni quando �≠0M=0.

## 7. Limite della Funzione Esponenziale Composta

lim⁡�→���(�)=�lim⁡�→��(�)x→alim​ef(x)=elimx→a​f(x)

Questo principio è utile quando si trattano funzioni esponenziali composte.
