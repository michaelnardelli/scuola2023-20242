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

















