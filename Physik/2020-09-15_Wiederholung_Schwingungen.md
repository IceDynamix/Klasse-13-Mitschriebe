---
title: "Wiederholung: Schwingungen"
---

## Formeln

$$
\begin{aligned}
    T &= 2 \pi \sqrt{\frac{m}{D}} \\
    \omega &= \frac{2\pi}{T} \\
    x(t) &= \hat{x}\cos{(\omega t)} \\
\end{aligned}
$$

## Aufgabe

![Zeit-Elongation `plot x(t) = 0.025 cos(pi t) from 0 to 6`](img/2020-09-15_08-58-31.png)

In der Abbildung ist das Zeit-Elongations-Diagramm eines Masse-Federpendels gezeigt. Der Pendelkörper hat eine Masse von $0.1kg$.

### Bestimme Schwingungsdauer, Amplitude und Zeit-Elongation

- Schwingungsdauer $T = 2s$
- Amplitude $\hat{x} = 2.5cm$
- Zeit-Elongations-Funktion $x(t) = 0.025m \cdot \cos{(\frac{2\pi}{2s} t)}$

### Bestimme Federhärte

$D = (\frac{2\pi}{T})^2 \cdot m = 0.99 \frac{N}{m}$

### Wo treten absolute Minima/Maxima auf?

- Minima bei $t = 1s, 3s, 5s$
- Maxima bei $t = 2s, 4s, 6s$

### Gib die t-v-Funktion und dessen Diagramm an

- Ableitung $v(t) = \dot{x}(t) = -0.025\pi \frac{m}{s} \cdot \sin{(\frac{\pi}{s} t)}$
- Maximale Geschwindigkeit $\hat{a} = | -0.025\pi \frac{m}{s} |$

![Zeit-Geschwindigkeit `plot v(t) = -0.025pi cos(pi t) from 0 to 6`](img/2020-09-15_09-12-05.png)

### Gib die t-a-Funktion und dessen Diagramm an

- Ableitung $a(t) = \ddot{x}(t) = -0.025\pi^2 \frac{m}{s^2} \cdot \cos{(\frac{\pi}{s} t)}$
- Maximale Beschleunigung $\hat{a} = | -0.025\pi^2 \frac{m}{s^2} |$

![Zeit-Beschleunigung ``plot a(t) = -0.025pi^2 cos(pi t) from 0 to 6``](img/2020-09-18_11-54-39.png)

### Wie verändert sich t-x wenn...

#### die Masse vervierfacht wird?

- Schwingungsdauer $T = 2 \pi \sqrt{\frac{m}{D}} = 2 \pi \sqrt{\frac{0.1kg}{0.99 \frac{N}{m}}} = 4s$
- t-x Funktion $x(t)=\hat{x}\cos{(\frac{2\pi}{T} t)}$
    - $x(t)=0.025m\cos{(\frac{2\pi}{4s} t)}$
- t-v Funktion $\dot{x}(t) = -0.025 \cdot 0.5\pi \frac{m}{s} \cdot \sin{(\frac{0.5 \pi}{s} t)}$
    - Maximale Geschwindigkeit $\dot{x}(1.5s) = $

#### die Amplitude verdoppelt wird?
